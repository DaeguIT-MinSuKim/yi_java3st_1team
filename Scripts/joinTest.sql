select user(), database();
select * from employee e ;
select o_eno, count(o_eno) from `order`
group by o_eno ;

-- 고객별 판매현황 조회
select	c.c_name as 고객상호명,
		p.p_name as 품목명,
		o.o_qty as 주문수량,
		(case o.o_dps when '0' then '미입금' when '1' then '완료'	end) as 입금여부,
		p.p_price as 판매가격,
		o.o_qty*p.p_price as 매출금,
		(case o.o_dps when '0' then o.o_qty*p.p_price when '1' then '0' end) as 미수금
  from client c natural join `order` o natural join product p
 where c.c_no = o.o_cno and p.p_no = o.o_pno;


-- SW별 판매현황 조회
select	p.p_name as 품목명,
		cate.cate_name as 분류,
		s.s_name as 공급회사명,
		o.o_qty*p.p_cost as 공급금액,
		o.o_qty*p.p_price as 판매금액,
		(case when (o.o_qty >= 50 and o.o_qty < 100) then o.o_qty*p.p_price*0.1
			  when o.o_qty >= 100 then o.o_qty*p.p_price*0.15
		 else '0'	end) as 할인금액,
		(case when (o.o_qty >= 50 and o.o_qty < 100) then o.o_qty*p.p_price*0.9-(o.o_qty*p.p_cost)
			  when o.o_qty >= 100 then o.o_qty*p.p_price*0.85-(o.o_qty*p.p_cost)
		 else (o.o_qty*p.p_price)-(o.o_qty*p.p_cost)	end) as 판매이윤
  from product p natural join `order` o natural join supplier s natural join category cate
 where p.p_no = o.o_pno and cate.cate_no = p.p_cate and s.s_no = p.p_sno;
 

-- 날짜별 판매현황 조회
select	o.o_no as 주문번호,
		c.c_name as 고객상호명,
		p.p_name as 품목명,
		o.o_qty as 주문수량,
		(case o.o_dps when '0' then '미입금'  when '1' then '완료'	end) as 입금여부,
		o.o_date as 주문일자
  from `order` o natural join client c natural join product p
 where o.o_cno = c.c_no and p.p_no = o.o_pno;
 

-- 고객사 주문현황 그래프(전체날짜 기준)
select  c.c_name, o.o_qty*p.p_price as 판매금액, o.o_date 
  from `order` o natural join client c natural join product p
 where o.o_cno = c.c_no and p.p_no = o.o_pno and o.o_date >= '2019-11-01'
 order by o.o_qty*p.p_price desc limit 10;

-- 영업사원 3월 
select  e.e_name, sum(o.o_qty*p.p_price) as 판매금액, o.o_eno
  from `order` o natural join employee e natural join product p
 where o.o_eno = e.e_no and '2020-03-01' <= o.o_date and o.o_date >= '2019-03-31'
 group by e.e_name 
 order by sum(o.o_qty*p.p_price) desc limit 10;

select  e.e_name, sum(o.o_qty*p.p_price) as 판매금액, o.o_eno
  from `order` o natural join employee e natural join product p
 where o.o_eno = e.e_no and '2020-03-01' <= o.o_date and o.o_date >= '2020-03-31'
 group by e.e_name 
 order by sum(o.o_qty*p.p_price) desc limit 10;

select e.e_name ,sum(p.p_price* o.o_qty) from `order` o
left join product p on o.o_pno =p.p_no
left join employee e on o.o_eno =e.e_no 
where DATE(o_date) between '2020-01-01' and '2020-01-31' 
and e.e_dept between 4 and 6
group by e.e_name 
order by sum(p.p_price* o.o_qty) desc limit 10;

select sum(p.p_price * o.o_qty) from `order` o left join product p on o.o_pno =p.p_no
left join client c on o.o_cno = c.c_no where DATE(o_date) between '2020-01-01' and '2020-03-31'
order by p.p_price * o.o_qty desc limit 5;

select o.o_no, p.p_name, (p.p_price * o_qty) from `order` o left join product p on o.o_pno =p.p_no
left join client c on o.o_cno = c.c_no where DATE(o_date) between '2020-03-01' and '2020-03-31'
order by p.p_price * o.o_qty desc limit 5;

select * from `order`;

-- 재고현황 조회
select	p.p_name as 품목명,
		s.s_name as 공급회사명,
		iq.iq_qty as 재고수량,
		p.p_price as 판매가격,
		p.p_cost as 공급가격,
		(case when iq.iq_qty < 50 then '재고부족'	  when iq.iq_qty >= 50 and iq.iq_qty < 150 then '적정재고'	  when iq.iq_qty >= 150 then '재고과다'	end) as 재고평가
  from product p natural join supplier s natural join inventory_quantity iq
 where s.s_no = p.p_sno and p.p_no = iq.iq_pno;


-- SW 전체 판매현황 (할인포함x 판매금액)
select	MID(o.o_date , 1, 7) as 날짜,
		cate.cate_name as 분류,
		p.p_name as 품목명,
		o.o_no as 주문번호,
		o.o_qty as 주문수량,
		o.o_qty*p.p_price as 판매금액
  from `order` o natural join product p natural join category cate
 where p.p_no  = o.o_pno and cate.cate_no = p.p_cate
group by 날짜, 분류, 품목명, 주문번호;
 

-- (공급회사별)거래명세서
select	s.s_name as 공급회사명,
		o.o_date as 주문일자,
		c.c_name as 고객상호,
		p.p_name as 품목,
		o.o_qty as 수량,
		p.p_price as 단가,
		o.o_qty*p.p_price as 금액,
		o.o_qty*p.p_price*0.1 as 세금,
		o.o_qty*p.p_price+o.o_qty*p.p_price*0.1 as 총납품금액
  from supplier s natural join client c natural join product p natural join `order` o 
 where s.s_no = p.p_sno and p.p_no = o.o_pno and c.c_no = o.o_cno
 group by 공급회사명, 주문일자;
 

-- 주문현황 조회
select	c.c_name as 고객상호명,
		p.p_name as 품목명,
		o.o_qty as 주문수량,
		p.p_price*o.o_qty as 주문가격,
		o.o_date as 주문일자,
		(case when o.o_ok = 1 then 'Y'	when o.o_ok = 0 then 'N' end) as 주문확인
  from client c natural join product p natural join `order` o
 where c.c_no = o.o_cno and p.p_no = o.o_pno;