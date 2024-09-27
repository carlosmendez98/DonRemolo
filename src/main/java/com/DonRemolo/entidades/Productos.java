package com.DonRemolo.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "sabor")
    private String sabor;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio")
    private double precio;

}
