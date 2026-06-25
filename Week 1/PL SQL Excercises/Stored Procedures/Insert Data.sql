CREATE TABLE accounts (
account_id NUMBER PRIMARY KEY,
account_type VARCHAR2(20),
balance NUMBER
);

CREATE TABLE employees (
emp_id NUMBER PRIMARY KEY,
name VARCHAR2(50),
department VARCHAR2(30),
salary NUMBER
);

INSERT INTO accounts VALUES (101, 'Savings', 5000);
INSERT INTO accounts VALUES (102, 'Savings', 10000);
INSERT INTO accounts VALUES (103, 'Checking', 2000);

INSERT INTO employees VALUES (1, 'John', 'IT', 60000);
INSERT INTO employees VALUES (2, 'Sarah', 'Sales', 50000);
INSERT INTO employees VALUES (3, 'Mike', 'IT', 70000);

COMMIT;
