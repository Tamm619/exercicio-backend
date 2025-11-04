/**
 * 
 */
package br.com.mateusg.services;

import br.com.mateusg.dao.IProdutoDAO;
import br.com.mateusg.domain.Produto;
import br.com.mateusg.services.generic.GenericService;

/**
 * @author Mateus Gonçalves
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
