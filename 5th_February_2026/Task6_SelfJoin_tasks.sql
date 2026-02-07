create table EmployeeManager (
	employee_id int primary key,
	employee_name varchar(100),
	manager_id int
);

insert into EmployeeManager (employee_id, employee_name, manager_id) values
(1, 'user_1', 2),
(2, 'user_2', 3),
(3, 'user_3', null),
(4, 'user_4', 5),
(5, 'user_5', 1),
(6, 'user_6', 4),
(7, 'user_7', 4),
(8, 'user_8', null),
(9, 'user_9', 4),
(10, 'user_10', 1);

select a.employee_id, b.employee_name as manager_name from EmployeeManager a left join EmployeeManager b on a.manager_id = b.employee_id

select b.employee_id as manager_id, b.employee_name as manager_name, count(a.employee_id) as employee_count
from EmployeeManager a join EmployeeManager b on a.manager_id = b.employee_id
group by b.employee_id, b.employee_name
having count(a.employee_id) > 1;

select distinct b.employee_name as manager_name from EmployeeManager a join EmployeeManager b on a.manager_id = b.employee_id

select a.employee_name as employee_name, b.employee_name as manager_name from EmployeeManager a join EmployeeManager b on a.manager_id = b.employee_id

select a.employee_name as employee_name, b.employee_name as report_to from EmployeeManager a join EmployeeManager b on a.manager_id = b.employee_id