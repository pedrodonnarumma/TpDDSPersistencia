package com.example.tpDDS.Repositorios;

import com.example.tpDDS.Entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepositorio extends JpaRepository<Rubro,Long> {
}