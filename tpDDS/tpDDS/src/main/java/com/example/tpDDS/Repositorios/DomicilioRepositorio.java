package com.example.tpDDS.Repositorios;

import com.example.tpDDS.Entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepositorio extends JpaRepository<Domicilio,Long> {
}