SELECT student_age FROM students WHERE student_age > 21;

SELECT student_name FROM students WHERE active_flag = 1;

SELECT course_name FROM courses WHERE fees BETWEEN 1000 AND 5000;

SELECT student_name FROM students WHERE student_age IN (20, 22, 25);

SELECT student_name FROM students WHERE student_age > 20 AND active_flag = 1;

SELECT student_name FROM students WHERE student_age < 20 OR active_flag = 0;

SELECT course_name FROM courses WHERE fees > 2000 AND course_name LIKE '%s%';

SELECT * FROM students WHERE student_email LIKE '%gmail.com';

SELECT course_name FROM courses WHERE course_name LIKE 'data%';

INSERT INTO students (student_id, student_name, student_email, student_age, join_date, active_flag) VALUES (14, 'user_14', 'user14@gmail.com', NULL, '2026-01-23', 0);

SELECT student_name FROM students WHERE student_age IS NULL;

SELECT student_name FROM students WHERE student_age IS NOT NULL;

