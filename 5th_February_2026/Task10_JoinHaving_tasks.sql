select * from customers
select * from orders

update orders set customer_id = 2 where order_id = 4

select customers.customer_id, customers.customer_name from customers join orders on customers.customer_id = orders.customer_id
group by customers.customer_id, customers.customer_name having count(orders.customer_id) > 3;

select * from employees
select * from departments

select departments.department_name, count(departments.department_id) from departments
join employees on departments.department_id = employees.department_id
group by departments.department_name, departments.department_id having count(employees.department_id) > 1

select * from customers
select * from orders
select * from products

select customers.customer_id, sum(orders.order_price) from customers join orders on customers.customer_id = orders.customer_id
group by customers.customer_id having sum(orders.order_price) > 200

