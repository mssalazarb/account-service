package com.msa.account.service.domain.ports.in;

import com.msa.service.movements.domain.model.MovementAudit;
import com.msa.service.movements.model.AccountMovement;
import com.msa.service.movements.model.Movement;

public interface AccountAuditService {
    MovementAudit createMovementAudit(Movement movement);

    MovementAudit updateMovementAudit(AccountMovement accountMovement);
}
