package com.ventascarro.VentasCarro.service;

import com.ventascarro.VentasCarro.model.Carro;
import com.ventascarro.VentasCarro.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    //Mostrar
    public List<Carro> getAllCar(){
        return carroRepository.findAll();
    }

    //Crear carro
    public Carro createCar(Carro carro){
        return carroRepository.save(carro);
    }

    //Editar carro
    public Carro updateCar(Carro carro){
        return carroRepository.save(carro);
    }

    //Eliminar carro
    public void deleteCar(Integer id){
        carroRepository.deleteById(id);
    }
}
