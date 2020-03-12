select user(), database();

select * from employee;
select * from product;
desc employee;
select * from department;

select * from client;
select * from department;

-- 부서
select d_no, d_name, d_floor from department;

select d_no, d_name, d_floor from department where d_no = 1;

insert into department (d_no, d_name, d_floor) value (null, '구매부', 100);
update department set d_name = '소프트웨어 구매부', d_floor = '101' where d_no = 10;
delete from department where d_no = 10;

-- 직원
select e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail from employee;
select e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail from employee where e_no = 1;

insert into employee (e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail) value (null, '정인턴', 4, '인턴',2, 'areumzzing', '1234qwer', 'hothihi5@gmail.com');
update employee set e_name = '정인턴1', e_dept = 5, e_title = '인턴1', e_manager = 2, e_id = 'areum1234', e_pw = '1234', e_mail = '없음' where e_no = 81;
delete from employee where e_no = 81;

-- 고객사
select * from client;
select c_no, c_name, c_ceo, c_address, c_tel, c_id, c_pw, c_mail, c_salesman from client;
select c_no, c_name, c_ceo, c_address, c_tel, c_id, c_pw, c_mail, c_salesman from client where c_no = 1;

insert into client (c_no, c_name, c_ceo, c_address, c_tel, c_id, c_pw, c_mail, c_salesman) value
	(null, '제임스공부방', '제임스JEONG', '대구광역시 달성군 다사읍 대실역북로', '053-123-4567', 'james', 'qwer1234', 'hothihi5@gmail.com', 46);
update client set c_name = '제임스최고공부방', c_ceo = '제임스', c_address = '대구광역시 달성군 다사읍 대실역북로', c_tel = '053-123-4567', c_id = 'james', c_pw = 'qwer1234', c_mail = 'hothihi5@gmail.com', c_salesman = 46 where c_no = 56;
delete from client where c_no = 56;

select d_no, d_name, d_floor from department where d_no = 1;

-- 마지막 번호 구하기
select e_no from employee order by e_no desc limit 1;

-- 로그인
select e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail from employee where e_id = 'sujinzzing' and e_pw = 'Jane1234!@';

select e.e_no, e.e_name, e.e_dept, d.d_name, d.d_floor, e.e_manager, e.e_id, e.e_pw, e.e_mail
from employee e left join department d
on e.e_dept  = d.d_no;
select * from employee;
select e.e_no, e.e_name, e.e_title, e.e_dept, d.d_no, d.d_name, d.d_floor, e.e_manager, e.e_id, e.e_pw, e.e_mail from employee e left join department d on e.e_dept  = d.d_no where e.e_id = 'sujinzzing' and e.e_pw = 'Jane1234!@'; 

select * from employee e ;

select e_id from employee where e_id = "hceo1004";

show tables;
-- 주문번호, 주문일자, 고객상호명, 품목명, 주문수량, 주문요구사항, 입금여부, 주문완료, 주문담당자
select * from `order` o ; -- 주문번호, 주문일자, 주문수량, 주문요구사항, 입금여부, 주문완료, 주문담당자 
select * from client c ; -- 고객상호명 o_cno
select * from product p ; -- 품목명 o_pno
select * from employee e ; -- 주문담당자 

-- 주문확인 & 처리
select o.o_no, o.o_date, c.c_name, p.p_name, o.o_qty, o.o_memo, o.o_dps, o.o_ok, e.e_name
		from `order` o
		 left join client c
		 on o.o_cno = c.c_no
		 left join product p
		 on o.o_pno = p.p_no
		 left join employee e
		 on o.o_eno = e.e_no;
		 
-- 출고 이력 관리 : 출고번호, 고객상호명(client), 품목명(product), 출고수량(order), 출고일자
select cd.cd_no, c.c_name, p.p_name, o.o_qty, cd.cd_date
		from client_delivery cd
		left join `order` o
		on cd.cd_sno = o.o_no
		left join product p
		on o.o_pno = p.p_no
		left join client c
		on o.o_cno = c.c_no;
	
select o_no, o_date, c.c_name, p.p_name, o_qty, o_memo, o_dps, o_ok, o_eno, e.e_name, e.e_no from `order` o 
left join client c on o.o_cno = c.c_no left join product p on o.o_pno = p.p_no 
left join employee e on o.o_eno = e.e_no;

select e.e_no, e.e_name,  e.e_title, e.e_dept, d.d_no, d.d_name, d.d_floor, e.e_manager, e.e_id, e.e_pw, e.e_mail
from employee e left join department d on e.e_dept  = d.d_no;

select e.e_no, e.e_name,  e.e_title, e.e_dept, d.d_no, d.d_name, d.d_floor, e.e_manager, e.e_id, e.e_pw, e.e_mail from employee e left join department d on e.e_dept  = d.d_no where d.d_no = 10;

select * from client;

select c_no, c_name, c_ceo, c_address, c_tel, c_id, c_pw, c_mail, c_date, c_salesman  from client where c_id = 'jamesareuming' and c_pw = 'James1234!@';
		