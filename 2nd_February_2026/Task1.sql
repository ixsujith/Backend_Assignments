create table students (
	student_id BIGINT PRIMARY KEY,
	student_name VARCHAR(255),
	student_email VARCHAR(255) UNIQUE,
	student_age INT,
	join_date DATE,
	active_flag BIT DEFAULT 1
);

create table courses (
	course_id INT PRIMARY KEY,
	course_name VARCHAR(255) NOT NULL,
	fees DECIMAL
);

create table enrollments (
	enroll_id BIGINT PRIMARY KEY,
	student_id BIGINT,
	course_id INT,
	enroll_timestamp DATETIME DEFAULT GETDATE()
);