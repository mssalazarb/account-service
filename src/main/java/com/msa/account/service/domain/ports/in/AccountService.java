package com.msa.account.service.domain.ports.in;

import com.msa.service.movements.model.AccountMovement;
import com.msa.service.movements.model.Movement;

public interface AccountService {
    AccountMovement createMovement(Movement movement);
}
