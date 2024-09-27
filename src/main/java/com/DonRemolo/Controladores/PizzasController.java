package com.DonRemolo.Controladores;

import com.DonRemolo.entidades.Pizza;
import com.DonRemolo.repositorio.bebidasRepository;
import com.DonRemolo.repositorio.pizzaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(name = "/productos")
public class PizzasController {


    @Autowired(required = true)
    private pizzaRepository  pizzaRepository;

    /// listado de pizass
    @GetMapping(value = "/pizzas")
    public List<Pizza> listadoPizzas(){
        return this.pizzaRepository.findAll();
    }
// registrar pizza

    @PostMapping(value = "/registrar/pizza")
    public Pizza registrarPizza(@RequestBody Pizza pizza){
        return  this.pizzaRepository.save(pizza);
    }







}



