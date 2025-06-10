package com.alimentosantiago.deliveryapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private LocalDateTime fechaHora;
    private String estado;
}
