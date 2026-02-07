insert into customers (customer_id, customer_name, customer_email, customer_phone, customer_city) values
(8, 'user_8', 'user8@gmail.com', '5487963258', null),
(9, 'user_9', 'user9@gmail.com', '6598748592', null);

select * from customers left join orders on customers.customer_id = orders.customer_id;

select * from customers left join orders on customers.customer_id = orders.order_id where orders.order_id is null;

select * from departments left join employees on departments.employee_id = employees.employee_id;

select * from departments;

update departments set employee_id = null where department_id =3;

select * from departments left join employees on departments.employee_id = employees.employee_id where departments.employee_id is null;

select * from orders;
select * from customers;
select * from products;

update orders set order_id = null, customer_id = null where order_id = 5;
update orders set order_status = 'Not Ordered' where order_id = 5;

select orders.order_id, orders.customer_id, orders.order_name, orders.order_status, products.product_category, products.creation_date from orders
left join products on orders.order_id = products.order_id
where orders.customer_id is null;

select * from orders left join products on orders.order_id = products.order_id where orders.order_price > 200;

select * from orders left join products on orders.order_id = products.order_id where orders.order_status like 'Pending';