package com.DonRemolo.Controladores;

import com.DonRemolo.entidades.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.DonRemolo.repositorio.clienteRepository;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/clientes")
public class ClienteController {
    
    private final clienteRepository clienteRepository;

    //LISTADO CLIENTES
    @GetMapping(value = "clientes")
    public List<Cliente> listadoClientes(){
        return clienteRepository.findAll();
    }

    // REGISTAR CLIENTES
    @PostMapping(value = "registrar/cliente")
    public Cliente registrarCliente(@RequestBody Cliente cliente){
        return  this.clienteRepository.save(cliente);
    }
    // OBTENER CLIENTES POR ID
    @GetMapping(value = "cliente/{id}")
    public ResponseEntity<Cliente> clientePorId(@PathVariable int id ){
        return clienteRepository.findById(id)
                .map(cliente ->  ResponseEntity.ok(cliente)
                ).orElse(ResponseEntity.notFound().build());

    }

    //MODIFICAR CLIENTES
    @PutMapping(value = "modificar/cliente")
    public ResponseEntity<Void> modificarCliente(@RequestBody Cliente cliente ){
        if(this.clienteRepository.existsById(cliente.getId_Cliente())){
            clienteRepository.save(cliente);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }

    }
    // ELIMINAR CLIENTES POR ID

    @DeleteMapping(value = "eliminar/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable int id){
        if(this.clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return  ResponseEntity.notFound().build();
        }

    }

}
