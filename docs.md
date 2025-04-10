-- Question 1 setup
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES users(id),
    order_date DATE,
    total_amount DECIMAL(10,2)
);

-- Sample data for users
INSERT INTO users (name, email) VALUES
('Alice', 'alice@example.com'),
('Bob', 'bob@example.com'),
('Charlie', 'charlie@example.com'),
('Daisy', 'daisy@example.com');

-- Sample data for orders
INSERT INTO orders (user_id, order_date, total_amount) VALUES
(1, '2024-01-10', 100.00),
(1, '2024-02-15', 150.50),
(2, '2024-03-01', 80.00),
(3, '2024-03-05', 200.00);

-- Question 2 setup
CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE order_items (
    id SERIAL PRIMARY KEY,
    product_id INT REFERENCES products(id),
    quantity INT NOT NULL,
    price DECIMAL(10,2) NOT NULL
);

-- Sample data for products
INSERT INTO products (name) VALUES
('Laptop'),
('Phone'),
('Tablet'),
('Monitor'),
('Keyboard'),
('Mouse');

-- Sample data for order_items
INSERT INTO order_items (product_id, quantity, price) VALUES
(1, 2, 500.00),   -- Laptop x2
(2, 3, 300.00),   -- Phone x3
(3, 1, 200.00),   -- Tablet x1
(1, 1, 500.00),   -- Laptop x1
(2, 2, 300.00),   -- Phone x2
(4, 5, 150.00),   -- Monitor x5
(6, 10, 20.00);   -- Mouse x10




db.users.insertMany([
  {
    name: "Alice",
    age: 25,
    email: "alice@example.com",
    active: true
  },
  {
    name: "Bob",
    age: 17,
    email: "bob@example.com",
    active: true
  },
  {
    name: "Charlie",
    age: 30,
    email: "charlie@example.com",
    active: false
  },
  {
    name: "Daisy",
    age: 20,
    email: "daisy@example.com",
    active: true
  },
  {
    name: "Ethan",
    age: 19,
    email: "ethan@example.com",
    active: true
  }
]);



https://cuddly-train-5gv69v45gjg2pv6v-9002.app.github.dev/student