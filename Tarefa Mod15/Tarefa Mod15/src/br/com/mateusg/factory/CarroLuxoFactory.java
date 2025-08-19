package br.com.mateusg.factory;
import br.com.mateusg.carros.Carro;
import br.com.mateusg.carros.CarroLuxo;

/**
 * @author Mateus Gonçalves
 */

public class CarroLuxoFactory extends CarroFactory {

    @Override
    public Carro criarCarro() {
        return new CarroLuxo();
    }
}