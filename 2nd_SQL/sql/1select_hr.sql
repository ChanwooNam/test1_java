select * from departments;
select * from emp;

select empno,ename,job,hiredate,deptno from emp;
select ename as 사원명,job as 업무,sal as 급여, comm as 수당 from emp;

select ename as 사원명,job as "업 무",sal as 급_여, comm as 수당 from emp; /* 띄어쓰기 */
select distinct job from emp; /* 중복제거 */
select ename, sal, sal*12 as 연봉 from emp; /* 연산자 */
select ename, sal,comm,sal+comm from emp; /* 계산식에 null이 포함되어 있으면 값도 무조건 null이다 */
select ename, sal,comm,sal+nvl(comm,0) from emp; /* null인경우 모두 0 처리 */

select ename, nvl(mgr, '없음') from emp; /* 타입이 달라서 안됨 */
select ename, nvl(mgr, 0) from emp;
select ename, nvl(to_char(mgr), '없음') as 매니저 from emp; /* mgr 전체를 char 타입으로 일치 */

select ename, mgr, 'sql' from emp; /* 컬럼 및 내용 복사 추가 */
select ename, sal,comm,sal+nvl(comm,0) as 지급액 from emp;
select ename, sal,comm,sal+nvl(comm,0)||'원' as 지급액 from emp; /* 컬럼 내에 단위 등 추가 */

select ename,job,hiredate,deptno from emp;
select ename||job||hiredate,deptno from emp; /* 컬럼 합쳐버리기 */

select sysdate from emp;
select sysdate from dept;
select sysdate from dual; /* 듀얼테이블 */
select sysdate,3+7+8 from dual;

select * from emp where sal>3000; /* 조건문, 3000 이상인 사람만 출력 */
select * from emp where job = 'CLERK'; /* =은 하나만 사용, 대소문자 구별 중요  */
select * from emp where upper(job) = upper ('clerk'); /* 대문자  */
select * from emp where upper(job) != upper ('clerk');
select * from emp where hiredate > '81/05/01'; /* 날짜도 이렇게 가능, > = 이후 */

select * from emp where sal > 2000 and sal < 3000; /* and 조건 */
select * from emp where sal between 2000 and 3000; /* 위 조건에서 = 포함 */
select * from emp where sal not between 2000 and 3000; /* not 조건 */
select * from emp where sal between 5000 and 3000; /* 순서바꾸면 오류 */

select * from emp where deptno = 10 or deptno = 20; /* or 조건 */
select * from emp where deptno in(10, 20); /* 위와 같음 */
select * from emp where deptno != 10 and deptno != 20; /* 쟤네빼고 */
select * from emp where deptno not in(10, 20); /* 역시 위와 같음 */
select * from emp where deptno <> all(10, 20); /* 이렇게도 쓴다더라 정도만 */

select * from dept;
select * from dept where deptno=20 and loc='DALLAS';
select * from dept where (deptno=20 and loc='DALLAS') or (deptno=30 and loc='CHICAGO');
select * from dept where (deptno, loc) in ((20,'DALLAS'),(30,'CHICAGO'));

select * from emp where ename = 'KING';
select * from emp where job like 'S%'; /* S로 시작하는 데이터 모두 추출 */
select * from emp where ename like '%M%'; /* 이름에 M자들어가는놈 모두 추출 */

select * from emp where upper(ename) like ('%'||upper('m')||'%'); /* 대문자로 변환하여 검색 */
select * from emp where hiredate like '82%'; /* 82년 입사자 */
select * from emp where hiredate between '82/01/01' and '82/12/31'; /* 위와 동일 */

select * from emp where comm is null; /* null에는 is를 써야함 */
select * from emp where comm is not null;

select * from emp;
select * from emp order by deptno; /* 오름차순 정렬 */
select * from emp order by deptno desc; /* 는 내림차순 정렬 */
select * from emp order by 5,deptno; /* 5번 컬럼(hiredate) 및 deptno 로 정렬 */

select ename,sal,comm,sal+nvl(comm,0) as total from emp;

select ename,sal,comm,sal+nvl(comm,0) as total
from emp
where sal+nvl(comm,0)>1000 /* where 별도로 써줘야함 */
order by total; /* select from where order 순서기억 */

select sysdate from dual; /* 날짜정보 출력 (가상의 dual에서) */
select sysdate,to_char(sysdate,'MM') from dual; /* 월만 추출 */
select sysdate,to_char(sysdate,'YYYY') from dual;

select to_char(hiredate,'MM') from emp; /* 아까 그 데이터에서 입사자의 월만 추출 */
select to_char(hiredate,'day') from emp; /* 요일 */

insert into emp values(9999, 'java01','CLERK',7782,sysdate,900,null,10); /* 데이터 추가 */
rollback; /* 취소 */

insert into emp values(9999, 'java01','CLERK',7782,sysdate,900,null,70); /* 70이 없는 값이라 오류 */

insert into emp values(9999, 'java01','CLERK',7782,'05/13/19',900,null,10); /* 날짜정보오류 */
insert into emp values(9999, 'java01','CLERK',7782,to_date('05/13/19','mm/dd/yy'),900,null,10);
	/* 형변환메서드로 타입 일치 */

