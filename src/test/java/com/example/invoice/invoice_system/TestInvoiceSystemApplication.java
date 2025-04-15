package com.example.invoice.invoice_system;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class TestInvoiceSystemApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(InvoiceSystemApplication.class)
			.sources(TestcontainersConfiguration.class)
			.run(args);
	}

}
