package br.com.mateusg;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class PessoaServiceTest {

    @Test
    public void deveConterSomenteMulheresNaLista() {
        List<Pessoa> pessoas = PessoaService.populaPessoas();

        List<Pessoa> mulheres = PessoaService.apenasMulheres(pessoas);

        // Verifica que não tem homens
        boolean somenteMulheres = mulheres.stream()
                .allMatch(p -> p.getSexo().equals("F"));

        Assert.assertTrue("A lista contém alguém que não é mulher!", somenteMulheres);
    }
}
