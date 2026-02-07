select * from customers;
select * from orders;
select * from products;
select * from review;
select * from employees
select * from departments

select customers.customer_id, count(orders.order_id) as order_count
from customers join orders on customers.customer_id = orders.customer_id
group by customers.customer_id

select customers.customer_id, sum(orders.order_price) as price_count from customers join orders on customers.customer_id = orders.customer_id
group by customers.customer_id

select departments.department_id, count(employees.employee_id) as employee_count from departments join employees on departments.employee_id = employees.employee_id
group by departments.department_id

select orders.order_id, count(products.product_id) as product_count from orders join products on products.order_id = orders.order_id
group by orders.order_id

alter table employees add employee_salary int;

update employees set employee_salary = 30000 where employee_id = 5
update departments set employee_id = 2 where department_id = 3

alter table employees add department_id int foreign key references departments(department_id)

update employees set department_id = 3 where employee_id = 5

