package com.msa.account.service.domain.ports.out;


import com.msa.account.service.domain.model.Account;

public interface AccountRepository {
    Account saveAccount(Account account);
}
