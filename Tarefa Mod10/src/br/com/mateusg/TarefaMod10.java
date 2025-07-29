package br.com.mateusg;

import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class TarefaMod10 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//        Coletando as notas
        int bim1;
        do {
            System.out.print("Digite a nota do Primeiro Bimestre (0 a 10): ");
            bim1 = scan.nextInt();
            if (bim1 < 0 || bim1 > 10) {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
            }
        } while (bim1 < 0 || bim1 > 10);

        System.out.println("Nota do Primeiro Bimestre armazenada, (" + bim1 + ").");
        System.out.println();

        int bim2;
        do {
            System.out.print("Digite a nota do Primeiro Bimestre (0 a 10): ");
            bim2 = scan.nextInt();
            if (bim2 < 0 || bim2 > 10) {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
            }
        } while (bim2 < 0 || bim2 > 10);

        System.out.println("Nota do Segundo Bimestre armazenada (" + bim2 + ").");
        System.out.println();

        int bim3;
        do {
            System.out.print("Digite a nota do Primeiro Bimestre (0 a 10): ");
            bim3 = scan.nextInt();
            if (bim3 < 0 || bim3 > 10) {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
            }
        } while (bim3 < 0 || bim3 > 10);

        System.out.println("Nota do Terceiro Bimestre armazenada (" + bim3 + ").");
        System.out.println();

        int bim4;
        do {
            System.out.print("Digite a nota do Primeiro Bimestre (0 a 10): ");
            bim4 = scan.nextInt();
            if (bim4 < 0 || bim4 > 10) {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
            }
        } while (bim4 < 0 || bim4 > 10);

        System.out.println("Nota do Quarto Bimestre armazenada (" + bim4 + ").");
        System.out.println();

        CalculoMedia(bim1, bim2, bim3, bim4);
    }

    public static void CalculoMedia(int bim1, int bim2, int bim3, int bim4){
        System.out.println(" **** Calculando Médias **** ");
        System.out.println();
        double media;
        media = (double) (bim1 + bim2 + bim3 + bim4) / 4;
        System.out.println("A média de Notas do aluno é de: " + media);
        System.out.println();
        Aprovacao(media);
    }

    public static void Aprovacao(double media){
        if (media >=7 && media <=10){
            System.out.println("Aluno Aprovado!");
        } else if (media >= 5 && media <= 6){
            System.out.println("Aluno em Recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }
        System.out.println();
        System.out.println();
    }
}
