package br.com.rpires;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.com.rpires.dao.IProdutoDAO;
import br.com.rpires.dao.ProdutoDAO;
import br.com.rpires.domain.Produto;
import br.com.rpires.exceptions.DAOException;
import br.com.rpires.exceptions.MaisDeUmRegistroException;
import br.com.rpires.exceptions.TableException;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDAOTest {

	private IProdutoDAO produtoDao;

	public ProdutoDAOTest() {
		produtoDao = new ProdutoDAO();
	}

	@After
	public void end() throws DAOException {
		Collection<Produto> list = produtoDao.buscarTodos();
		list.forEach(prod -> {
			try {
				produtoDao.excluir(prod.getCodigo());
			} catch (DAOException e) {
				e.printStackTrace();
			}
		});
	}

	@Test
	public void pesquisar() throws MaisDeUmRegistroException, TableException, TipoChaveNaoEncontradaException, DAOException {
		Produto produto = new Produto();
		produto.setCodigo("P1");
		produto.setNome("Produto 1");
		produto.setDescricao("Desc 1");
		produto.setValor(BigDecimal.TEN);
		produto.setCategoria("Eletronicos"); // 🔹 CAMPO NOVO

		produtoDao.cadastrar(produto);

		Produto produtoConsultado = produtoDao.consultar(produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);
		Assert.assertEquals("Eletronicos", produtoConsultado.getCategoria());

		produtoDao.excluir(produto.getCodigo());
	}

	@Test
	public void salvar() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
		Produto produto = new Produto();
		produto.setCodigo("P2");
		produto.setNome("Produto 2");
		produto.setDescricao("Desc 2");
		produto.setValor(BigDecimal.valueOf(20));
		produto.setCategoria("Games"); // 🔹 CAMPO NOVO

		Boolean retorno = produtoDao.cadastrar(produto);
		Assert.assertTrue(retorno);

		Produto produtoConsultado = produtoDao.consultar(produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);
		Assert.assertEquals("Games", produtoConsultado.getCategoria());

		produtoDao.excluir(produto.getCodigo());
	}

	@Test
	public void excluir() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
		Produto produto = new Produto();
		produto.setCodigo("P3");
		produto.setNome("Produto 3");
		produto.setDescricao("Desc 3");
		produto.setValor(BigDecimal.valueOf(30));
		produto.setCategoria("Casa"); // 🔹 CAMPO NOVO

		Boolean retorno = produtoDao.cadastrar(produto);
		Assert.assertTrue(retorno);

		Produto produtoConsultado = produtoDao.consultar(produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);

		produtoDao.excluir(produto.getCodigo());
		produtoConsultado = produtoDao.consultar(produto.getCodigo());
		Assert.assertNull(produtoConsultado);
	}

	@Test
	public void alterar() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
		Produto produto = new Produto();
		produto.setCodigo("P4");
		produto.setNome("Produto 4");
		produto.setDescricao("Desc 4");
		produto.setValor(BigDecimal.valueOf(40));
		produto.setCategoria("Original"); // 🔹 CAMPO NOVO

		Boolean retorno = produtoDao.cadastrar(produto);
		Assert.assertTrue(retorno);

		Produto produtoConsultado = produtoDao.consultar(produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);

		produtoConsultado.setNome("Produto 4 Alterado");
		produtoConsultado.setCategoria("Alterada"); // 🔹 ALTERAÇÃO DO CAMPO NOVO
		produtoDao.alterar(produtoConsultado);

		Produto produtoAlterado = produtoDao.consultar(produtoConsultado.getCodigo());
		Assert.assertNotNull(produtoAlterado);
		Assert.assertEquals("Produto 4 Alterado", produtoAlterado.getNome());
		Assert.assertEquals("Alterada", produtoAlterado.getCategoria());

		produtoDao.excluir(produto.getCodigo());
		produtoConsultado = produtoDao.consultar(produto.getCodigo());
		Assert.assertNull(produtoConsultado);
	}

	@Test
	public void buscarTodos() throws TipoChaveNaoEncontradaException, DAOException {
		Produto produto = new Produto();
		produto.setCodigo("P5");
		produto.setNome("Produto 5");
		produto.setDescricao("Desc 5");
		produto.setValor(BigDecimal.valueOf(50));
		produto.setCategoria("Cat1"); // 🔹 CAMPO NOVO

		Boolean retorno = produtoDao.cadastrar(produto);
		Assert.assertTrue(retorno);

		Produto produto1 = new Produto();
		produto1.setCodigo("P6");
		produto1.setNome("Produto 6");
		produto1.setDescricao("Desc 6");
		produto1.setValor(BigDecimal.valueOf(60));
		produto1.setCategoria("Cat2"); // 🔹 CAMPO NOVO

		Boolean retorno1 = produtoDao.cadastrar(produto1);
		Assert.assertTrue(retorno1);

		Collection<Produto> list = produtoDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);

		list.forEach(prod -> {
			try {
				produtoDao.excluir(prod.getCodigo());
			} catch (DAOException e) {
				e.printStackTrace();
			}
		});

		Collection<Produto> list1 = produtoDao.buscarTodos();
		assertTrue(list1 != null);
		assertTrue(list1.size() == 0);
	}
}
