package br.com.mateusg.service;

import br.com.mateusg.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao dao;

    public ContratoService(IContratoDao dao) {
        this.dao = dao;
    }

    @Override
    public String salvar() {
        dao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar(Integer id) {
        return dao.buscar(id);
    }

    @Override
    public String atualizar(Integer id, String contrato) {
        return dao.atualizar(id, contrato);
    }

    @Override
    public Boolean excluir(Integer id) {
        return dao.excluir(id);
    }
}
