package com.ms.account.service.infrastructure.adapters.rest.mapper;


import com.ms.account.service.model.Account;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountDomainMapper {

    com.ms.account.service.domain.models.Account toAccountDomain(Account account);

    Account toAccount (com.ms.account.service.domain.models.Account account);
    List<Account> toAccountList (List<com.ms.account.service.domain.models.Account> account);
}