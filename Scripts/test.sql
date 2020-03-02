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