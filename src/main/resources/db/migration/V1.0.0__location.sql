CREATE TABLE location
(
    id         BIGSERIAL PRIMARY KEY,
    name       varchar(255) NOT NULL,
    address    varchar(255) NOT NULL,
    country    varchar(255) NOT NULL,
    city       varchar(255) NOT NULL,
    company_id BIGINT       NOT NULL
);