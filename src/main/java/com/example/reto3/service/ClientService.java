package com.example.reto3.service;



import com.example.reto3.model.ClientModel;
import com.example.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener() {
        return clientRepository.findAll();

    }

    public void crear(ClientModel client) {
        if (!clientRepository.existsById(client.getIdClient())) {
            clientRepository.save(client);
        }

    }

}