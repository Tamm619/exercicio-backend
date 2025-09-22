package br.com.mateusg.dao;

public interface IContratoDao {
    void salvar();
    String buscar(Integer id);
    String atualizar(Integer id, String contrato);
    Boolean excluir(Integer id);
}
