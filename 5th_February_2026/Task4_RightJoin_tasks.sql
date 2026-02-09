select * from orders right join customers on orders.customer_id = customers.customer_id;

select * from employees
select * from departments
select * from customers
select * from orders
select * from products

select distinct customers.customer_id, customers.customer_name, orders.order_name from customers
right join orders on customers.customer_id = orders.customer_id

select departments.department_name, count(employees.department_id) as employee_count from employees
right join departments on employees.department_id = departments.department_id group by departments.department_name

select * from customers right join orders on customers.customer_id = orders.order_id where orders.customer_id is null

select customers.customer_id, count(orders.customer_id) as num_of_orders from orders right join customers on orders.customer_id = customers.customer_id
group by customers.customer_id