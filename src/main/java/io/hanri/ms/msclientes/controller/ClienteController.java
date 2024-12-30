package io.hanri.ms.msclientes.controller;

import io.hanri.ms.msclientes.entity.Cliente;
import io.hanri.ms.msclientes.services.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cliente/")
public class ClienteController {

    @Autowired
    ServiceCliente serviceCliente = new ServiceCliente();

    @GetMapping("buscarClienteCpf/${cpf}")
    public ResponseEntity<?> findByClientes(@PathVariable("cpf") String cpf) {
        Optional<Cliente> cliente = serviceCliente.findByCpf(cpf);

        if (cliente.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return new ResponseEntity<>(cliente.get(), HttpStatus.OK);
    }
    @PostMapping("salvar")
    public ResponseEntity<?> saveCliente(@RequestBody Cliente cliente) {
        Cliente clientSave = serviceCliente.save(cliente);
        return new ResponseEntity<>(clientSave, HttpStatus.OK);
    }
}
