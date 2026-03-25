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
INSERT INTO users(name, email) VALUES ('User4', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User5', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User6', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User7', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User8', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User9', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User10', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User11', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User12', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User13', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User14', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User15', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User16', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User17', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User18', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User19', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User20', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User21', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User22', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User23', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User24', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User25', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User26', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User27', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User28', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User29', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User30', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User31', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User32', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User33', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User34', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User35', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User36', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User37', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User38', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User39', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User40', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User41', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User42', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User43', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User44', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User45', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User46', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User47', 'b@gmail.com');
INSERT INTO users(name, email) VALUES ('User48', 'c@gmail.com');
INSERT INTO users(name, email) VALUES ('User49', 'a@gmail.com');
INSERT INTO users(name, email) VALUES ('User50', 'b@gmail.com');



