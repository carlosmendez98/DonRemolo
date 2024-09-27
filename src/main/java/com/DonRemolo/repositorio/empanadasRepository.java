package com.DonRemolo.repositorio;


import com.DonRemolo.entidades.Empanadas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empanadasRepository extends JpaRepository<Empanadas, Integer>{

}
