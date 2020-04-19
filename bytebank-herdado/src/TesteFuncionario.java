public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setNome("Wesley Chico");
        f1.setCpf("39621388800");
        f1.setSalario(100.00);

        System.out.println(f1.getNome());
        System.out.println(f1.getBonificacao());



    }
}
