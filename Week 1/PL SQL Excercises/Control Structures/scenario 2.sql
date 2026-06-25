DECLARE
CURSOR c_vip_check IS
SELECT customer_id, balance
FROM customers;
BEGIN
FOR r_cust IN c_vip_check LOOP
IF r_cust.balance > 10000 THEN
UPDATE customers
SET IsVIP = 'TRUE'
WHERE customer_id = r_cust.customer_id;
END IF;
END LOOP;
END;
/
