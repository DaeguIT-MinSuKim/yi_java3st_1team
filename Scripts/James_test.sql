select user(), database();

select * from employee;

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