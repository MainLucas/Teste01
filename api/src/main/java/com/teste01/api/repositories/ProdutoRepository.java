package com.teste01.api.repositories;

import com.teste01.api.entities.Produto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> FindByNomeContaininIgnoreCase(String nome);
}
