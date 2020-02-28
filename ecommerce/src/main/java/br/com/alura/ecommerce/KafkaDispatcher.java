package br.com.alura.ecommerce;

import java.io.Closeable;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

/*
 * kafka - Cria o Consumidor
 */
class KafkaDispatcher implements Closeable{

	private final KafkaProducer<String, String> producer;
	
	KafkaDispatcher(){
		this.producer = new KafkaProducer<String, String>(properties());
	}
	
	private static Properties properties() {
		var properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092"); //Configurando IP do Kafka
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName()); //Trocando a mensagem de String para byte (Key)
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName()); //Trocando a mensagem de String para byte (Value)
		return properties;
	}
	
	void send(String topic, String key, String value) throws ExecutionException, InterruptedException {
		var record = new ProducerRecord<>(topic, key, value);
		Callback callback = (data, ex) -> { //Produzindo novo pedido	
			if(ex != null) {
				ex.printStackTrace();
				return;
			}
			System.out.println("Sucesso enviando " + data.topic() + ":::partition: " + data.partition() + "/ offset: " + data.offset() + "/ timestamp: " + data.timestamp());
		};
			producer.send(record,callback).get();
	}
	
	@Override
	public void close() {
		producer.close();
	}
}
