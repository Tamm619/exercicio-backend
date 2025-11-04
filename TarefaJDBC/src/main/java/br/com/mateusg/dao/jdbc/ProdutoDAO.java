package br.com.mateusg.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.mateusg.domain.Produto;

public class ProdutoDAO implements IProdutoDAO {

    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection con = ConnectionFactory.getConnection();
        String sql = "INSERT INTO tb_produto (nome, valor) VALUES (?, ?)";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, produto.getNome());
        stm.setDouble(2, produto.getValor());
        Integer result = stm.executeUpdate();
        con.close();
        return result;
    }

    @Override
    public Produto consultar(String nome) throws Exception {
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT id, nome, valor FROM tb_produto WHERE nome = ?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, nome);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            Produto p = new Produto(rs.getLong("id"), rs.getString("nome"), rs.getDouble("valor"));
            con.close();
            return p;
        }
        con.close();
        return null;
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        List<Produto> lista = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT id, nome, valor FROM tb_produto";
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            lista.add(new Produto(rs.getLong("id"), rs.getString("nome"), rs.getDouble("valor")));
        }
        con.close();
        return lista;
    }

    @Override
    public Integer atualizar(Produto produto) throws Exception {
        Connection con = ConnectionFactory.getConnection();
        String sql = "UPDATE tb_produto SET nome = ?, valor = ? WHERE id = ?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, produto.getNome());
        stm.setDouble(2, produto.getValor());
        stm.setLong(3, produto.getId());
        Integer result = stm.executeUpdate();
        con.close();
        return result;
    }

    @Override
    public Integer excluir(Produto produto) throws Exception {
        Connection con = ConnectionFactory.getConnection();
        String sql = "DELETE FROM tb_produto WHERE id = ?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setLong(1, produto.getId());
        Integer result = stm.executeUpdate();
        con.close();
        return result;
    }
}
