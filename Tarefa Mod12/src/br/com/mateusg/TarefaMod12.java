package br.com.mateusg;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TarefaMod12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Coletando nomes digitados no console.
        System.out.println("Digite os nomes no formato Nome-S (ex: Ana-F, João-M):");
        String entrada = scanner.nextLine();

        // Separar cada pessoa e seu sexo
        String[] pessoas = entrada.split(",");

        // Criar listas para homens e mulheres
        List<String> mulheres = new ArrayList<>();
        List<String> homens = new ArrayList<>();

        for (String pessoa : pessoas) {
            pessoa = pessoa.trim(); // remove espaços
            String[] partes = pessoa.split("-");

            if (partes.length == 2) {
                String nome = partes[0];
                String genero = partes[1].toUpperCase();

                if (genero.equals("F")) {
                    mulheres.add(nome);
                } else if (genero.equals("M")) {
                    homens.add(nome);
                }
            }
        }

        // Ordenar os dois grupos
        Collections.sort(mulheres);
        Collections.sort(homens);

        // Imprimir os grupos
        System.out.println("\nMulheres:");
        for (String nome : mulheres) {
            System.out.println(nome);
        }

        System.out.println("\nHomens:");
        for (String nome : homens) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
