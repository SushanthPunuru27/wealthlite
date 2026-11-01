create table client (
    id          bigserial primary key,
    first_name  varchar(50)  not null,
    last_name   varchar(50)  not null,
    email       varchar(100) not null unique,
    created_at  timestamp    not null default now()
);

create table account (
    id              bigserial primary key,
    client_id       bigint        not null references client(id),
    account_number  varchar(20)   not null unique,
    type            varchar(20)   not null,
    currency        varchar(3)    not null default 'USD',
    balance         numeric(19,2) not null default 0,
    version         bigint        not null default 0,
    created_at      timestamp     not null default now()
);

create index idx_account_client on account(client_id);