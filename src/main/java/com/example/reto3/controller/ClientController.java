package com.example.reto3.controller;



import com.example.reto3.model.ClientModel;
import com.example.reto3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {


    @Autowired
    ClientService clientService;


    @GetMapping("/all")
    public List <ClientModel>obtener() {
        return clientService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ClientModel client){
        clientService.crear(client);
    }

}

