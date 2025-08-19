package br.com.mateusg.carros;

/**
 * @author Mateus Gonçalves
 */

    public class CarroPopular extends Carro {

    @Override
    public void lavar() {
        System.out.println("Carro Popular foi lavado.");
    }

    @Override
    public void revisar() {
        System.out.println("Carro Popular passou por revisão.");
    }

    @Override
    public void abastecer() {
        System.out.println("Carro Popular foi abastecido com gasolina comum.");
    }
}
