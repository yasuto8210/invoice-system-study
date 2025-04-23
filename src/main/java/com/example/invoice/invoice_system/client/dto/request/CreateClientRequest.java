package com.example.invoice.invoice_system.client.dto.request;

import com.example.invoice.invoice_system.client.domain.Client;

public class CreateClientRequest {

    private String name;
    private String email;
    private String phone;
    private String address;
    private String notes;

    public CreateClientRequest() {
    }

    public CreateClientRequest(String name, String email, String phone, String address, String notes) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getNotes() {
        return notes;
    }

    public Client toClient() {
        return new Client(name, email, phone, address, notes);
    }
}
