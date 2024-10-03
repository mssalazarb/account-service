package com.msa.account.service.infrastructure.repository.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msa.account.service.domain.model.AccountAudit;
import com.msa.account.service.domain.ports.out.AccountAuditRepository;
import com.msa.account.service.infrastructure.entity.AccountAuditEntity;
import com.msa.account.service.infrastructure.repository.JpaAccountAuditRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountAuditRepositoryImpl implements AccountAuditRepository {

    private final JpaAccountAuditRepository jpaAccountAuditRepository;
    private final ObjectMapper mapper;

    @Override
    public AccountAudit saveAccountAudit(AccountAudit accountAudit) {
        AccountAuditEntity entity = mapper.convertValue(accountAudit, AccountAuditEntity.class);
        AccountAuditEntity savedAccountAudit = this.jpaAccountAuditRepository
                .save(entity);

        return mapper.convertValue(savedAccountAudit, AccountAudit.class);
    }
}
