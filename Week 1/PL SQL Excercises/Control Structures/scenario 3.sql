DECLARE
CURSOR c_due_loans IS
SELECT customer_id, loan_id, due_date
FROM loans
WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
FOR r_loan IN c_due_loans LOOP
DBMS_OUTPUT.PUT_LINE('REMINDER: Customer ID ' || r_loan.customer_id ||
', your payment for Loan ID ' || r_loan.loan_id ||
' is due soon!');
END LOOP;
END;
/

