package com.ventascarro.VentasCarro.repository;

import com.ventascarro.VentasCarro.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Integer> {
}
