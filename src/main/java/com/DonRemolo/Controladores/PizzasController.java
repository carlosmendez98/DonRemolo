package com.DonRemolo.Controladores;

import com.DonRemolo.entidades.Pizza;
import com.DonRemolo.repositorio.pizzaRepository;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(name = "/productos")
public class PizzasController {


    @Autowired
    private pizzaRepository  pizzaRepository;

    /// LISTADOO pizass
    @GetMapping(value = "/pizzas")
    public List<Pizza> listadoPizzas(){
        return this.pizzaRepository.findAll();
    }
// REGISTAR pizza
    @PostMapping(value = "/registrar/pizza")
    public Pizza registrarPizza(@RequestBody Pizza pizza){
        return  this.pizzaRepository.save(pizza);
    }
    // OBTENER PIZZA POR ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Pizza> pizzaPorId(@PathVariable int id ){
        return pizzaRepository.findById(id)
                .map(pizza ->  ResponseEntity.ok(pizza)
                ).orElse(ResponseEntity.notFound().build());

    }

    //MODIFICAR PIZZA
    @PutMapping(value = "modificar/pizza")
    public ResponseEntity<Void> modificarPizza(@RequestBody Pizza pizza ){
        if(this.pizzaRepository.existsById(pizza.getId())){
            pizzaRepository.save(pizza);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }

    }
    // ELIMINAR PIZZA POR ID

@DeleteMapping(value = "eliminar/{id}")
    public ResponseEntity<Void> eliminarPizza(@RequestBody Pizza pizzaid){
    if(this.pizzaRepository.existsById(pizzaid.getId())) {
        pizzaRepository.deleteById(pizzaid.getId());
        return ResponseEntity.noContent().build();
    }else{
        return  ResponseEntity.notFound().build();
    }

}





}



