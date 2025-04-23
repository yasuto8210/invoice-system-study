package com.example.invoice.invoice_system.client.controller;

import com.example.invoice.invoice_system.client.domain.Client;
import com.example.invoice.invoice_system.client.dto.request.CreateClientRequest;
import com.example.invoice.invoice_system.client.dto.response.ClientResponse;
import com.example.invoice.invoice_system.client.repository.ClientRepository;
import com.example.invoice.invoice_system.client.service.ClientService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<ClientResponse>> getClients() {
        return ResponseEntity.status(HttpStatus.OK).body(clientService.getClients());
    }

    @PostMapping
    public ResponseEntity<ClientResponse> createClient(@RequestBody @Valid CreateClientRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.createClient(request));
    }

    // 他にも GET /{id}, PUT /{id}, DELETE /{id} など追加可能
}
