select
from
where
order by

select * from emp;
select ename,hiredate,to_char(hiredate,'yyyy'),substr(hiredate,1,2) from emp;

select round(55.55),trunc(55.55) from dual; /* 반올림과 버림 */
select round(sal),trunc(sal) from emp;

select ename,deptno,sal,sal*1.1 from emp where deptno = 10;
select ename,deptno,sal,sal*1.2 from emp where deptno = 20;
select ename,deptno,sal,sal from emp where deptno = 30;
select ename,deptno,sal,decode(deptno,10,sal*1.1,20,sal*1.2,sal) as 수당 from emp;
/* 마지막 식은 위의 3개 다 한거, 30번 부서부터는 급여 변동 없음 */

select ename, mgr from emp;
select ename, nvl(to_char(mgr),'x') from emp; /* 형변환 필요 */
select ename, nvl2(mgr,'o','x') from emp; /* null이면 '0'이, 아니면 'x'가 선택됨, 자동형변환 */

select ename,job,dname,loc from emp, dept where emp.deptno=dept.deptno; /* deptno 값이 일치하는 두개의 테이블에서 한번에 값 가져오기 */
select ename,job,emp.deptno,dname,loc from emp, dept where emp.deptno=dept.deptno; /* deptno 값이 일치해도 해당 값은 한쪽에서 가져와서 가운데에 배치 */

select ename,job,d.deptno,dname,loc from emp e, dept d where e.deptno=d.deptno; /* e,d처럼 얼라이언스값을 설정한 이후에는 원래 이름 emp, dept 사용금지  */

안시 표준 : , -> join / where -> on
select ename,job,d.deptno,dname,loc from emp e join dept d on e.deptno=d.deptno;
select ename,job,d.deptno,dname,loc from emp e inner join dept d on e.deptno=d.deptno;
select ename,job,dname,sal from emp e inner join dept d on e.deptno=d.deptno where sal > 2000;

select ename,job,dname,sal from emp e, dept d where e.deptno=d.deptno and sal > 2000; /* 클래식 오라클 표준*/
select ename,job,dname,loc from emp e, dept d where e.deptno(+)=d.deptno; /* null인 40번 부서도 표기 */
select ename,job,d.deptno,dname,loc from emp e right outer join dept d on e.deptno=d.deptno; /* 안시 표준 */

select ename,sal,grade from emp, salgrade where sal between losal and hisal; /* salgrade 테이블에서 제시한 grade를 emp테이블에서 적용 */
select ename,sal,grade from emp join salgrade on sal between losal and hisal; /* 안시 표준 */

select e.ename as 부하, m.ename as 상사 from emp e, emp m where e.mgr = m.empno(+); /* 한 테이블 내에서 결과값 연결 */
select e.ename 부하, nvl(m.ename, 'CEO') 상사 from emp e left outer join emp m on e.mgr = m.empno; /* null 처리까지 */
select e.ename 부하,e.hiredate, m.ename,m.hiredate 상사 from emp e left join emp m on e.mgr = m.empno and e.hiredate<m.hiredate;
select e.ename 부하,e.sal, m.ename,m.sal 상사 from emp e left join emp m on e.mgr = m.empno and e.sal>m.sal;
select e.ename 부하,e.sal, m.ename,m.sal 상사 from emp e, emp m where e.mgr = m.empno and e.sal>m.sal;

집계함수
select ename,round(sal) from emp;
select avg(sal) from emp; /* 평균 -> 싱글그룹그룹펑션 */
select count(sal),count(comm),count(*),count(mgr) from emp; /* 각 column의 row 갯수 */

select count(job) from emp;
select count(distinct job) from emp;

select sum(sal),count(*),round(sum(sal)/count(*),2) 평균, round(avg(sal),2) from emp;
select sum(sal),count(*),round(avg(sal),2) from emp;
select sum(sal),count(*),round(avg(sal),2) from emp where deptno = 10;
select sum(sal),count(*),round(avg(sal),2) from emp group by deptno;

select deptno,max(sal),min(sal),count(*),round(avg(sal),2) from emp group by deptno;
select deptno,round(avg(sal),2) from emp group by deptno order by deptno;
select emp.deptno,dname,count(*),round(avg(sal),2) 평균 from emp,dept where emp.deptno = dept.deptno
group by emp.deptno,dname order by 평균;

급여가 2000 이상인 사람들의 부서별 평균
select emp.deptno,dname,count(*),avg(sal) 평균 from emp,dept 
where emp.deptno = dept.deptno and sal > 2000
group by emp.deptno,dname order by 평균;

select emp.deptno,dname,count(*),avg(sal) 평균 from emp,dept
where emp.deptno = dept.deptno
group by emp.deptno,dname
having avg(sal) > 2000 
order by 평균; /* having 집계함수 */

select ename,dname,sal,grade from emp,dept,salgrade where emp.deptno=dept.deptno
and sal between losal and hisal;

select ename,dname,sal,grade
from emp join dept on emp.deptno=dept.deptno
join salgrade on sal between losal and hisal;

select deptno, avg(sal) from emp group by deptno having avg(sal) > 2000;

서브쿼리문
select ename, sal from emp where ename='FORD'; /* 포드씨의 급여 (3000원) */
select * from emp where sal>3000; /* 3000원 이상 받는 사람 급여 */
select * from emp where sal>(select sal from emp where ename='FORD'); /* 서브쿼리문으로 섞어버리기 */
select * from emp where sal<(select avg(sal) from emp); /* 평균만도 못한놈들 */
select * from emp where sal=(select min(sal) from emp); /* 제일 적게받는놈 */

select min(sal) from emp group by deptno; /* 각 부서별 제일 적게받는놈 금액 */
select * from emp where sal=(select min(sal) from emp group by deptno); /* 싱글로우 서브쿼리가 리턴값이 여러개라 에러 */
select * from emp where sal in (select min(sal) from emp group by deptno); /* in을 =대신 쓰면 해결 */

select * from emp outer
where sal < (select avg(sal) from emp where deptno=outer.deptno); /* 상관관계 서브컬럼, outer을 이용해 연결 */

from절의 서브쿼리문
select rownum,ename,job,sal from emp; /* rownum은 가상의 일련번호 */
select rownum,ename,job,sal from emp order by sal; /* rownum도 함께 sort되어버림 */
select rownum,ename,job,sal from (select * from emp order by sal desc); /* 내림차순 */
select rownum,ename,job,sal from (select * from emp order by sal desc) where rownum<5; /* 랭킹까지 */
select rownum,ename,job,sal from (select * from emp order by sal desc) where rownum between 1 and 5; /* between 구문에는 해당 숫자도 포함됨 */

	select row#,ename,job,sal
	from
	(select rownum row#,ename,job,sal
		from (select * from emp order by sal desc)
	)where row# between 4 and 6;

	select rownum,ename,job,sal,hiredate
	from (select * from emp where hiredate like '81%' order by sal desc)
	where rownum  4; /* 81년 입사자중 연봉 상위 3명 */
	
select * from emp where (deptno, sal) 
in (select deptno,max(sal) from emp group by deptno); /* 부서별 봉급 원탑 */
