package com.msa.account.service.infrastructure.repository.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msa.account.service.domain.model.Account;
import com.msa.account.service.domain.ports.out.AccountRepository;
import com.msa.account.service.infrastructure.entity.AccountEntity;
import com.msa.account.service.infrastructure.repository.JpaAccountRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {
    private final JpaAccountRepository jpaAccountRepository;
    private final ObjectMapper mapper;

    @Override
    public Account saveAccount(Account account) {
        AccountEntity accountEntity = this.jpaAccountRepository.save(mapper.convertValue(account, AccountEntity.class));

        return mapper.convertValue(accountEntity, Account.class);
    }
}
