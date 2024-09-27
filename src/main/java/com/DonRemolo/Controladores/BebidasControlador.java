package com.DonRemolo.Controladores;

import com.DonRemolo.entidades.Bebidas;
import com.DonRemolo.repositorio.bebidasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/productos")
public class BebidasControlador {

    @Autowired
    private bebidasRepository bebidasRepository;
//LISTADO DE BEBIDA
    @GetMapping(value = "/bebidas")
    public List<Bebidas> listadoBebidas() {

        return this.bebidasRepository.findAll();
    }
//BUSCAR POR ID BEBIDA
    @GetMapping("/{id}")
    public ResponseEntity<Bebidas> bebidaId(@PathVariable int id) {
        return bebidasRepository.findById(id)
                .map(bebida -> ResponseEntity.ok(bebida))
                .orElse(ResponseEntity.notFound().build());
    }

//REGISTRAR BEBIDA

    @PostMapping(value = "/registrar/bebida")
    public Bebidas registrarBebida(@RequestBody Bebidas bebidas) {
        return this.bebidasRepository.save(bebidas);
    }
//MODIFICAR BEBIDA

    @PutMapping(value = "/modificar/bebida")
    public ResponseEntity<Void> modificarBebida(@RequestBody Bebidas bebidas) {
        if(bebidasRepository.existsById(bebidas.getId())){
            bebidasRepository.save(bebidas);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }

    }

//ELIMINAR BEBIDA

    @DeleteMapping(value = "/eliminar/bebida/{id}")
    public ResponseEntity<Void> eliminarBebida(@PathVariable int id) {
if(bebidasRepository.existsById(id)){
    bebidasRepository.deleteById(id);
    return ResponseEntity.noContent().build();
}else{
    return ResponseEntity.notFound().build();
}

    }
}