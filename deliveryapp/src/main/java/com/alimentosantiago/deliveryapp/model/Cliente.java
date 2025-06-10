package com.alimentosantiago.deliveryapp.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String direccion;
    private Double saldo;
}
