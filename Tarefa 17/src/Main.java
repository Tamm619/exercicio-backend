/**
 * @author Mateus Gonçalves
 */
public class Main {
    public static void main(String[] args) {
        Garagem<Carro> garagem = new Garagem<>();

        Honda honda = new Honda("Honda Fit");
        Civic civic = new Civic("Civic 2022");

        garagem.adicionarCarro(honda);
        garagem.adicionarCarro(civic);

        garagem.listarCarros();
    }
}
