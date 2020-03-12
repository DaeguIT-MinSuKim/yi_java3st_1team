select user(), database();
select * from information_schema.`TABLES` t ;

<<<<<<< HEAD
show tables;

desc client;

<<<<<<< HEAD
select * from product p2  ;
=======
select * from supplier s ;
desc supplier ;
desc zip_code ;
>>>>>>> refs/heads/brch_Json
=======
select * from product p2  ;

select * from client where c_no = 55;

select * from product;

<<<<<<< HEAD
>>>>>>> branch 'master' of https://github.com/DaeguIT-MinSuKim/yi_java3st_1team
=======
>>>>>>> branch 'master' of https://github.com/DaeguIT-MinSuKim/yi_java3st_1team

desc supplier ;
desc zip_code ;

select p_no from product order by p_no desc limit 1;


select s_no from supplier order by s_no desc limit 1;
select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier;
select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier where s_no=1;
select z_code, z_doro, z_num1, z_num2 from zip_code where z_sido="서울특별시" and z_sigungu="서초구";
select z_code, z_num1, z_num2 from zip_code where z_sido="대구광역시" and z_sigungu="남구" and z_doro="삼각지6길";
 
select * from zip_code where z_doro="태전로" and z_num1 = 53 and z_num2= 0 ;
>>>>>>> branch 'master' of https://github.com/DaeguIT-MinSuKim/yi_java3st_1team.git

insert into supplier values(47,"재승시스템","220-81-45678","대구광역시","053-456-4567","053-456-7894");
select * from supplier s ;


select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier where s_name='안랩';
select z_code, z_sido, z_sigungu, z_doro, z_num1, z_num2 from zip_code where z_sido="서울특별시" and z_doro="다산로10길" and z_num1=12;

select * from client c ;
select c_no, c_name, c_ceo, c_address, c_tel, c_id, c_mail, c_date, c_salesman from client where c_no=1;

select * from category c2 ;
select c_no from client order by c_no desc limit 1;
delete from client where c_no = 56;

select e_name from employee e left join client c on e.e_no=c.c_salesman where c.c_salesman=55 ;
select e_no from employee e where e_name='양공입';

desc product ;


select p_no, c.cate_name, p_name, p_cost, p_price, s.s_name, p_qty, p_date, p_pic, p_picpath from product p left join category c on p.p_cate = c.cate_no left join supplier s on p.p_sno = s.s_no;
delete from product where p_no=85;

alter table product add p_picpath varchar(500) default null;
alter table product drop p_picpath;

update product set p_picpath='D:\\workspace\\workspace_gradle\\yi_java3st_1team\\document\\sample_data\\software_images\\server\\AhnLab GateScan for Email [UNIX] 기본형.jpg' where p_no=84;

select p_no, p_cate, c.cate_no, c.cate_name, p_name, p_cost, p_price, s.s_no, s.s_name, p_qty, p_date, p_picpath 
  from product p 
 left join supplier s on p.p_sno = s.s_no
 left join category c on p.p_cate = c.cate_no where c.cate_name ="개발";
desc product;
desc supplier;
desc category;
select * from category;
select cate_no from category where cate_name = '사무';

select so_no from supplier_order order by so_no desc limit 1;

select so_no, so_pno, p.p_name, s.s_name, p.p_cost, so_qty, so_date from supplier_order so 
left join product p on so.so_pno = p.p_no left join supplier s on p.p_sno = s.s_no;
				   
select * from supplier_purchase;
select sp_no, sp_pno, p.p_name, s.s_name, p.p_cost, sp_qty, sp_date from supplier_purchase sp left join product p on sp.sp_pno = p.p_no left join supplier s on p.p_sno = s.s_no;

select s.s_name from product p left join supplier s on p.p_sno = s.s_no where p.p_name ="알씨";

select sp_pno from supplier_purchase sp left join product p on sp.sp_pno = p.p_no where p.p_name ="알씨";
select so_pno from supplier_order so left join product p on so.so_pno = p.p_no where p.p_name ="알씨";

select p.p_cost from product p left join supplier s on p.p_sno = s.s_no where p.p_name ="알씨";

select o_no from `order` order by o_no desc limit 1;
select * from `order`;

select o_no, o_date, c.c_name, p.p_name, o_qty, o_memo, o_dps, o_ok, e.e_name, e.e_no from `order` o left join client c on o.o_cno = c.c_no left join product p on o.o_pno = p.p_no left join employee e on o.o_eno = e.e_no;

insert into `order` (o_no, o_date, o_cno, o_pno, o_qty, o_memo, o_dps, o_ok, o_eno) values(51, "2020-02-20", 22, 22, 20, "빠르게", 0, 0, 20);

select p_pic from product p ;

select  * from employee e ;
select * from client c2 ;
select * from product p2 ;

update product set p_qty=55 where p_name='알씨';
update product set p_qty=45 where p_name='알씨';

select * from inventory_quantity iq ;

insert into inventory_quantity (iq_no, iq_pno, iq_qty) values(?, ?, ?);

select p.p_name , s.s_name , iq.iq_qty , p.p_price , p.p_cost from inventory_quantity iq left join product p on iq.iq_pno = p.p_no left join supplier s on p.p_sno = s.s_no;

select p_no from supplier_purchase sp left join product p on sp.sp_pno = p.p_no where p.p_name ='재승';

select * from supplier_purchase sp ;

select c_salesman from client where c_name=?

select * from discount_rate dr ;

select z_code, z_sido, z_sigungu, z_doro, z_num1, z_num2 from zip_code where z_sido='대구광역시' and z_doro='삼각지6길' and z_num1=12 and z_num2=5;


