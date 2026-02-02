INSERT INTO students (student_id, student_name, student_email, student_age, join_date, active_flag) VALUES
(1, 'user_1', 'user1@gmail.com', 15, '2026-01-25', 1),
(2, 'user_2', 'user2@gmail.com', 16, '2026-01-24', 1),
(3, 'user_3', 'user3@gmail.com', 14, '2026-01-25', 1),
(4, 'user_4', 'user4@gmail.com', 17, '2026-01-27', 0),
(5, 'user_5', 'user5@gmail.com', 18, '2026-01-28', 1),
(6, 'user_6', 'user6@gmail.com', 14, '2026-01-29', 1),
(7, 'user_7', 'user7@gmail.com', 15, '2026-01-24', 0),
(8, 'user_8', 'user8@gmail.com', 17, '2026-01-25', 0),
(9, 'user_9', 'user9@gmail.com', 15, '2026-01-23', 1),
(10, 'user_10', 'user10@gmail.com', 15, '2026-01-25', 1);


INSERT INTO courses (course_id, course_name, fees) VALUES
(101, 'Maths', 10000.00),
(102, 'Physics', 500.00),
(103, 'Chemistry', 60.00),
(104, 'Social', 90.00),
(105, 'English', 10000.00);

INSERT INTO enrollments (enroll_id, student_id, course_id, enroll_timestamp) VALUES
(1001, 1, 101, 2026-01-25),
(1002, 2, 102, 2026-01-25),
(1003, 3, 103, 2026-01-25),
(1004, 4, 104, 2026-01-25),
(1005, 5, 105, 2026-01-25),
(1006, 6, 101, 2026-01-25),
(1007, 7, 102, 2026-01-25),
(1008, 8, 103, 2026-01-25),
(1009, 9, 104, 2026-01-25),
(1010, 10, 105, 2026-01-25),
(1011, 1, 101, 2026-01-25),
(1012, 2, 102, 2026-01-25),
(1013, 3, 103, 2026-01-25),
(1014, 4, 104, 2026-01-25),
(1015, 5, 105, 2026-01-25);

DELETE FROM courses WHERE fees BETWEEN 0 and 10000000000;


SELECT * FROM enrollments;

