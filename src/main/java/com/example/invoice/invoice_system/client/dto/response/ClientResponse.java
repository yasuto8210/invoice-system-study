package com.example.invoice.invoice_system.client.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

public record ClientResponse(@Schema(description = "ID", example = "1") Long id,
                             @Schema(description = "name", example = "tom") String name,
                             @Schema(description = "E-mail", example = "test@test.com") String email,
                             @Schema(description = "phone number", example = "000-0000-0000") String phone,
                             @Schema(description = "address", example = "address") String address,
                             @Schema(description = "note", example = "note") String notes) {
}
