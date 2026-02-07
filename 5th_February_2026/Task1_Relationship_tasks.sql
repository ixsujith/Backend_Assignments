create table customers (
	customer_id int primary key,
	customer_name varchar(255) not null,
	customer_email varchar(255) unique,
	customer_phone varchar(20) unique,
	customer_city varchar(100)
);

create table orders (
	order_id int primary key,
	customer_id int foreign key references customers(customer_id),
	order_name varchar(100) not null,
	order_price bigint not null,
	order_status varchar(100) not null
);

insert into customers (customer_id, customer_name, customer_email, customer_phone, customer_city) values
(1, 'user_1', 'user1@gmail.com', '1234567890', 'Hyderabad'),
(2, 'user_2', 'user2@gmail.com', '4567894568', 'Chennai'),
(3, 'user_3', 'user3@gmail.com', '7894561548', 'Bengaluru'),
(4, 'user_4', 'user4@gmail.com', '6958473625', 'Warangal'),
(5, 'user_5', 'user5@gmail.com', '9685741452', 'Hyderabad'),
(6, 'user_6', 'user6@gmail.com', '1425364758', 'Hyderabad'),
(7, 'user_7', 'user7@gmail.com', '6598715266', 'Mumbai');

insert into orders (order_id, customer_id, order_name, order_price, order_status) values
(1, 1, 'order_1', 100, 'Delivered'),
(2, 2, 'order_2', 200, 'Delivered'),
(3, 2, 'order_3', 300, 'Pending'),
(4, 6, 'order_4', 400, 'Delivered'),
(5, 7, 'order_5', 500, 'Pending'),
(6, 5, 'order_6', 600, 'Delivered'),
(7, 4, 'order_7', 700, 'Pending');

select * from customers;

select * from orders;

update orders set customer_id = 10 where order_id = 5;

create table student_details (
	student_id int primary key,
	student_name varchar(255),
	student_age int not null,
	student_email varchar(100) unique
);

create table course_details (
	course_id int primary key,
	course_name varchar(100),
);

insert into student_details (student_id, student_name, student_age, student_email) values
(1, 'student_1', 14, 'student1@gmail.com'),
(2, 'student_2', 15, 'student2@gmail.com'),
(3, 'student_3', 15, 'student3@gmail.com'),
(4, 'student_4', 14, 'student4@gmail.com'),
(5, 'student_5', 15, 'student5@gmail.com');

insert into course_details (course_id, course_name) values
(1, 'course_1'),
(2, 'course_2'),
(3, 'course_3'),
(4, 'course_4'),
(5, 'course_5');

create table students_courses (
	student_id int,
	course_id int,
	primary key(student_id, course_id),
	foreign key(student_id) references student_details(student_id),
	foreign key(course_id) references course_details(course_id)
);

insert into students_courses (student_id, course_id) values
(1, 2),
(1, 3),
(2, 1),
(3, 4),
(4, 3);

select * from students_courses;

