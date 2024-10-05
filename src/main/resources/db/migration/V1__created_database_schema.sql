CREATE TABLE accounts
(
    id            SERIAL PRIMARY KEY,
    number_account VARCHAR(13)                                                   NOT NULL,
    currency_type        INTEGER                                                        NOT NULL,
    amount    DECIMAL                                                        NOT NULL,
    customer_id    INTEGER                                                   NOT NULL,
    acc_create_at  TIMESTAMP,
    acc_updated_at TIMESTAMP
);

CREATE TABLE accounts_audit
(
    id            SERIAL PRIMARY KEY,
    number_account VARCHAR(13) ,
    currency_type        INTEGER                 NOT NULL,
    amount    DECIMAL                 NOT NULL,
    status        VARCHAR(20) CHECK (status in ('CREATED', 'PROCESSED', 'REJECTED')) NOT NULL,
    detail        VARCHAR,
    created_at    TIMESTAMP DEFAULT now() NOT NULL,
    updated_at    TIMESTAMP
);