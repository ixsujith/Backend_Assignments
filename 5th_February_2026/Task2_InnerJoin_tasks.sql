select customers.customer_id, customer_name, order_id, order_name from customers inner join orders on customers.customer_id = orders.order_id;

select order_id, order_name, customer_name, customer_city from customers inner join orders on customers.customer_id = orders.customer_id;

create table employees (
	employee_id int primary key,
	employee_name varchar(100) not null,
	employee_email varchar(100) unique,
	employee_phone varchar(20) unique
);

create table departments (
	department_id int primary key,
	employee_id int foreign key references employees(employee_id),
	department_name varchar(100) not null
);

insert into employees (employee_id, employee_name, employee_email, employee_phone) values
(1, 'user1', 'user1@gmail.com', '987845168'),
(2, 'user2', 'user2@gmail.com', '546879458'),
(3, 'user3', 'user3@gmail.com', '124598765'),
(4, 'user4', 'user4@gmail.com', '456987465'),
(5, 'user5', 'user5@gmail.com', '587487557');

insert into departments (department_id, employee_id, department_name) values
(1, 1, 'Department_1'),
(2, 2, 'Department_2'),
(3, 2, 'Department_3'),
(4, 5, 'Department_4'),
(5, 4, 'Department_5');

select * from employees;

select * from departments;

select employees.employee_id, employee_name, department_name from employees inner join departments on employees.employee_id = departments.employee_id;

create table products (
	product_id int primary key,
	order_id int foreign key references orders(order_id),
	product_category varchar(100) not null,
	creation_date date default getdate()
);

insert into products (product_id, order_id, product_category, creation_date) values
(1, 1, 'Electronics', '2026-02-01'),
(2, 1, 'Toys', '2026-02-02'),
(3, 2, 'Food', '2026-02-03'),
(4, 4, 'Electronics', '2026-02-04'),
(5, 5, 'Food', '2026-02-05');

select * from products;

select customers.customer_id, orders.order_id, orders.order_name, orders.order_price, products.product_category, products.creation_date from customers
inner join orders on customers.customer_id = orders.customer_id
inner join products on orders.order_id = products.order_id;

select customers.customer_id, orders.order_id, orders.order_name, orders.order_price, products.product_category, products.creation_date from customers
inner join orders on customers.customer_id = orders.order_id
inner join products on orders.order_id = products.order_id
where orders.order_price > 200;

select customers.customer_id, orders.order_id, orders.order_name, products.product_category, products.creation_date from customers
inner join orders on customers.customer_id = orders.customer_id
inner join products on orders.order_id = products.order_id
where product_category like 'Electronics';
