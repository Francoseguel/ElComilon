package com.alimentosantiago.deliveryapp.model;

import jakarta.persistence.*;

@Entity
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String destino;
}
