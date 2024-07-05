package com.spring.Ebank.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Compt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_compt;
    private  String type_compt ;
    private float sold_initial ;
    private String date_creation ;


}
