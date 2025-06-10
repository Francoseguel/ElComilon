package com.alimentosantiago.deliveryapp.model;

import jakarta.persistence.*;

@Entity
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String contacto;
}
