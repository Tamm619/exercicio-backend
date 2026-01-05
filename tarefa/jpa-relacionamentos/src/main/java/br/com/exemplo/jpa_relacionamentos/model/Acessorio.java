package br.com.exemplo.jpa_relacionamentos.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    private List<Carro> carros;
}
