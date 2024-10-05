package com.ms.account.service.infrastructure.adapters.customers.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "accounts")
@Data
public class AccountEntity {

    @Id //este atributo permite identificar el primary key por lo general estos se deben autogenerar
    @GeneratedValue(strategy = GenerationType.IDENTITY) // genera los valores para los primary key de manera auto

    @Column(name = "id") //esto permite identificar como se llama las columnas en la BD
    private Integer id;

    @Column(name = "number_account")
    private String numberAccount;

    @Column(name = "currency_type")
    private Integer currencyType;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "acc_create_at")
    private Timestamp createAt;

    @Column(name = "acc_updated_at")
    private Timestamp updateAt;
}
