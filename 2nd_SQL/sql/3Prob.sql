drop table board;
drop table users;

create table users(
	id varchar2(12) constraint id_users_pk primary key,
	password varchar2(12),
	name varchar2(10) constraint name_users_notnull not null,
	role varchar2(16) default 'user'
);

create table board(
	seq number(5) constraint seq_board_pk primary key,
	title varchar2(20) constraint title_board_notnull not null,
	content varchar2(200) constraint ct_board_notnull not null,
	regdate date default sysdate,
	cnt number(6) default 0,
	userid varchar2(12) references users
);

/* 
ALTER TABLE board
ADD CONSTRAINT FOREIGN KEY(id)
REFERENCES users; 
*/

-- 회원등록
insert into users(id, password, name, role)	values('lee','1q2w3e4r','이건희','admin');
insert into users(id, password, name, role)	values('seo','1q2w3e4r','서혁진','');
commit;

-- 회원정보수정
update users
set password = '1q2w3e4r!', name = '서혁쓰' 
where id = 'seo';

-- 로그인
select * from users where id = 'lee' and password = '1q2w3e4r';

-- 게시판 글등록
create sequence sq;

insert into board(seq, title, content, userid)
values(sq.nextval, 'Piano man', 'Sing us a song piano man', 'lee');

insert into board(seq, title, content, userid)
values(sq.nextval, 'Honesty', 'Honesty is such a lonely word', 'seo');

-- 글수정
update board
set title = 'Piano man', content = 'Sing us a song tonight'
where seq = 1;

-- 게시판 글 삭제
delete from board where seq = 2;

-- 데이터검색(Query)
????

-- 전체 등록글 수
select count(*) from board;

-- 사용자별 등록글수 
select u.name,count(*) from board b, users u where b.userid = u.id group by u.name;

-- 월별개시글수
select to_char(regdate,'MM'), count(*)
from board group by to_char(regdate,'MM');

-- 사용자별 게시글 검색
select u.name,title
from board b, users u
where b.userid = u.id and u.name = '이건희';

-- 제목으로 게시글 검색
select title
from board b, users u
where b.userid = u.id and b.title like '%Piano%';
