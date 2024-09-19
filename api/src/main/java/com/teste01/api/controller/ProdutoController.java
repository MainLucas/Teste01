package com.teste01.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.teste01.api.entities.Produto;
import com.teste01.api.services.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/pesquisar")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String pesquisar(@RequestParam("nome") String nome, Model model){
        List<Produto> produtos = produtoService.buscarPorNome(nome);
        model.addAttribute("produtos", produtos);
        return "pesquisa";
    }
}
