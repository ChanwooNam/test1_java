
select * from tab;

drop table book; /* 테이블 삭제는 롤백이 안됨 */

create table book(
	bookno number(5),
	title varchar2(12),
	author varchar2(12),
	pubdate date
);

select * from book;

insert into book values(1, 'love blossom', 'KWill', sysdate);

commit; /* 오토커밋이 아닌 경우, 다른 유저가 내용을 확인할 수 있도록 확정 */
rollback; /* 커밋 이전까지 */

insert into book values(2, null, null, 2019-05-16);
insert into book (bookno, title, author, pubdate)
			values (3, 'Piano Man', 'Billy Joel', sysdate);

insert into book (bookno, title, author)
			values (4, 'Top of the W', 'Carpenters');

commit;
delete from book;
rollback;

delete from book where title is null;
delete from book where author ='KWill';

alter table book add(price number(7)); /* 이 명령을 하는 순간 commit이 자동 실행되어 롤백 불가 */

insert into book values(5, default,default,default,default); /* 디폴트 설정 안했으면 null */

update book set price=null;
update book set price=10, title='lol' where bookno=1;

alter table book modify(price number(7,2));

alter table book drop column price;

rename book to book2;
rename book2 to book;

delete from book; /* 롤백가능 */
truncate table book; /* 테이블 내용 모두 삭제하고 커밋까지 실행하여 롤백이 안됨 */
drop table book; /* 테이블 삭제, 롤백불가 */



select * from emp;
select * from dept;

create table emp2 as select * from emp;
create table emp3 as select * from emp where deptno=10;
create table dept2 as select * from dept;

insert into dept values(50,'EDU','SEOUL');
insert into dept2 values(50,'EDU','SEOUL');
commit;

insert into dept values(10,'EDU','SEOUL'); /* 제약조건 존재로 오류 */
insert into dept2 values(10,'EDU','SEOUL'); /* 제약조건은 복사할때 따라오지 않음 */
rollback;

drop table book;
/* 제약조건 : constraint 이름 속성 */
create table book(
	bookno number(5) constraint scott_book_pk primary key,
	title varchar2(12) constraint book_title_unique unique,
	author varchar2(12) constraint book_author_notnull not null,
	price number(5) constraint book_price_check check(price>0),
	pubdate date default sysdate
);
/* unique = 중복불가 null 허용, primary key = 중복불가면서 null 허용안함 */

insert into book(bookno, title, author,price,pubdate)
			values(1,'java 1','kim',9000,sysdate); /* 반드시 제약조건을 체크해볼것 */

insert into book(bookno, title, author,price,pubdate)
			values(2,'NeverEndingS','kim',9000,sysdate);

insert into book(bookno, title, author,price,pubdate)
			values(3,null,'kim',9000,sysdate);

insert into book(bookno, title, author,price,pubdate)
			values(4,'Piano Man','Billy Joel',9000,default);

insert into book(bookno, title, author, price)
			values(5,'Nessun Dorma', 'Turandot',7000);

select * from book;
select constraint_name from user_cons_columns; /* 현재 계정에서 사용중인 제약조건들의 이름 */
select constraint_name from user_cons_columns where table_name='BOOK'; /* 테이블별 조건 확인할때는 테이블명은 대문자 */

drop table book; /* 제약조건도 같이 삭제됨(휴지통) */
purge recyclebin; /* 확인 사살(휴지통 비우기) */

create table book(
	bookno number(5),
	title varchar2(12) unique,
	author varchar2(12),
	price number(5) check(price>0),
	pubdate date default sysdate
); /* 제약조건은 자동으로 명명됨 */

insert into book(bookno, title, author,price,pubdate)
			values(1,'java 1','kim',9000,sysdate);
select constraint_name from user_cons_columns where table_name='BOOK';

drop table book cascade constraint; /* 강제 삭제 */

create table book(
	bookno number(5),
	title varchar2(12) unique,
	author varchar2(12),
	price number(5) check(price>0),
	pubdate date default sysdate
);
alter table book add constraint book_bookno_pk primary key (bookno); /* 조건 사후 추가 */
alter table book drop constraint book_bookno_pk;

drop table dept2;

create table dept2 as select * from dept;
alter table dept2 add constraint d2_deptno_pk primary key (deptno);

create table emp2 as select * from emp;
alter table emp2 add constraint e2_empno_pk primary key (empno); /* 조건명은 겹칠수없다 */
alter table emp2 add foreign key(mgr) references emp2; /* 제약조건 가져오기 */ 
alter table emp2 add constraint e2_empno_fk foreign key(mgr) references emp2; /* 가져오는 제약조건 이름도 어지간하면 짓자 */
alter table dept2 add constraint d2_deptno_fk foreign key(deptno) references dept2;

select *
from emp join dept on emp.deptno=dept.deptno
join salgrade on sal between losal and hisal;

create or replace view emp_detail
as select ename,dname,sal,grade from emp join dept on emp.deptno=dept.deptno
join salgrade on sal between losal and hisal; /* 각 데이터에서 컬럼들을 선별하여 뷰 만들기 */

select * from emp_detail; /* 읽기 전용 */
drop view emp_detail; /* 뷰 삭제 */

insert into emp3
	select * from emp2 where deptno = 30;

rollback;

update emp set sal = sal*1.1 where deptno = 10;

drop table book cascade constraint; /* 강제 삭제 */

create table book(
	bookno number(5),
	title varchar2(12) unique,
	author varchar2(12),
	price number(5) check(price>0),
	pubdate date default sysdate
);
alter table book add constraint book_bookno_pk primary key (bookno); /* 조건 사후 추가 */
alter table book drop constraint book_bookno_pk;
alter table book drop constraint *;

create sequence bookno;

insert into book(bookno,title,author,price) values(bookno.nextval,'SQL','kim',7000);

select bookno.currval from dual;

insert into book(bookno,title,author,price)
values((select nvl(max(bookno),0)+1 from book),'SQL','kim',7000);

select * from book;

drop sequence bookno;

set autotrace on;


create index book_title on book(title);
drop index book_title;

drop table book;

select * from emp where ename = '';
select * from emp where lower(ename) like '%'||'j'||'%';
select * from emp where lower(ename) like '%j%';

select 
from
where
group by
order by

select * from emp2 where count()>=8;

select count(e.employee_id), m.employee_id,m.last_name
from employees m, employees e
where e.manager_id=m.employee_id
having count(m.employee_id)>7
group by m.employee_id,m.last_name
order by count(m.employee_id);

입력받은 두개의 업무명(job_title)에 종사하는 사원들의 사번(employee_id), 이름(first_name),
연봉(salary)을 출력하는 프로그램을 작성합니다. JdbcUtil을 사용합니다.

select e.employee_id, e.first_name, e.salary, j.job_title
from employees e, jobs j
where e.job_id = j.job_id
and (j.job_title='Programmer' or j.job_title='President');
