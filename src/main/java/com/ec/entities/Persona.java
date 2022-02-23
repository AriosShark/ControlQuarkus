package com.ec.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
@Data
public class Persona{

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;




}
