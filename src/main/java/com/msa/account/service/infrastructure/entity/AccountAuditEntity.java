package com.msa.account.service.infrastructure.entity;

import com.msa.account.service.domain.enums.AccountAuditType;
import com.msa.account.service.domain.model.Account;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "account_audit")
public class AccountAuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_movement", nullable = false)
    private Account.TypeMovementEnum typeMovement;

    private BigDecimal amount;
    private Long accountId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private AccountAuditType status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
