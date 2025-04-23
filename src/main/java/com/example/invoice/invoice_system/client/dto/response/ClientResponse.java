package com.example.invoice.invoice_system.client.dto.response;

public record ClientResponse(Long id,
                             String name,
                             String email,
                             String phone,
                             String address,
                             String notes) {
}
