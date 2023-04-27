package com.example.reto3.service;


import com.example.reto3.model.GamaModel;
import com.example.reto3.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GamaService {

    @Autowired
    GamaRepository gamaRepository;

    public List<GamaModel> obtener() {
        return gamaRepository.findAll();

    }

    public void crear(GamaModel gama) {
        if (!gamaRepository.existsById(gama.getIdGama())) {
            gamaRepository.save(gama);
        }

    }

}