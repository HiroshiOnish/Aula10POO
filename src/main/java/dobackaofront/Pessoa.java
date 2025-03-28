package dobackaofront;

public class Pessoa {
    //atributos
    private String nome;
    private String cpf;
    private int idade;
    private String whatsapp;

    //construtores padrao
    public Pessoa() {
        nome = "";
        cpf = "";
        idade = 0;
        whatsapp = "";
    }

    // construtor parametro
    public Pessoa(String nome, String cpf, int idade, String whatsapp) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.whatsapp = whatsapp;

    }
    //metodos

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void apresentar(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(idade);
        System.out.println(whatsapp);
    }

    public String getApresentacao(){
        return (nome+","+cpf+","+idade+","+cpf);
    }

}

