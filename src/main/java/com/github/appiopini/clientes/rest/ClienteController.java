package com.github.appiopini.clientes.rest;

import com.github.appiopini.clientes.model.entity.Cliente;
import com.github.appiopini.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {


    private final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvat( @RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

}
