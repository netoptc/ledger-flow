package com.netoptc.account_service.entities;

import com.netoptc.account_service.enums.AccountStatus;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ACCOUNTS")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "owner_name")
    private String ownerName;

    private String document;

    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @Column(name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt;


    @Column(name = "updated_at")
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
