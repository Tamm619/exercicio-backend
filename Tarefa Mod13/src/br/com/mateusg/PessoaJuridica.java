package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class PessoaJuridica extends Pessoa{

    private long cnpj;

    public PessoaJuridica(String nome, String sobrenome, int idade, long cnpj) {
        super(nome, sobrenome, idade);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
