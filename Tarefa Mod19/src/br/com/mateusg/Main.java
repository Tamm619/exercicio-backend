package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
@Tabela(value = "tabela")
public class Main {

    public static void main(String[] args) {
        Class<Main> classe = Main.class;

        // Verifica se a annotation @Tabela está presente
        if (classe.isAnnotationPresent(Tabela.class)) {

            // Pega a annotation
            Tabela tabela = classe.getAnnotation(Tabela.class);

            // Lê o valor do atributo "value" e imprime
            System.out.println("Nome da tabela: " + tabela.value());
        } else {
            System.out.println("A classe não possui a anotação @Tabela.");
        }
    }
}
