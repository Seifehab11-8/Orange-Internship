CREATE TABLE Product (
    name VARCHAR(50) PRIMARY KEY,
    price FLOAT NOT NULL
);

CREATE TABLE Customer (
    name VARCHAR(50) PRIMARY KEY,
    email VARCHAR(50),
    address VARCHAR(50),
    phone CHAR(11) NOT NULL
);

CREATE TABLE Orders (
    order_date DATE NOT NULL,
    order_id INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE order_item (
    order_id INT NOT NULL,
    product_name VARCHAR(50) NOT NULL,
    PRIMARY KEY (order_id, product_name),
    FOREIGN KEY (order_id) REFERENCES Orders(order_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (product_name) REFERENCES Product(name) ON DELETE CASCADE ON UPDATE CASCADE
);