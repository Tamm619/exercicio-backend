package br.com.mateusg.dao;

import br.com.mateusg.domain.Cliente;

import java.util.Collection;

/**
 * @author mateus.goncalves
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
