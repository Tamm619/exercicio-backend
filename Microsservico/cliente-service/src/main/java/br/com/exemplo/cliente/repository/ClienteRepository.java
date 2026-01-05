package br.com.exemplo.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.exemplo.cliente.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
