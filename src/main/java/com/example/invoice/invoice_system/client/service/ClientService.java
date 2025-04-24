package com.example.invoice.invoice_system.client.service;

import com.example.invoice.invoice_system.client.domain.Client;
import com.example.invoice.invoice_system.client.dto.request.CreateClientRequest;
import com.example.invoice.invoice_system.client.dto.request.UpdateClientRequest;
import com.example.invoice.invoice_system.client.dto.response.ClientResponse;
import com.example.invoice.invoice_system.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientResponse> getClients() {
        return clientRepository.findAll().stream().map(Client::toResponse).toList();
    }

    public ClientResponse getClient(Long id) {
        return clientRepository.findById(id).map(Client::toResponse).orElse(null);
    }

    public ClientResponse createClient(CreateClientRequest request) {
        Client client = request.toClient();
        return Client.toResponse(clientRepository.save(client));
    }

    public void updateClientById(UpdateClientRequest request) {
        Client client = request.toClient();
        clientRepository.save(client);
    }

    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}
