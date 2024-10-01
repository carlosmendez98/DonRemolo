package com.DonRemolo.Controladores;

import com.DonRemolo.entidades.Empanadas;
import com.DonRemolo.repositorio.empanadasRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(name = "/productos")
public class EmpanadasController {

    @Autowired
   private empanadasRepository empanadasRepository;


    /// LISTADOO EMPANADAS
    @GetMapping(value = "/empanadas")
    public List<Empanadas> listadoEmpanadas(){
        return this.empanadasRepository.findAll();
    }
    // REGISTAR EMPANADAS
    @PostMapping(value = "/registrar/empanada")
    public Empanadas registrarPizza(@RequestBody Empanadas empanadas){
        return  this.empanadasRepository.save(empanadas);
    }
    // OBTENER EMPANADAS POR ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Empanadas> pizzaPorId(@PathVariable int id ){
        return empanadasRepository.findById(id)
                .map(empanadas ->  ResponseEntity.ok(empanadas)
                ).orElse(ResponseEntity.notFound().build());

    }

    //MODIFICAR EMPANADAS
    @PutMapping(value = "modificar/empanada")
    public ResponseEntity<Void> modificarPizza(@RequestBody Empanadas empanadas ){
        if(this.empanadasRepository.existsById(empanadas.getId())){
            empanadasRepository.save(empanadas);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }

    }
    // ELIMINAR EMPANADAS POR ID

    @DeleteMapping(value = "eliminar/{id}")
    public ResponseEntity<Void> eliminarPizza(@RequestBody Empanadas empanadas){
        if(this.empanadasRepository.existsById(empanadas.getId())) {
            empanadasRepository.deleteById(empanadas.getId());
            return ResponseEntity.noContent().build();
        }else{
            return  ResponseEntity.notFound().build();
        }

    }

}
