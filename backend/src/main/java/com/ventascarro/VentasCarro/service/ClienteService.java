package com.ventascarro.VentasCarro.service;

import com.ventascarro.VentasCarro.model.Cliente;
import com.ventascarro.VentasCarro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //Mostrar clientes
    public List<Cliente> getAllClients(){
        return clienteRepository.findAll();
    }

    //Crear cliente.
    public Cliente createClient(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    //Editar cliente
    public Cliente updateClient(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    //Eliminar cliente
    public void deleteClient(Integer id){
        clienteRepository.deleteById(id);
    }
}