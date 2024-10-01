package com.DonRemolo.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "postre")
public class Postres extends Productos {



    @Enumerated(EnumType.STRING)
    private Tamanio tamanio; // Si los postres también tienen tamaño

}
