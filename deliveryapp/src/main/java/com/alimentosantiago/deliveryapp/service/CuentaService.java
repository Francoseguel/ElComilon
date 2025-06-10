package com.alimentosantiago.deliveryapp.service;

import com.alimentosantiago.deliveryapp.model.Cuenta;
import com.alimentosantiago.deliveryapp.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaService {
    @Autowired
    private CuentaRepository cuentaRepository;

    public List<Cuenta> listarCuenta() {
        return cuentaRepository.findAll();
    }
}

//(Repite esta estructura para cada entidad cambiando el nombre)
