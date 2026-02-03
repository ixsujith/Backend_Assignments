SELECT COUNT(student_name) FROM students;

SELECT COUNT(student_name) FROM students WHERE active_flag = 1;

SELECT SUM(fees) FROM courses;

SELECT AVG(fees) FROM courses;

SELECT SUM(fees) FROM courses WHERE fees > 2000;

SELECT MIN(student_age) FROM students;

SELECT MAX(fees) FROM courses;

SELECT MAX(join_date) from students;

SELECT MIN(join_date) FROM students;

SELECT active_flag, COUNT(student_name) FROM students GROUP BY active_flag;

SELECT student_age, COUNT(student_name) FROM students GROUP BY student_age;

SELECT course_name, SUM(fees) FROM courses GROUP BY course_name;

SELECT course_id FROM enrollments GROUP BY course_id HAVING count(course_id) > 3;

SELECT student_age FROM students GROUP BY student_age HAVING AVG(student_age) > 21;

SELECT course_id FROM enrollments GROUP BY course_id HAVING count(course_id) > 2;