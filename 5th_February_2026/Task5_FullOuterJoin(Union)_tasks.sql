select * from customers full outer join orders on customers.customer_id = orders.customer_id;

select * from customers;
select * from orders;

select * from customers full outer join orders on customers.customer_id = orders.customer_id where customers.customer_id = orders.order_id
select * from customers full outer join orders on customers.customer_id = orders.customer_id where customers.customer_id = orders.customer_id

select * from employees full outer join departments on employees.employee_id = departments.employee_id

select * from employees left join departments on employees.employee_id = departments.employee_id
union
select * from employees right join departments on employees.employee_id = departments.employee_id;