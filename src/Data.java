CREATE DATABASE localhost;
USE localhost_db;

CREATE TABLE users (
        user_id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(100),
email VARCHAR(100)
);

CREATE TABLE products (
        product_id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(100),
price DECIMAL(10,2),
stock INT CHECK (stock >= 0)
);

CREATE TABLE orders (
        order_id INT AUTO_INCREMENT PRIMARY KEY,
        user_id INT,
        order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        FOREIGN KEY (user_id) REFERENCES users(user_id)
        );

CREATE TABLE order_details (
        id INT AUTO_INCREMENT PRIMARY KEY,
        order_id INT,
        product_id INT,
        quantity INT,
        price DECIMAL(10,2),
FOREIGN KEY (order_id) REFERENCES orders(order_id)
        );

INSERT INTO products(name, price, stock) VALUES ('Iphone', 1000, 10);

INSERT INTO users(name, email) VALUES ('User1', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User2', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User3', 'c@gmail.com');

