package com.DonRemolo.repositorio;


import com.DonRemolo.entidades.Postres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postresRepository extends JpaRepository<Postres, Integer> {

}
