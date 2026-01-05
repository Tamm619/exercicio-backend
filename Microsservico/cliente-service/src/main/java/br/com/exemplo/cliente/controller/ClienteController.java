package br.com.exemplo.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.exemplo.cliente.entity.Cliente;
import br.com.exemplo.cliente.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    // Cadastrar cliente
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    // Alterar cliente
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return repository.save(cliente);
    }

    // Pesquisar clientes
    @GetMapping
    public List<Cliente> listar() {
        return repository.findAll();
    }
}
