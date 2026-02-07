select * from customers
select * from orders
select * from products

select customers.customer_name, orders.order_name from customers
join orders on customers.customer_id = orders.customer_id
where customers.customer_name like 'user%'

select * from employees
select * from departments

select employees.employee_id, departments.department_name from employees left join departments on employees.employee_id = departments.employee_id
where employees.employee_name like 'user%'

select products.product_category, orders.order_id, orders.order_name from products join orders on orders.order_id = products.order_id
where products.product_category like 'Electronics'