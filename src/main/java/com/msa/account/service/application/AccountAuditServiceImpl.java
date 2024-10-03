package com.msa.account.service.application;

import com.msa.service.movements.domain.enums.MovementAuditType;
import com.msa.service.movements.domain.model.MovementAudit;
import com.msa.service.movements.domain.ports.in.MovementAuditService;
import com.msa.service.movements.domain.ports.out.MovementAuditRepository;
import com.msa.service.movements.model.AccountMovement;
import com.msa.service.movements.model.Movement;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RequiredArgsConstructor
public class AccountAuditServiceImpl implements MovementAuditService {

    private final MovementAuditRepository movementAuditRepository;

    @Override
    public MovementAudit createMovementAudit(Movement movement) {
        MovementAudit movementAudit = new MovementAudit();
        movementAudit.setTypeMovement(movement.getTypeMovement());
        movementAudit.setAmount(BigDecimal.valueOf(movement.getAmount()));
        movementAudit.setAccountId(movement.getAccountId());
        movementAudit.setStatus(MovementAuditType.CREATED);
        movementAudit.setCreatedAt(LocalDateTime.now());

        return this.movementAuditRepository.saveMovementAudit(movementAudit);
    }

    @Override
    public MovementAudit updateMovementAudit(AccountMovement accountMovement) {
        if (accountMovement.getId() == null) {
//            movementAudit.setStatus(AccountAuditType.REJECTED);
        } else {
//            movementAudit.setStatus(AccountAuditType.PROCESSED);
        }
//        movementAudit.setUpdatedAt(LocalDateTime.now());

//        return this.movementAuditRepository.saveMovementAudit(movementAudit);
        return null;
    }
}
