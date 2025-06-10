package com.alimentosantiago.deliveryapp.service;

import com.alimentosantiago.deliveryapp.model.Cliente;
import com.alimentosantiago.deliveryapp.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}
