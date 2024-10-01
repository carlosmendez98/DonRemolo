package com.DonRemolo.Controladores;

import com.DonRemolo.entidades.Postres;
import com.DonRemolo.repositorio.postresRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(name = "/productos")
public class PostresController {
    
    @Autowired
    private postresRepository postresRepository;


    /// LISTADOO POSTRES
    @GetMapping(value = "/postres")
    public List<Postres> listadoPostres(){
        return this.postresRepository.findAll();
    }
    // REGISTAR POSTRES
    @PostMapping(value = "/registrar/postre")
    public Postres registrarPizza(@RequestBody Postres postres){
        return  this.postresRepository.save(postres);
    }
    // OBTENER POSTRES POR ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Postres> pizzaPorId(@PathVariable int id ){
        return postresRepository.findById(id)
                .map(postres ->  ResponseEntity.ok(postres)
                ).orElse(ResponseEntity.notFound().build());

    }

    //MODIFICAR POSTRES
    @PutMapping(value = "modificar/postre")
    public ResponseEntity<Void> modificarPizza(@RequestBody Postres postres ){
        if(this.postresRepository.existsById(postres.getId())){
            postresRepository.save(postres);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }

    }
    // ELIMINAR POSTRES POR ID

    @DeleteMapping(value = "eliminar/{id}")
    public ResponseEntity<Void> eliminarPizza(@RequestBody Postres postres){
        if(this.postresRepository.existsById(postres.getId())) {
            postresRepository.deleteById(postres.getId());
            return ResponseEntity.noContent().build();
        }else{
            return  ResponseEntity.notFound().build();
        }

    }
    
}
