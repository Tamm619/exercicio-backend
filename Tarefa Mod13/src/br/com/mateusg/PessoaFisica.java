package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class PessoaFisica extends Pessoa{

    private long cpf;

    public PessoaFisica(String nome, String sobrenome, int idade, long cpf) {
        super(nome, sobrenome, idade);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}