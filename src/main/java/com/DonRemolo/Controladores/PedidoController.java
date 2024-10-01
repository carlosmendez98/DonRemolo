package com.DonRemolo.Controladores;

import com.DonRemolo.entidades.Pedido;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.DonRemolo.repositorio.pedidoRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class PedidoController {

    private final pedidoRepository pedidoRepository;

    //LISTADO PEDIDOS
    @GetMapping(value = "/pedidos")
    public List<Pedido> listadoPedidos(){
        return pedidoRepository.findAll();
    }

    // REGISTAR PEDIDOS
    @PostMapping(value = "/registrar/pedido")
    public Pedido registrarPedido(@RequestBody Pedido pedido){
        return  this.pedidoRepository.save(pedido);
    }
    // OBTENER PEDIDOS POR ID
    @GetMapping(value = "pedido/{id}")
    public ResponseEntity<Pedido> pedidoPorId(@PathVariable int id ){
        return pedidoRepository.findById(id)
                .map(pedido ->  ResponseEntity.ok(pedido)
                ).orElse(ResponseEntity.notFound().build());

    }

    //MODIFICAR PEDIDOS
    @PutMapping(value = "modificar/pedido")
    public ResponseEntity<Void> modificarPedido(@RequestBody Pedido pedido ){
        if(this.pedidoRepository.existsById(pedido.getIdPedido())){
            pedidoRepository.save(pedido);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }

    }
    // ELIMINAR PEDIDOS POR ID

    @DeleteMapping(value = "eliminar/{id}")
    public ResponseEntity<Void> eliminarPedido(@PathVariable int idpedido){
        if(this.pedidoRepository.existsById(idpedido)) {
            pedidoRepository.deleteById(idpedido);
            return ResponseEntity.noContent().build();
        }else{
            return  ResponseEntity.notFound().build();
        }

    }
    

}
