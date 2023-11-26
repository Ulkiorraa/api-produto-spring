package br.com.ulkiorra.api.repository;

import br.com.ulkiorra.api.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Métodos CRUD já estão disponíveis pelo JpaRepository
}
