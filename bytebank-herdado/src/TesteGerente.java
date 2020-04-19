public class TesteGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Tauany Zanca");
        g1.setCpf("23223222300");
        g1.setSalario(5.000);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(123456);
        boolean autenticou = g1.autentica(123456);
        System.out.println("Funcionario Autenticado: " + autenticou);






    }
}
