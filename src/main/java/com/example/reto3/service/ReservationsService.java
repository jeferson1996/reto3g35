package com.example.reto3.service;



import com.example.reto3.model.ReservationsModel;
import com.example.reto3.repository.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReservationsService {

    @Autowired
    ReservationsRepository reservationsRepository;

    public List<ReservationsModel> obtener() {
        return reservationsRepository.findAll();

    }

    public void crear(ReservationsModel reservations) {
        if (!reservationsRepository.existsById(reservations.getIdReservation())) {
            reservationsRepository.save(reservations);
        }

    }

}