package dobackaofront;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Hiroshi", "30", 0, "0000");
        Pessoa p3 = new Pessoa("Marcia", "48", 111, "0000");

        p1.setNome("Hiroshi");
        p1.setCpf("123456789");
        p1.setIdade(37);
        p1.setWhatsapp("12365478");

        p1.apresentar();
        System.out.println(p1.getApresentacao());

    }
}
