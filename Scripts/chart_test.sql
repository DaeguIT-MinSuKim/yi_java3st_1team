-- 월중 주차별 영업팀별 영업 실적
select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-01' and '2020-03-07'
    and e.e_dept =4;
-- 월단위 주차 구하기
select floor((date_format(20200330,'%d')+(date_format(date_format(20200330,'%Y%m%01'),'%w')-1))/7)+1;

-- 3월 1주차는 몇일부터 몇일?
SELECT DATE_ADD(CURDATE(), INTERVAL (DAYOFWEEK(CURDATE())-1) * -1 DAY) FROM dual;
SELECT DATE_ADD(CURDATE(), INTERVAL (DAYOFWEEK(CURDATE())-2) * -1 DAY) FROM dual;
SELECT DATE_ADD(CURDATE(), INTERVAL (DAYOFWEEK(CURDATE())-3) * -1 DAY) FROM dual;
SELECT DATE_ADD(CURDATE(), INTERVAL (DAYOFWEEK(CURDATE())-4) * -1 DAY) FROM dual;
SELECT DATE_ADD(CURDATE(), INTERVAL (DAYOFWEEK(CURDATE())-5) * -1 DAY) FROM dual;
SELECT DATE_ADD(CURDATE(), INTERVAL (DAYOFWEEK(CURDATE())-6) * -1 DAY) FROM dual;
SELECT DATE_ADD(CURDATE(), INTERVAL (DAYOFWEEK(CURDATE())-7) * -1 DAY) FROM dual;
SELECT DATE_ADD(CURDATE(), INTERVAL (DAYOFWEEK(CURDATE())-8) * -1 DAY) FROM dual;

select curdate(); 

-- 2020년 10대 주요고객사
select c.c_name ,p.p_price * o.o_qty
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no
  join client c on o.o_cno = c.c_no
 order by p.p_price * o.o_qty desc;

-- 한달간 구매상품 상위 5위
select o.o_no, p.p_name, (p.p_price * o_qty) from `order` o
left join product p on o.o_pno =p.p_no 
left join client c on o.o_cno = c.c_no 
where DATE(o_date) between '2020-03-01' and '2020-03-31' 
and c.c_no = 56 
order by p.p_price * o.o_qty desc limit 5;

-- 한달간 구매상품중 상위 5위이상의 상품 구매금액의 합계
select sum(p.p_price * o_qty) from `order` o
left join product p on o.o_pno =p.p_no 
left join client c on o.o_cno = c.c_no 
where DATE(o_date) between '2020-03-01' and '2020-03-31' 
and c.c_no = 56 
order by p.p_price * o.o_qty desc limit 5;