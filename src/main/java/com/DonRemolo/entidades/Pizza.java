package com.DonRemolo.entidades;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "pizza")
public class Pizza extends Productos{


    @Enumerated(EnumType.STRING)
    private Tamanio tamanio; // "pequeña", "mediana", "familiar"



}
