package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */

public class Pessoa {
    private String nome;
    private String sexo; // "M" ou "F"

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nome + " (" + sexo + ")";
    }
}
