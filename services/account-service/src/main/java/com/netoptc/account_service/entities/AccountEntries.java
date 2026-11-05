package com.netoptc.account_service.entities;


import com.netoptc.account_service.enums.AccountEntrieType;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ACCOUNT_ENTRIES")
public class AccountEntries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    @Enumerated(EnumType.STRING)
    private AccountEntrieType type;

    private BigDecimal amount;

    @Column(name = "balance_after")
    private BigDecimal balanceAfter;

    @Column(name = "transfer_id")
    private Long transferId;

    @Column(name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt;
}
