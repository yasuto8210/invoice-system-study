package com.example.invoice.invoice_system.client.controller;

import com.example.invoice.invoice_system.client.domain.Client;
import com.example.invoice.invoice_system.client.dto.request.CreateClientRequest;
import com.example.invoice.invoice_system.client.dto.response.ClientResponse;
import com.example.invoice.invoice_system.client.repository.ClientRepository;
import com.example.invoice.invoice_system.client.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<ClientResponse> getClients() {
        return clientService.getClients();
    }

    @PostMapping
    public ClientResponse createClient(@RequestBody @Valid CreateClientRequest request) {
        return clientService.createClient(request);
    }

    // 他にも GET /{id}, PUT /{id}, DELETE /{id} など追加可能
}
