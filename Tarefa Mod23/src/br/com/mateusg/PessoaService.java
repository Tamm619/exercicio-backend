package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaService {

    public static List<Pessoa> populaPessoas() {
        return Arrays.asList(
                new Pessoa("Mateus", "M"),
                new Pessoa("Giovanna", "F"),
                new Pessoa("Ana", "F"),
                new Pessoa("João", "M")
        );
    }

    public static List<Pessoa> apenasMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(p -> p.getSexo().equals("F"))
                .collect(Collectors.toList());
    }
}
