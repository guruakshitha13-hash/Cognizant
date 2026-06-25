CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
p_dept IN VARCHAR2,
p_bonus_pct IN NUMBER
) IS
BEGIN
UPDATE employees
SET salary = salary + (salary * p_bonus_pct)
WHERE department = p_dept;

COMMIT;
END;
/
