public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Aluna Maria");
        p3.setNome("Prof. Claúdio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setIdade(48);
        p4.setSexo("F");

        p2.setCurso("ADS");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p3.receberAumento(550.20f);
        p4.mudaTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
