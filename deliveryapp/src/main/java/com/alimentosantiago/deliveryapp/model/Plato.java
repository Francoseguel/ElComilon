package com.alimentosantiago.deliveryapp.model;

import jakarta.persistence.*;

@Entity
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    private String proveedor;
}
