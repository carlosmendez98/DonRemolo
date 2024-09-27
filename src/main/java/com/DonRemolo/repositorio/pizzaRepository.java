package com.DonRemolo.repositorio;

import com.DonRemolo.entidades.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pizzaRepository extends JpaRepository<Pizza,Integer> {
}
