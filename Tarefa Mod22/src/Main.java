import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();

        System.out.println("Digite pessoas no formato Nome,Sexo (ex: Ana-F). Digite 'fim' para parar:");

        while (true) {
            String linha = scan.nextLine();
            if (linha.equalsIgnoreCase("fim")) break;
            pessoas.add(linha);
        }

        // Filtra só as mulheres
        List<String> mulheres = pessoas.stream()
                .filter(p -> p.endsWith("F"))
                .toList();

        // If / Else
        if (!mulheres.isEmpty()) {
            System.out.println("Mulheres na lista:");
            mulheres.forEach(System.out::println);
        } else {
            System.out.println("Não há mulheres na lista.");
        }
    }
}
