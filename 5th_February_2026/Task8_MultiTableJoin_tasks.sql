select * from customers;
select * from orders;
select * from products;

select * from customers join orders on customers.customer_id = orders.customer_id
join products on orders.order_id = products.order_id

select * from employees;
select * from departments;
select * from roles;

create table review (
	review_id int primary key,
	product_id int foreign key references products(product_id),
	rating int
);

insert into review (review_id, product_id, rating) values
(1, 1, 5),
(2, 5, 4),
(3, 4, 4),
(4, 2, 4),
(5, 3, 5);

select * from customers;
select * from orders;
select * from products;
select * from review

select * from customers
join orders on customers.customer_id = orders.customer_id
join products on orders.order_id = products.order_id
join review on products.product_id = review.product_id


