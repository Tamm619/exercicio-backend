package br.com.rpires;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.com.rpires.dao.ClienteDAO;
import br.com.rpires.dao.IClienteDAO;
import br.com.rpires.domain.Cliente;
import br.com.rpires.exceptions.DAOException;
import br.com.rpires.exceptions.MaisDeUmRegistroException;
import br.com.rpires.exceptions.TableException;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {

	private IClienteDAO clienteDao;

	public ClienteDAOTest() {
		clienteDao = new ClienteDAO();
	}

	@After
	public void end() throws DAOException {
		Collection<Cliente> list = clienteDao.buscarTodos();
		list.forEach(cli -> {
			try {
				clienteDao.excluir(cli.getCpf());
			} catch (DAOException e) {
				e.printStackTrace();
			}
		});
	}

	@Test
	public void pesquisarCliente() throws MaisDeUmRegistroException, TableException,
			TipoChaveNaoEncontradaException, DAOException {

		Cliente cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setEmail("pesquisa@email.com"); // 🔹 CAMPO NOVO

		clienteDao.cadastrar(cliente);

		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
		Assert.assertEquals("pesquisa@email.com", clienteConsultado.getEmail());

		clienteDao.excluir(cliente.getCpf());
	}

	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException,
			MaisDeUmRegistroException, TableException, DAOException {

		Cliente cliente = new Cliente();
		cliente.setCpf(56565656565L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setEmail("salvar@email.com"); // 🔹 CAMPO NOVO

		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);

		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
		Assert.assertEquals("salvar@email.com", clienteConsultado.getEmail());

		clienteDao.excluir(cliente.getCpf());
	}

	@Test
	public void excluirCliente() throws TipoChaveNaoEncontradaException,
			MaisDeUmRegistroException, TableException, DAOException {

		Cliente cliente = new Cliente();
		cliente.setCpf(56565656566L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setEmail("excluir@email.com"); // 🔹 CAMPO NOVO

		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);

		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);

		clienteDao.excluir(cliente.getCpf());
		clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNull(clienteConsultado);
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException,
			MaisDeUmRegistroException, TableException, DAOException {

		Cliente cliente = new Cliente();
		cliente.setCpf(56565656567L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setEmail("antigo@email.com"); // 🔹 CAMPO NOVO

		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);

		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);

		clienteConsultado.setNome("Rodrigo Pires");
		clienteConsultado.setEmail("novo@email.com"); // 🔹 ALTERAÇÃO DO CAMPO NOVO
		clienteDao.alterar(clienteConsultado);

		Cliente clienteAlterado = clienteDao.consultar(clienteConsultado.getCpf());
		Assert.assertNotNull(clienteAlterado);
		Assert.assertEquals("Rodrigo Pires", clienteAlterado.getNome());
		Assert.assertEquals("novo@email.com", clienteAlterado.getEmail());

		clienteDao.excluir(cliente.getCpf());
		clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNull(clienteConsultado);
	}

	@Test
	public void buscarTodos() throws TipoChaveNaoEncontradaException, DAOException {

		Cliente cliente = new Cliente();
		cliente.setCpf(56565656568L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setEmail("lista1@email.com"); // 🔹 CAMPO NOVO

		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);

		Cliente cliente1 = new Cliente();
		cliente1.setCpf(56565656569L);
		cliente1.setNome("Rodrigo");
		cliente1.setCidade("São Paulo");
		cliente1.setEnd("End");
		cliente1.setEstado("SP");
		cliente1.setNumero(10);
		cliente1.setTel(1199999999L);
		cliente1.setEmail("lista2@email.com"); // 🔹 CAMPO NOVO

		Boolean retorno1 = clienteDao.cadastrar(cliente1);
		Assert.assertTrue(retorno1);

		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);

		list.forEach(cli -> {
			try {
				clienteDao.excluir(cli.getCpf());
			} catch (DAOException e) {
				e.printStackTrace();
			}
		});

		Collection<Cliente> list1 = clienteDao.buscarTodos();
		assertTrue(list1 != null);
		assertTrue(list1.size() == 0);
	}
}
