SELECT student_age FROM students WHERE student_age > 15 ORDER BY student_age;

SELECT COUNT(student_name) FROM students WHERE student_name LIKE '%r%';

SELECT course_name FROM courses WHERE fees BETWEEN 1000 AND 100000 ORDER BY fees;

SELECT student_name FROM students WHERE active_flag = 0 AND student_age IS NOT NULL;

SELECT course_id FROM enrollments GROUP BY course_id HAVING COUNT(course_id) > 1;