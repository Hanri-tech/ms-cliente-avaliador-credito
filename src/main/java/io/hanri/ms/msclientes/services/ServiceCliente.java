package io.hanri.ms.msclientes.services;

import io.hanri.ms.msclientes.entity.Cliente;
import io.hanri.ms.msclientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceCliente {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> findByCpf(String cpf) {
        return clienteRepository.findByCpf(cpf);
    }
}
