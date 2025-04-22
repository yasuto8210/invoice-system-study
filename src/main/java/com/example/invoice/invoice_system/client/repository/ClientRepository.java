package com.example.invoice.invoice_system.client.repository;

import com.example.invoice.invoice_system.client.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    // カスタムクエリが必要ならここに追加
}

