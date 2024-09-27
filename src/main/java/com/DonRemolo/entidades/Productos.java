package com.DonRemolo.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass() // esta es una clase abstracta para evitar duplicidad
@Data
public abstract class Productos {

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "sabor")
    private String sabor;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio")
    private double precio;

}
