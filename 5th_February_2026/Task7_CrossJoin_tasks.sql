select * from customers;
select * from orders;
select * from employees

select customers.*, orders.* from customers cross join orders

create table roles (
	role_id int primary key,
	employee_id int foreign key references employees(employee_id),
	designation varchar(100)
);

insert into roles (role_id, employee_id, designation) values
(1, 2, 'Frontend'),
(2, 3, 'Backend'),
(3, 4, 'Devops'),
(4, 1, 'Frontend'),
(5, 5, 'Fullstack');

select * from employees cross join roles