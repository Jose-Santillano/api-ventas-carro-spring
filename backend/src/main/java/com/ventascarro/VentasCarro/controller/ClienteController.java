package com.ventascarro.VentasCarro.controller;

import com.ventascarro.VentasCarro.model.Cliente;
import com.ventascarro.VentasCarro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService serviceCt;

    //GET
    @GetMapping
    public List<Cliente> listarTodo(){
        return serviceCt.getAllClients();
    }

    //POST
    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente){
        return serviceCt.createClient(cliente);
    }

    //PUT
    @PostMapping("editar/{id}")
    public Cliente actualizar(@RequestBody Cliente cliente, @PathVariable Integer id){
        cliente.setIdCliente(id);
        return serviceCt.createClient(cliente);
    }

    //Delete
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Integer id){
        serviceCt.deleteClient(id);
    }
}
