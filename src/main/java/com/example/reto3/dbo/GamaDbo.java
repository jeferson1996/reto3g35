package com.example.reto3.dbo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GamaDbo {

    private int idGama;

    private String name;

    private String description;

}
