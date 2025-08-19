package br.com.mateusg;
import br.com.mateusg.carros.Carro;
import br.com.mateusg.factory.CarroFactory;
import br.com.mateusg.factory.CarroLuxoFactory;
import br.com.mateusg.factory.CarroPopularFactory;

/**
 * @author Mateus Gonçalves
 */


public class Main {
    public static void main(String[] args) {
        CarroFactory popularFactory = new CarroPopularFactory();
        CarroFactory luxoFactory = new CarroLuxoFactory();

        Carro carroPopular = popularFactory.criarCarro();
        Carro carroLuxo = luxoFactory.criarCarro();

        System.out.println("=== Serviços do Carro Popular ===");
        carroPopular.lavar();
        carroPopular.revisar();
        carroPopular.abastecer();

        System.out.println("\n=== Serviços do Carro de Luxo ===");
        carroLuxo.lavar();
        carroLuxo.revisar();
        carroLuxo.abastecer();
    }
}
