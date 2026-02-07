select * from customers
select * from orders
select * from products

select orders.order_name, products.creation_date from orders join products on orders.order_id = products.order_id
where products.creation_date > '2026-02-03'

select * from employees
select * from departments

select employees.employee_name from employees join departments on employees.employee_id = departments.employee_id
where departments.department_name = 'Department_3'

select customers.customer_name, customers.customer_city, orders.order_name from customers join orders on customers.customer_id = orders.customer_id
where customers.customer_city = 'Chennai'

select orders.order_name, orders.order_price, products.product_category from orders join products on orders.order_id = products.order_id
where orders.order_price > '200'

