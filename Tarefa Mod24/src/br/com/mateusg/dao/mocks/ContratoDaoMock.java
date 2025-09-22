package br.com.mateusg.dao.mocks;

import br.com.mateusg.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {
        System.out.println("Contrato salvo no mock");
    }

    @Override
    public String buscar(Integer id) {
        return "Contrato " + id;
    }

    @Override
    public String atualizar(Integer id, String contrato) {
        return contrato;
    }

    @Override
    public Boolean excluir(Integer id) {
        return true;
    }
}
