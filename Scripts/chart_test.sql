select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-01' and '2020-03-07'
    and e.e_dept =4;
    
select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-08' and '2020-03-14'
    and e.e_dept =4;
    
select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-15' and '2020-03-21'
    and e.e_dept =4;

select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-22' and '2020-03-28'
    and e.e_dept =4;
    
select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-01' and '2020-03-07'
    and e.e_dept =5;
    
select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-08' and '2020-03-14'
    and e.e_dept =5;
    
select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-15' and '2020-03-21'
    and e.e_dept =5;

select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-22' and '2020-03-28'
    and e.e_dept =5;
    
select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-01' and '2020-03-07'
    and e.e_dept =6;
    
select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-08' and '2020-03-14'
    and e.e_dept =6;
    
select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-15' and '2020-03-21'
    and e.e_dept =6;

select sum(p.p_price * o.o_qty )
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no 
 where o.o_date 
between '2020-03-22' and '2020-03-28'
    and e.e_dept =6;
  
// 2020년 10대 주요고객사
select c.c_name ,p.p_price * o.o_qty
  from `order` o 
  join product p on o.o_pno = p.p_no 
  join employee e on o.o_eno = e.e_no
  join client c on o.o_cno = c.c_no
 order by p.p_price * o.o_qty desc;