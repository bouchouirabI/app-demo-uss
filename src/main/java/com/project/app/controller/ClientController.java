package com.project.app.controller;

import com.project.app.entity.Client;
import com.project.app.provider.ClientProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientProvider clientProvider;

    @PostMapping
    public ResponseEntity add(@RequestBody Client client){
        clientProvider.add(client);
        return new ResponseEntity(HttpStatus.OK);
    }
}
