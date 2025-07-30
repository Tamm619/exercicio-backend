package br.com.mateusg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class TarefaLista {

    public static void main(String[] args){

        funcionalidadeGeral();
    }

    private static void funcionalidadeGeral() {
        Scanner scan = new Scanner(System.in);

        List<String> Masculino = new ArrayList<>();
        List<String> Feminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite seu Nome e Sexo(M ou F) separado por vírgula ex: Mateus,M (ou digite 'sair'): ");
            String info = scan.nextLine();

            if (info.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = info.split(",");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    Masculino.add(nome);
                } else if (sexo.equals("F")) {
                    Feminino.add(nome);
                } else {
                    System.out.println("Sexo inválido. Use M ou F.");
                }
            } else {
                System.out.println("Formato inválido. Use: Nome,M ou Nome,F");
            }
        }

        System.out.println("\n-- Grupo Masculino --");
        for (String nome:Masculino){
            System.out.println(nome);
        }

        System.out.println("\n-- Grupo Feminino --");
        for (String nome : Feminino) {
            System.out.println(nome);
        }

        scan.close();
    }
}
