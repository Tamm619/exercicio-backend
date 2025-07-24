package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class Tarefa {
    public static void main(String[] args){
//        Criando duas pessoas
        Pessoas pessoa1 = new Pessoas();
        Pessoas pessoa2 = new Pessoas();

//        Setando nome e idade
        pessoa1.nome = "Mateus";
        pessoa1.idade = 21;
        pessoa2.nome = "Giovanna";
        pessoa2.idade = 23;

//        Imprimindo Nomes e idades
        System.out.println("Nome: " + pessoa1.nome + ", " + pessoa1.idade + " anos");
        System.out.println("Nome: " + pessoa2.nome + ", " + pessoa2.idade + " anos");
    }



}
