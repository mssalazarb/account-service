package com.msa.account.service.infrastructure.repository;

import com.msa.account.service.infrastructure.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAccountRepository extends JpaRepository<AccountEntity, Long > {
}
