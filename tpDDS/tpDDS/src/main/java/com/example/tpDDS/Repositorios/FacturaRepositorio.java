package com.example.tpDDS.Repositorios;

import com.example.tpDDS.Entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepositorio extends JpaRepository<Factura,Long> {
}