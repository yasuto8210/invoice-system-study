package com.example.invoice.invoice_system.client.dto.request;

import com.example.invoice.invoice_system.client.domain.Client;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UpdateClientRequest {

    @Schema(description = "ID", example = "1")
    @NotNull(message = "ID is required")
    private Long id;

    @Schema(description = "name", example = "tom")
    private String name;

    @Schema(description = "E-mail", example = "test@test.com")
    @Email(message = "invalid email format")
    private String email;

    @Schema(description = "phone number", example = "000-0000-0000")
    @Pattern(regexp = "^[0-9\\\\-]{10,15}$", message = "invalid phone number format")
    private String phone;

    @Schema(description = "address", example = "address")
    private String address;

    @Schema(description = "note", example = "note")
    @Size(max = 255, message = "note size must be less than 255")
    private String notes;

    public UpdateClientRequest() {
    }

    public UpdateClientRequest(Long id, String name, String email, String phone, String address, String notes) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.notes = notes;
    }

    public Long getId() {
        return id;
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
        return new Client(id, name, email, phone, address, notes);
    }

}
