package com.teste01.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste01.api.entities.Produto;
import com.teste01.api.repositories.ProdutoRepository;
    

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    public List<Produto> buscarPorNome (String nome){
        return produtoRepository.FindByNomeContaininIgnoreCase(nome);
    }
}
