
SELECT c.name as 'Customers' from Customers c
WHERE c.id NOT IN
(
    SELECT * FROM Orders
);