package com.DonRemolo.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "bebida")
public class Bebidas extends Productos {



    @Enumerated(EnumType.STRING)
    private Tamanio tamanio; // Si las bebidas también tienen tamaño

}