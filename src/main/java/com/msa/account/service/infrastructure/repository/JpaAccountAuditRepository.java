package com.msa.account.service.infrastructure.repository;


import com.msa.account.service.infrastructure.entity.AccountAuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAccountAuditRepository extends JpaRepository<AccountAuditEntity, Long> {
}
