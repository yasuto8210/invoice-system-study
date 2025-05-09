package com.example.invoice.invoice_system.client.controller;

import com.example.invoice.invoice_system.client.dto.request.CreateClientRequest;
import com.example.invoice.invoice_system.client.dto.request.UpdateClientRequest;
import com.example.invoice.invoice_system.client.dto.response.ClientResponse;
import com.example.invoice.invoice_system.client.service.ClientService;
import jakarta.validation.Valid;
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

    @GetMapping("/{id}")
    public ResponseEntity<ClientResponse> getClient(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(clientService.getClient(id));
    }

    @PostMapping
    public ResponseEntity<ClientResponse> createClient(@RequestBody @Valid CreateClientRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.createClient(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateClientById(@RequestBody @Valid UpdateClientRequest request) {
        clientService.updateClientById(request);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClientById(@PathVariable Long id) {
        clientService.deleteClientById(id);
        return ResponseEntity.noContent().build();
    }
}
