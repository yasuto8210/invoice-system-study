package com.example.invoice.invoice_system;

import org.springframework.boot.SpringApplication;

public class TestInvoiceSystemApplication {

	public static void main(String[] args) {
		SpringApplication.from(InvoiceSystemApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
