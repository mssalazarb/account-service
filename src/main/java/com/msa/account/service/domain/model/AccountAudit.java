package com.msa.account.service.domain.model;

import com.msa.service.movements.domain.enums.MovementAuditType;
import com.msa.service.movements.model.Movement;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class AccountAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Movement.TypeMovementEnum typeMovement;
    private BigDecimal amount;
    private Long accountId;
    private MovementAuditType status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
