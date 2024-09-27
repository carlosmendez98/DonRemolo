package com.DonRemolo.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "empanada")
public class Empanadas extends Productos {


}
