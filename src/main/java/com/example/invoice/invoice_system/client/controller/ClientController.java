package com.example.invoice.invoice_system.client.controller;

import com.example.invoice.invoice_system.client.domain.Client;
import com.example.invoice.invoice_system.client.dto.request.CreateClientRequest;
import com.example.invoice.invoice_system.client.dto.response.ClientResponse;
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
    public List<ClientResponse> getClients() {
        return clientRepository.findAll().stream().map(Client::toResponse).toList();
    }

    @PostMapping
    public ClientResponse createClient(@RequestBody CreateClientRequest request) {
        Client client = request.toClient();
        return Client.toResponse(clientRepository.save(client));
    }

    // 他にも GET /{id}, PUT /{id}, DELETE /{id} など追加可能
}
