package com.DonRemolo.entidades;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "pizza")
public class Pizza extends Productos{
    @Id
    @Column(name = "idPizza")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPizza;

    @Enumerated(EnumType.STRING)
    private Tamanio tamanio; // "pequeña", "mediana", "familiar"



}
