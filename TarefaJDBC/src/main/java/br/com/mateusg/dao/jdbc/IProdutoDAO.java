package br.com.mateusg.dao.jdbc;

import java.util.List;

import br.com.mateusg.domain.Produto;

public interface IProdutoDAO {

    Integer cadastrar(Produto produto) throws Exception;

    Produto consultar(String nome) throws Exception;

    List<Produto> buscarTodos() throws Exception;

    Integer atualizar(Produto produto) throws Exception;

    Integer excluir(Produto produto) throws Exception;
}
