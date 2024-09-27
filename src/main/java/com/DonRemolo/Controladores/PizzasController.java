package com.DonRemolo.Controladores;

import com.DonRemolo.repositorio.bebidasRepository;
import com.DonRemolo.repositorio.pizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/productos/pizza")
public class PizzasController {


    @Autowired(required = true)
    private pizzaRepository  pizzaRepository;


    @GetMapping(value = )

}



