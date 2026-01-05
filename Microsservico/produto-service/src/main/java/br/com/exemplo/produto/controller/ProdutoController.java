package br.com.exemplo.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.exemplo.produto.entity.Produto;
import br.com.exemplo.produto.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    // Cadastrar produto
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    // Alterar produto
    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id);
        return repository.save(produto);
    }

    // Pesquisar produtos
    @GetMapping
    public List<Produto> listar() {
        return repository.findAll();
    }
}
