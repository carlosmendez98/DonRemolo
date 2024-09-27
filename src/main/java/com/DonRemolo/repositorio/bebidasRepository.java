package com.DonRemolo.repositorio;

import com.DonRemolo.entidades.Bebidas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bebidasRepository extends JpaRepository<Bebidas, Integer> {
}
