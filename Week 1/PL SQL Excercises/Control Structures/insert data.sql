-- 1. Create the Customers Table
CREATE TABLE customers (
customer_id NUMBER PRIMARY KEY,
name VARCHAR2(50),
age NUMBER,
interest_rate NUMBER,
balance NUMBER,
IsVIP VARCHAR2(10) DEFAULT 'FALSE'
);

-- 2. Create the Loans Table
CREATE TABLE loans (
loan_id NUMBER PRIMARY KEY,
customer_id NUMBER,
due_date DATE
);

-- 3. Insert Fake Customers (One young, one over 60, one rich)
INSERT INTO customers (customer_id, name, age, interest_rate, balance) VALUES (1, 'Alice', 25, 5, 500);
INSERT INTO customers (customer_id, name, age, interest_rate, balance) VALUES (2, 'Bob', 65, 7, 12000);
INSERT INTO customers (customer_id, name, age, interest_rate, balance) VALUES (3, 'Charlie', 61, 6, 4000);

-- 4. Insert Fake Loans (One due tomorrow, one due next year)
INSERT INTO loans (loan_id, customer_id, due_date) VALUES (101, 1, SYSDATE + 1);
INSERT INTO loans (loan_id, customer_id, due_date) VALUES (102, 2, SYSDATE + 40);

COMMIT;

