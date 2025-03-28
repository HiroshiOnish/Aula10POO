package dobackaofront;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Hiroshi", "30", 0, "0000");
        Pessoa p3 = new Pessoa("Marcia", "48", 111, "0000");

        p1.setNome("Hiroshi");
        p2.setNome("Hiroshi Onishi");
        p3.setNome("Marcia Onishi");

        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        System.out.println(p3.getNome());
    }
}
