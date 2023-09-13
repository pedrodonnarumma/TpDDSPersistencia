package com.example.tpDDS.Repositorios;

import com.example.tpDDS.Entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepositorio extends JpaRepository<Pedido,Long> {
}