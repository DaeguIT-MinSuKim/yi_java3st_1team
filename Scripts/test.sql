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

>>>>>>> branch 'master' of https://github.com/DaeguIT-MinSuKim/yi_java3st_1team

desc supplier ;
desc zip_code ;

select s_no from supplier order by s_no desc limit 1;
select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier;
select s_no, s_name, s_bln, s_address, s_tel, s_fax from supplier where s_no=1;
select z_code, z_doro, z_num1, z_num2 from zip_code where z_sido="서울특별시" and z_sigungu="서초구";
select z_code, z_num1, z_num2 from zip_code where z_sido="대구광역시" and z_sigungu="남구" and z_doro="삼각지6길";
 
select * from zip_code where z_doro="태전로" and z_num1 = 53 and z_num2= 0 ;