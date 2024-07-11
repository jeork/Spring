create table jul103_member(
	m_id varchar2(20char) primary key,
	m_pw varchar2(20char) not null,
	m_name varchar2(10 char) not null,
	m_birth varchar2(20 char) not null,
	m_addr varchar2 (200 char) not null,
	m_phone varchar2(12 char) not null,
	m_photo varchar2(200 char) not null
) 
select * from JUl103_MEMBER

create table jul103_routine(
	r_id varchar2 (20char) primary key,
	r_mon varchar2(30 char), 
	r_tue varchar2(30 char), 
	r_wen varchar2(30 char), 
	r_thu varchar2(30 char), 
	r_fri varchar2(30 char), 
	r_sat varchar2(30 char), 
	r_sun varchar2(30 char) 
)
select * from jul103_routine

create table jul103_board(
	b_id varchar2(20char) primary key,
	b_title varchar2(30char) not null,
	b_date date not null
)
select * from jul103_board



