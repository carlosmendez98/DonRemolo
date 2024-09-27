package com.DonRemolo.repositorio;

import com.DonRemolo.entidades.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface registroRepository  extends JpaRepository<Registro,Integer> {

}
