package br.org.generation.lojagames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.org.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Object findAllByNomeContainingIgnoreCase(String nome);
	
	
	
}