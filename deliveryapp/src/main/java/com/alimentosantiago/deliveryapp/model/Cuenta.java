package com.alimentosantiago.deliveryapp.model;

import jakarta.persistence.*;

@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Cliente cliente;

    private Double saldo;
}
