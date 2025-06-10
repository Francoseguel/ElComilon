// ProveedorRepository.java
package com.alimentosantiago.deliveryapp.repository;

import com.alimentosantiago.deliveryapp.model.Indicador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndicadorRepository extends JpaRepository<Indicador, Long> {}