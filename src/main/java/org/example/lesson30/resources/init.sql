CREATE DATABASE jpa;

INSERT INTO products (id, name, cost)
VALUES (1, 'tomato', 10.00);

INSERT INTO products (id, name, cost)
VALUES (2, 'potato', 15.00);

CREATE TABLE IF NOT EXISTS products
(
    id   SERIAL PRIMARY KEY UNIQUE,
    name VARCHAR(255) NOT NULL,
    cost NUMERIC(10, 2) NOT NULL
);

CREATE TABLE IF NOT EXISTS orders
(
    id   SERIAL PRIMARY KEY UNIQUE,
    date DATE,
    cost NUMERIC(10, 2)
);

CREATE TABLE IF NOT EXISTS order_products
(
    order_id INT REFERENCES orders(id),
    product_id INT REFERENCES products(id),
    PRIMARY KEY (order_id, product_id)
);
