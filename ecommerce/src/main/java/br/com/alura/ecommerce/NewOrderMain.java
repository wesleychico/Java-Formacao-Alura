package br.com.alura.ecommerce;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		try(var dispatcher = new KafkaDispatcher()) {		
			for (var i = 0; i < 100; i++) {
						
				var key = UUID.randomUUID().toString();
				var value = key + ",67523,7894589745";			
				dispatcher.send("ECOMMERCE_NEW_ORDER", key, value);
			
				var email = "Thank you for your order! We are processing your order!";			
				dispatcher.send("ECOMMERCER_SEND_EMAIL", email, value);			
			}
		}
	}	
}