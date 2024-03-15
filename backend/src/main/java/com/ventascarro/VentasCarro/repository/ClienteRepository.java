package com.ventascarro.VentasCarro.repository;

import com.ventascarro.VentasCarro.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
