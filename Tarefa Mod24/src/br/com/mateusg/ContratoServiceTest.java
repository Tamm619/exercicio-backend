package br.com.mateusg;

import br.com.mateusg.dao.IContratoDao;
import br.com.mateusg.dao.mocks.ContratoDaoMock;
import br.com.mateusg.service.ContratoService;
import br.com.mateusg.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void deveBuscarContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String contrato = service.buscar(1);
        Assert.assertEquals("Contrato 1", contrato);
    }

    @Test
    public void deveAtualizarContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String contrato = service.atualizar(1, "Novo Contrato");
        Assert.assertEquals("Novo Contrato", contrato);
    }

    @Test
    public void deveExcluirContrato() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        Boolean excluido = service.excluir(1);
        Assert.assertTrue(excluido);
    }
}
