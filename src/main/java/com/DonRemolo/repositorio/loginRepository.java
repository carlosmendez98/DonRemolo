package com.DonRemolo.repositorio;

import com.DonRemolo.entidades.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface loginRepository extends JpaRepository<Login, Object> {

    Optional<Login> findByEmail(String email);
}
