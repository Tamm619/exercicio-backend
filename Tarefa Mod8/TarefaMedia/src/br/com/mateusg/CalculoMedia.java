package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class CalculoMedia {

    static int nota1, nota2, nota3, nota4;
    static double media;

    public static void main(String[] args){
        pegarNotas();
        CalculoNotas();
        ImprimeMedia();
    }

    public static void pegarNotas() {
        nota1 = 8;
        nota2 = 5;
        nota3 = 7;
        nota4 = 9;
    }

    public static void CalculoNotas(){
        media = (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    public static void ImprimeMedia() {
        System.out.println("Média: " + media);
    }
}
