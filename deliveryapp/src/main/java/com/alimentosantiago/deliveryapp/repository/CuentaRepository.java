// CuentaRepository.java
package com.alimentosantiago.deliveryapp.repository;

import com.alimentosantiago.deliveryapp.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {}
