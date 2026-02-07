select * from customers
select * from orders
select * from products

select customers.customer_id, count(orders.customer_id) from customers join orders on customers.customer_id = orders.customer_id
group by customers.customer_id

select * from employees
select * from departments

select departments.department_name, count(employees.department_id) from departments left join employees on departments.department_id = employees.department_id
group by departments.department_name

select products.product_category, count(orders.order_id) from products join orders on products.order_id = orders.order_id
group by products.product_category

select customers.customer_city, count(orders.customer_id) from customers left join orders on customers.customer_id = orders.customer_id
group by customers.customer_city

