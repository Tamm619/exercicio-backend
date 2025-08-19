package br.com.mateusg.factory;
import br.com.mateusg.carros.Carro;
import br.com.mateusg.carros.CarroPopular;

/**
 * @author Mateus Gonçalves
 */


public class CarroPopularFactory extends CarroFactory {

    @Override
    public Carro criarCarro() {
        return new CarroPopular();
    }
}
