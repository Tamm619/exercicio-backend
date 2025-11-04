/**
 * 
 */
package br.com.mateusg.services;

import br.com.mateusg.domain.Cliente;
import br.com.mateusg.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Mateus Gonçalves
 *
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
