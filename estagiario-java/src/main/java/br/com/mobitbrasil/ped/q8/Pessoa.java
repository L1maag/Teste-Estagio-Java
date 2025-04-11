package br.com.mobitbrasil.ped.q8;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String email;
    private String telefone;

    // Construtor
    public Pessoa(String nome, Integer idade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
