package br.com.mateusg;

import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class Tarefa {

    public static void main(String[] args){
        //Scanner para pegar o valor inserido no console.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um númeor inteiro: ");
        int numeroint = scanner.nextInt(); //primitivo

        //Imprimir valor primitivo
        System.out.println("Valor primitivo: " + numeroint);

        Integer numeroInt = numeroint; //Autoboxing para wrapper

        System.out.println("Valor Wrapper: " + numeroInt);

        scanner.close();
    }
}
