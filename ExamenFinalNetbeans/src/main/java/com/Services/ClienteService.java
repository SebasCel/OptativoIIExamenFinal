package com.Services;

import com.Infraestructure.DbManagment.Persistences.ClienteRepository;
import com.Infraestructure.DbManagment.Models.Cliente;
public class ClienteService {
    private ClienteRepository clienteRepository;
    
    public ClienteService (ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}
