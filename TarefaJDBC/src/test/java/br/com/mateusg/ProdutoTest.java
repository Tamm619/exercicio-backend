package br.com.mateusg;

import java.util.List;

import org.junit.Test;

import br.com.mateusg.dao.jdbc.ProdutoDAO;
import br.com.mateusg.dao.jdbc.IProdutoDAO;
import br.com.mateusg.domain.Produto;

public class ProdutoTest {

    private IProdutoDAO dao = new ProdutoDAO();

    @Test
    public void cadastrarTest() throws Exception {
        Produto p = new Produto("Coca-Cola", 9.99);
        Integer qtd = dao.cadastrar(p);
        assert qtd == 1;
    }

    @Test
    public void consultarTest() throws Exception {
        Produto p = dao.consultar("Coca-Cola");
        assert p != null;
    }

    @Test
    public void atualizarTest() throws Exception {
        Produto p = dao.consultar("Coca-Cola");
        p.setValor(10.50);
        Integer qtd = dao.atualizar(p);
        assert qtd == 1;
    }

    @Test
    public void buscarTodosTest() throws Exception {
        List<Produto> produtos = dao.buscarTodos();
        assert produtos.size() > 0;
    }

    @Test
    public void excluirTest() throws Exception {
        Produto p = dao.consultar("Coca-Cola");
        Integer qtd = dao.excluir(p);
        assert qtd == 1;
    }
}
