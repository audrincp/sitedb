package com.bd.sitebd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bd.sitebd.model.Cliente;
import com.bd.sitebd.model.ClienteService;

@Controller
public class CadastroController {
    @Autowired
	private ApplicationContext context;

    @GetMapping("/")
    public String principal(){
        return "principal";
    }

    @GetMapping("/cadastro")
    public String cadastro(Model model){
        model.addAttribute("cliente"
                          , new Cliente("",""));
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastrar(Model model, @ModelAttribute Cliente cli){
        ClienteService cs = context.getBean(ClienteService.class);
        cs.inserir(cli);
        return "sucesso";
    }

}
