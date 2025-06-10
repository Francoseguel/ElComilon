// ClienteRepository.java
package com.alimentosantiago.deliveryapp.repository;

import com.alimentosantiago.deliveryapp.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
