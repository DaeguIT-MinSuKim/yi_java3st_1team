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
	(null, '테스트', '제임스JEONG', '대구광역시 달성군 다사읍 대실역북로', '053-123-4567', 'test0003', 'Test0003!', 'hothihi5@gmail.com', 46);
update client set c_name = '테스트', c_ceo = '제임스', c_address = '대구광역시 달성군 다사읍 대실역북로', c_tel = '053-123-4567', c_id = 'test0003', c_pw = 'Test0003!', c_mail = 'hothihi5@gmail.com', c_salesman = 46 where c_no = 56;
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

select cd_no from client_delivery order by cd_no desc limit 1;

select e.e_no, e.e_name,  e.e_title, e.e_dept, d.d_no, d.d_name, d.d_floor, e.e_manager, e.e_id, e.e_pw, e.e_mail from employee e left join department d on e.e_dept  = d.d_no where d.d_no = 10;

select * from client;

select c_no, c_name, c_ceo, c_address, c_tel, c_id, c_pw, c_mail, c_date, c_salesman  from client where c_id = 'jamesareuming' and c_pw = 'James1234!@';

insert into client values(56,'테스트','테스트님','대구광역시 달성군 다사읍 대실역남로 5','053-111-1111','test0003', 'Test0003!', 'hothihi5@gmail.com', '2020-03-12', 46);

select * from employee;
insert into employee (e_no, e_name, e_dept, e_title, e_manager, e_id, e_pw, e_mail) value (null,?,?,?,?,?,?,?)";

show tables;

select * from `order` o;

select * from client_delivery cd;

insert into client_delivery  values(31, 52, '2020-03-14');

select * from `order` o;

select c_name, count(c_name) from `order` o left join client on o_cno = c_no where c_no = 20;

select * from client_delivery cd ;

select * from client;

desc client;

select * from client where c_salesman = 46;

-- 통계
-- 라인차트
-- 영업부 실적 : 영업관리 1부, 2부, 3부 실적
select * from client c left join employee e on c.c_salesman = e.e_no left join department d on e.e_dept = d.d_no; -- 56개 // 해외사업부 2개 빼고 총 영업 (54개)
select * from client c left join employee e on c.c_salesman = e.e_no left join department d on e.e_dept = d.d_no where d.d_no = 4; -- 영업관리 1부 : 13개
select * from client c left join employee e on c.c_salesman = e.e_no left join department d on e.e_dept = d.d_no where d.d_no = 5; -- 영업관리 2부 : 24개
select * from client c left join employee e on c.c_salesman = e.e_no left join department d on e.e_dept = d.d_no where d.d_no = 6; -- 영업관리 3부 : 17개

-- 부서명, 고객번호(고객유치수)
select d.d_name, count(c.c_no) from client c left join employee e on c.c_salesman = e.e_no left join department d on e.e_dept = d.d_no where d.d_no = 4 -- 영업관리 1부
union
select d.d_name, count(c.c_no) from client c left join employee e on c.c_salesman = e.e_no left join department d on e.e_dept = d.d_no where d.d_no = 5 -- 영업관리 2부
union
select d.d_name, count(c.c_no) from client c left join employee e on c.c_salesman = e.e_no left join department d on e.e_dept = d.d_no where d.d_no = 6; -- 영업관리 3부


-- 바차트
select * from client; -- 고객 : 총56명
select * from `order` o left join client on o_cno = c_no;

-- 가장 많이 주문한 고객 : 고객사이름, 주문번호(주문한횟수)
select c_no, c_name, count(o_no) as 주문횟수 from `order` o left join client on o_cno = c_no group by c_name
union

set @count(o_no):=0, @rank:=0;

select c_no, c_name, count(o_no) as 주문횟수 from `order` o left join client on o_cno = c_no group by  c_no;
-- 1(0)/2(1)/3(1)/4(0)/5(1)/6(1)/7(1)/8(0)/9(1)/10(0)/11(0)/12(0)/13(2)/14(1)/15(1)/16(2)/17(0)/18(0)/19(1)/20(3)/21(0)/22(0)/23(0)/24(1)/

delete from client where c_no = 56;

select * from client_delivery;
select * from client;

delete from client_delivery where cd_no = 31;

insert into client_delivery  values(31, 52, '2020-03-14');
update 

select *from `order` o;

select * from supplier_order so ;

update client_delivery  set cd_date = '2020-03-15' where cd_no = 31;

select c_id from client where c_id = 'test0003';
select c_id from client where c_id = 'test0003';

select * from employee;

select e_id from employee where e_name = '현재순' and e_no = 6;

select e_id from employee where e_name = '현재순' and e_no = 6;

select e_id from employee where e_no=1 and e_name ='현재승';

select e_id from employee where e_no=2 and e_name ='장금력';

select * from employee;

select * from client;

select e_mail from employee where e_id ='hceo1004';

-- 84, 테스트2, test0002, Test0002!, hothihi5@gmail.com
-- 83, 테스트1, test0001, Test0001!, pinkmiin@naver.com

update employee set e_pw = '7m967598l4'where e_no = 84 and e_name='테스트2' and e_id = 'test0002'and e_mail='hothihi5@gmail.com';

select c_no, c_name, c_id, c_mail from client where c_id = 'test0003';

select e_no, e_title, e_dept from employee where e_name = '양사기';

update client set c_pw = ? where c_no = ? and c_name = ? and c_id = ? and c_mail = ?

select * from employee;

select * from inventory_quantity iq ;

select * from client;

desc client;

select e.e_no, e.e_title, e.e_dept, d.d_no, d.d_name, d.d_floor from employee e left join department d on e.e_dept = d.d_no where e.e_name = '양사기';

show tables;

select * from supplier;
desc supplier;
desc client;

desc product;

desc supplier_order;
desc supplier_purchase;
desc client_delivery;
desc `order` ;

select * from client_delivery;

update client_delivery set cd_date ='2020-03-25' where cd_no = 381;

select * from `order`;
desc `order`;
