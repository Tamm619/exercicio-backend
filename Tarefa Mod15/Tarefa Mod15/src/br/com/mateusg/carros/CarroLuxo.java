package br.com.mateusg.carros;

/**
 * @author Mateus Gonçalves
 */
public class CarroLuxo extends Carro {

    @Override
    public void lavar() {
        System.out.println("Carro de Luxo foi lavado com cera especial.");
    }

    @Override
    public void revisar() {
        System.out.println("Carro de Luxo passou por revisão completa.");
    }

    @Override
    public void abastecer() {
        System.out.println("Carro de Luxo foi abastecido com gasolina premium.");
    }
}