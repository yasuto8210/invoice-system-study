package com.example.invoice.invoice_system.client.dto.request;

import com.example.invoice.invoice_system.client.domain.Client;
import io.swagger.v3.oas.annotations.media.Schema;

public class CreateClientRequest {

    @Schema(description = "name", example = "tom")
    private String name;
    @Schema(description = "E-mail", example = "<EMAIL>")
    private String email;
    @Schema(description = "phone number", example = "000-0000-0000")
    private String phone;
    @Schema(description = "address", example = "address")
    private String address;
    @Schema(description = "note", example = "note")
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
