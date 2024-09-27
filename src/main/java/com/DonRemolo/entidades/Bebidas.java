package com.DonRemolo.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "bebida")
public class Bebidas extends Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bebida")
    private int idBebida;

    @Enumerated(EnumType.STRING)
    private Tamanio tamanio; // Si las bebidas también tienen tamaño

}