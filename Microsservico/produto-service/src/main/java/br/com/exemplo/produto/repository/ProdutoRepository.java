package br.com.exemplo.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.exemplo.produto.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
