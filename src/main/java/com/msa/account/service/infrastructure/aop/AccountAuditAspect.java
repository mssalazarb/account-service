package com.msa.account.service.infrastructure.aop;

import com.msa.service.movements.domain.ports.in.MovementAuditService;
import com.msa.service.movements.model.Movement;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
@Log4j2
public class AccountAuditAspect {

    private final MovementAuditService movementAuditService;

    @Pointcut("execution(* com.msa.service.movements.domain.ports.out.AccountRepository.saveMovement(..))")
    public void saveMovement() {}

    @Before("saveMovement() && args(movement)")
    public void logAntesDePersistir(Movement movement) {
        this.movementAuditService.createMovementAudit(movement);
    }

    @AfterReturning(pointcut = "execution(* com.msa.service.movements.domain.ports.out.AccountRepository.saveMovement(..))", returning = "accountMovement")
    public void afterSaveMovement(Object accountMovement) {
        log.info("DATA PARA ACTUALIZAR: {}", accountMovement.toString());
//        this.movementAuditService.updateMovementAudit(accountMovement);
    }
}
