select * from customers
select * from orders
select * from products

select * from customers where customers.customer_id in (select orders.customer_id from orders)

select * from customers where customers.customer_id not in (select orders.customer_id from orders where orders.customer_id is not null)

update products set order_id = null where product_id = 3

select orders.order_name from orders where  not exists (select products.order_id from products where orders.order_id = products.order_id)

select * from employees
select * from departments

select employees.employee_name from employees
where not exists (select departments.employee_id from departments where employees.employee_id = departments.employee_id)

select orders.order_id, orders.order_name, orders.order_price from orders where orders.order_price > (select avg(orders.order_price) from orders)

select customers.customer_id, customers.customer_name, orders.order_name, orders.order_price from customers
join orders on customers.customer_id = orders.customer_id where orders.order_price > (select avg(orders.order_price) from orders)

select departments.department_name, employees.employee_id, employees.employee_salary from departments join employees on departments.department_id = employees.department_id
where employees.employee_salary > (select avg(employees.employee_salary) from employees)

select departments.department_name from departments where departments.department_id not in (select employees.department_id from employees)

select * from employees e join (select * from departments where departments.department_name like 'Department%') d on e.employee_id = d.employee_id

select customers.customer_id, customers.customer_name, orders.order_name from customers join orders on customers.customer_id = orders.customer_id
where exists (select orders.customer_id from orders)

select customers.customer_id, customers.customer_name from customers
where not exists (select orders.customer_id from orders)

select customers.customer_id, customers.customer_name,
(select orders.order_price from orders where customers.customer_id = orders.order_id) as order_amount from customers

select count(customers.customer_id), (select sum(orders.order_price) from orders) as total_customers from customers