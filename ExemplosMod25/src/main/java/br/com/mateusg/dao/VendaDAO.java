/**
 * 
 */
package br.com.mateusg.dao;

import br.com.mateusg.dao.generic.GenericDAO;
import br.com.mateusg.domain.Venda;
import br.com.mateusg.domain.Venda.Status;
import br.com.mateusg.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Mateus Gonçalves
 *
 */
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

	@Override
	public Class<Venda> getTipoClasse() {
		return Venda.class;
	}

	@Override
	public void atualiarDados(Venda entity, Venda entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setStatus(entity.getStatus());
	}

	@Override
	public void excluir(String valor) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		venda.setStatus(Status.CONCLUIDA);
		super.alterar(venda);
	}
	
	

}
