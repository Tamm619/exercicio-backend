/**
 * 
 */
package br.com.mateusg.dao;

import br.com.mateusg.dao.generic.IGenericDAO;
import br.com.mateusg.domain.Venda;
import br.com.mateusg.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Mateus Gonçalves
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
