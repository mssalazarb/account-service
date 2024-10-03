package com.msa.account.service.infrastructure.entity;

import lombok.Data;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "account")
public class AccountEntity {
    @Id //este atributo permite identificar el primary key por lo general estos se deben autogenerar
    @GeneratedValue(strategy = GenerationType.IDENTITY) // genera los valores para los primary key de manera auto

    @Column(name = "ID") //esto permite identificar como se llama las columnas en la BD
    private Integer id;

    @Column(name = "NUM_ACC")
    private String numberAccount;

    @Column(name = "CUR_TYP")
    private Integer currencyType;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "CUS_ID")
    private Integer customerId;

    @Column(name = "CREATE_AT")
    private Timestamp createAt;

    @Column(name = "UPDATE_AT")
    private Timestamp updateAt;
}
