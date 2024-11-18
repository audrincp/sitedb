package com.bd.sitebd.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
	ClienteDAO cdao;

    public void inserir(Cliente cli){
        cdao.inserir(cli);
    }

}
