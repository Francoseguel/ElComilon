// ClienteController.java
package com.alimentosantiago.deliveryapp.controller;

import com.alimentosantiago.deliveryapp.model.Cliente;
import com.alimentosantiago.deliveryapp.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }
}
//(Repite esta estructura para cada entidad cambiando el nombre y la ruta)