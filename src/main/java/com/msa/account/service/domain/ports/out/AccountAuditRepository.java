package com.msa.account.service.domain.ports.out;


import com.msa.account.service.domain.model.AccountAudit;

public interface AccountAuditRepository {
    AccountAudit saveAccountAudit(AccountAudit movementAudit);
}
