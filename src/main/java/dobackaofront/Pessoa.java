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

}

