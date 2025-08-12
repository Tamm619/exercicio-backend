package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class Programa {

    public static void main(String[] args) {
        PessoaFisica pessoafisica = new PessoaFisica("Mateus", "Gonçalves", 21, 12345678910L);
        PessoaJuridica pessoajuridica = new PessoaJuridica("Giovanna", "Lara", 23, 109876543211122L);

        System.out.println("Pessoa Física: " + pessoafisica.getNome() + " " + pessoafisica.getSobrenome() + " idade: " + pessoafisica.getIdade() + " CPF: " + pessoafisica.getCpf());
        System.out.println("Pessoa Jurídica: " + pessoajuridica.getNome() + " " + pessoajuridica.getSobrenome() + " idade: " + pessoajuridica.getIdade() + " CNPJ: " + pessoajuridica.getCnpj());
    }
}
