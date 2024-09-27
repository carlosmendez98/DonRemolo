package com.DonRemolo.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "postre")
public class Postres extends Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_postre")
    private int idPostre;

    @Enumerated(EnumType.STRING)
    private Tamanio tamanio; // Si los postres también tienen tamaño

}
