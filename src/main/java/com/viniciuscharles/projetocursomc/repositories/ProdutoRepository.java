package com.viniciuscharles.projetocursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciuscharles.projetocursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
