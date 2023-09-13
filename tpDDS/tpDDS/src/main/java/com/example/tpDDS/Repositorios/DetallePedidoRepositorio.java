package com.example.tpDDS.Repositorios;

import com.example.tpDDS.Entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepositorio extends JpaRepository<DetallePedido,Long> {
}