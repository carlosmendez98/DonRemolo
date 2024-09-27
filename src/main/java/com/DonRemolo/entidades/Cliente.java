package com.DonRemolo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Cliente;


    private String email;
    private String telefono;
    private String direccion;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;  // Un cliente puede tener muchos pedidos
}
