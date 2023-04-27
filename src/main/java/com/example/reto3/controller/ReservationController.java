package com.example.reto3.controller;


import com.example.reto3.model.ReservationsModel;
import com.example.reto3.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    ReservationsService reservationsService;

    @GetMapping("/all")
    public List <ReservationsModel> obtener(){
            return reservationsService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ReservationsModel reservations){
        reservationsService.crear(reservations);
    }



}

