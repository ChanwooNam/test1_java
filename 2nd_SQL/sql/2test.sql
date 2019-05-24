
1번 문제
select e.employee_id,e.first_name,m.first_name
from employees e, employees m
where e.manager_id=m.employee_id

2번 문제
select e.last_name,e.salary from employees e, employees m 
where e.manager_id=m.employee_id and e.salary>m.salary;

3번 문제
select first_name,last_name,salary from employees
where job_id='SA_REP' and salary between 9000 and 10000;

4번 문제
select e.employee_id,e.last_name,e.hire_date
from employees e join employees m on e.manager_id=m.employee_id
and e.hire_date<m.hire_date;

5번 문제
select distinct j.job_title,d.department_name
from employees e, jobs j, departments d
where e.job_id=j.job_id and e.department_id = d.department_id;

6번 문제
select to_char(hire_date,'MM'), to_char(count(*)) from employees
group by to_char(hire_date,'MM') order by to_char(hire_date,'MM');

7번 문제
select e.first_name,e.hire_date,m.employee_id,m.first_name
from employees e left join employees m on e.manager_id=m.employee_id
where to_char(e.hire_date,'yy')=08;

8번 문제
select e.first_name,e.salary,d.department_name from employees e, departments d
where e.department_id = d.department_id and e.department_id=80;

9번 문제
select e.hire_date,e.employee_id,e.first_name,e.last_name,nvl(d.department_name,'NOT ASSIGNED')
from employees e, departments d
where e.department_id(+) = d.department_id and to_char(e.hire_date,'yyyy')=2004;

10번 문제
select e.first_name,e.hire_date,m.employee_id,m.first_name
from employees e, employees m
where  e.manager_id(+)=m.employee_id and to_char(e.hire_date,'yyyy')=2005;
