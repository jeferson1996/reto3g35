package com.example.reto3.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;


@Entity
@Table(name = "messages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private int idMessage;

    @Column( name = "text" , length = 250)
    private String messageText;



    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    @JsonIgnoreProperties({"messages","reservations"})
    private CarModel car;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    @JsonIgnoreProperties({"messages","reservations"})
    private ClientModel client;







}
