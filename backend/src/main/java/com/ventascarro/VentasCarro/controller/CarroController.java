package com.ventascarro.VentasCarro.controller;

import com.ventascarro.VentasCarro.model.Carro;
import com.ventascarro.VentasCarro.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/carros")
@CrossOrigin(origins = "*")
public class CarroController {

    @Autowired
    private CarroService serviceCr;

    //GET
    @GetMapping
    public List<Carro> listarTodo(){
        return serviceCr.getAllCar();
    }

    //POST
    @PostMapping
    public Carro crear(@RequestBody Carro carro){
        return serviceCr.createCar(carro);
    }

    //PUT (actualizar)
    @PostMapping("editar/{id}")
    public Carro actualizar(@RequestBody Carro carro, @PathVariable Integer id){
        carro.setIdCarro(id);
        return serviceCr.updateCar(carro);
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Integer id){
        serviceCr.deleteCar(id);
    }
}
