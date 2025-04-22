package com.example.invoice.invoice_system.client.controller;

import com.example.invoice.invoice_system.client.domain.Client;
import com.example.invoice.invoice_system.client.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    // 他にも GET /{id}, PUT /{id}, DELETE /{id} など追加可能
}
