INSERT INTO students (student_id, student_name, student_email, student_age, join_date, active_flag) VALUES
(11, 'user_11', 'user11@gmail.com', 19, '2026-01-25', 1),
(12, 'user_11', 'user12@gmail.com', 19, '2026-01-27', 1),
(13, 'user_11', 'user13@gmail.com', 18, '2026-01-23', 1);

INSERT INTO courses (course_id, course_name, fees) VALUES
(110, 'CSE', 1000000.00);

INSERT INTO enrollments (enroll_id, student_id, course_id, enroll_timestamp) VALUES
(1016, 11, 110, '2026-01-26'),
(1017, 12, 110, '2026-01-26'),
(1018, 13, 110, '2026-01-26');

SELECT * FROM students;

SELECT student_name, student_email
FROM students;

SELECT * FROM students ORDER BY student_age DESC;

SELECT TOP 5 * FROM students ORDER BY join_date ASC;

SELECT DISTINCT student_age FROM students;

SELECT DISTINCT course_name FROM courses;

UPDATE students SET student_age = 20 WHERE student_id = 10;

UPDATE students SET active_flag = 0 WHERE student_name = 'user_1';
UPDATE students SET active_flag = 0 WHERE student_name = 'user_2';

UPDATE courses SET fees = fees * 1.1;

DELETE FROM students WHERE student_id = 5;

DELETE FROM courses WHERE fees < 1000;

DELETE FROM enrollments WHERE enroll_timestamp < '2026-01-25';

ALTER TABLE students ALTER COLUMN student_name VARCHAR(255);

EXEC sp_rename 'students.join_date', 'registration_date', 'COLUMN';

ALTER TABLE students ADD phone_number VARCHAR(255);