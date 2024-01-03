\c spring_security;

CREATE TABLE IF NOT EXISTS product
(

    id   SERIAL PRIMARY KEY UNIQUE,
    name VARCHAR(255)   NOT NULL,
    cost NUMERIC(10, 2) NOT NULL

);

SELECT * FROM product;

CREATE TABLE IF NOT EXISTS users
(

    id       SERIAL PRIMARY KEY UNIQUE,
    name     VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) UNIQUE NOT NULL,
    role     VARCHAR(255)        NOT NULL

);

SELECT * FROM users;

INSERT INTO users (name, password, role)
VALUES ('bob', '12345', 'role_admin');

INSERT INTO users (name, password, role)
VALUES ('carl', '54321', 'role_user');