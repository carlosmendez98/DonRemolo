package com.DonRemolo.repositorio;


import com.DonRemolo.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pedidoRepository extends JpaRepository<Pedido,Integer> {
}
