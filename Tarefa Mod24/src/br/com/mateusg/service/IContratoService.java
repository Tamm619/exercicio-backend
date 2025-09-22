package br.com.mateusg.service;

public interface IContratoService {
    String salvar();
    String buscar(Integer id);
    String atualizar(Integer id, String contrato);
    Boolean excluir(Integer id);
}
