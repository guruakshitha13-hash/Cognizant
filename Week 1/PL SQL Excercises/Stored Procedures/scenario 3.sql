CREATE OR REPLACE PROCEDURE TransferFunds (
p_from_acc IN NUMBER,
p_to_acc IN NUMBER,
p_amount IN NUMBER
) IS
v_current_balance NUMBER;
BEGIN
-- Check how much money the sender has
SELECT balance INTO v_current_balance
FROM accounts
WHERE account_id = p_from_acc;

-- If they have enough money, make the transfer
IF v_current_balance >= p_amount THEN
-- Take money out
UPDATE accounts
SET balance = balance - p_amount
WHERE account_id = p_from_acc;

-- Put money in
UPDATE accounts
SET balance = balance + p_amount
WHERE account_id = p_to_acc;

COMMIT;
DBMS_OUTPUT.PUT_LINE('Transfer Successful!');
ELSE
DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance for this transfer.');
END IF;
END;
/

