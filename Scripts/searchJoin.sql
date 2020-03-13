-- 고객별 판매현황 조회_ 상호명 조회
drop procedure if exists clientSale;
delimiter $$
create procedure clientSale(
	in in_c_name varchar(50))
begin
	select	c.c_name as 고객상호명,
			p.p_name as 품목명,
			o.o_qty as 주문수량,
			(case o.o_dps when '0' then '미입금' when '1' then '완료'	end) as 입금여부,
			p.p_price as 판매가격,
			o.o_qty*p.p_price as 매출금,
			(case o.o_dps when '0' then o.o_qty*p.p_price when '1' then '0' end) as 미수금
	  from client c natural join `order` o natural join product p
	 where c.c_no = o.o_cno and p.p_no = o.o_pno and c.c_name = in_c_name;
end $$
delimiter ;

call clientSale('전라북도청');


-- S/W별 판매현황 조회_ 품목명 조회
drop procedure if exists swSale;
delimiter $$
create procedure swSale(
	in in_p_name varchar(50))
begin
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
	 where p.p_no = o.o_pno and cate.cate_no = p.p_cate and s.s_no = p.p_sno and p.p_name = in_p_name;
end $$
delimiter ;

call swSale('한글 2020');


-- 날짜별 판매현황 조회_ 날짜 조회
drop procedure if exists dateSale;
delimiter $$
create procedure dateSale(
	in start_o_date date,
	in end_o_date date)
begin
	select	o.o_no as 주문번호,
			c.c_name as 고객상호명,
			p.p_name as 품목명,
			o.o_qty as 주문수량,
			(case o.o_dps when '0' then '미입금'  when '1' then '완료'	end) as 입금여부,
			o.o_date as 주문일자
	  from `order` o natural join client c natural join product p
	 where o.o_cno = c.c_no and p.p_no = o.o_pno and start_o_date <= o.o_date and end_o_date >= o.o_date;
end $$
delimiter ;

call dateSale('2019-03-01', '2019-09-30');


-- 재고현황 조회_ 품목명 조회
drop procedure if exists iq;
delimiter $$
create procedure iq(
	in in_p_name varchar(50))
begin
	select	p.p_name as 품목명,
			s.s_name as 공급회사명,
			iq.iq_qty as 재고수량,
			p.p_price as 판매가격,
			p.p_cost as 공급가격,
			(case when iq.iq_qty < 50 then '재고부족'	  when iq.iq_qty >= 50 and iq.iq_qty < 150 then '적정재고'	  when iq.iq_qty >= 150 then '재고과다'	end) as 재고평가
	  from product p natural join supplier s natural join inventory_quantity iq
	 where s.s_no = p.p_sno and p.p_no = iq.iq_pno and p.p_name = in_p_name;
end $$
delimiter ;

call iq('아르미 Pro');


-- 재고현황 조회_ 재고수량별 조회
-- 재고부족
select	p.p_name as 품목명,
		s.s_name as 공급회사명,
		iq.iq_qty as 재고수량,
		p.p_price as 판매가격,
		p.p_cost as 공급가격,
		'재고부족' as 재고평가
  from product p natural join supplier s natural join inventory_quantity iq
 where s.s_no = p.p_sno and p.p_no = iq.iq_pno and iq.iq_qty < '50';

-- 적정재고
select	p.p_name as 품목명,
		s.s_name as 공급회사명,
		iq.iq_qty as 재고수량,
		p.p_price as 판매가격,
		p.p_cost as 공급가격,
		'적정재고' as 재고평가
  from product p natural join supplier s natural join inventory_quantity iq
 where s.s_no = p.p_sno and p.p_no = iq.iq_pno and '50' <= iq.iq_qty and iq.iq_qty < '150';

-- 재고과다
select	p.p_name as 품목명,
		s.s_name as 공급회사명,
		iq.iq_qty as 재고수량,
		p.p_price as 판매가격,
		p.p_cost as 공급가격,
		'재고과다' as 재고평가
  from product p natural join supplier s natural join inventory_quantity iq
 where s.s_no = p.p_sno and p.p_no = iq.iq_pno and '150' <= iq.iq_qty;


-- 주문현황 조회
drop procedure if exists ordercheck;
delimiter $$
create procedure ordercheck(
	in start_o_date date,
	in end_o_date date)
begin
	select	c.c_name as 고객상호명,
			p.p_name as 품목명,
			o.o_qty as 주문수량,
			p.p_price*o.o_qty as 주문가격,
			o.o_date as 주문일자,
			(case when o.o_ok = 1 then 'Y'	when o.o_ok = 0 then 'N' end) as 주문확인
	  from client c natural join product p natural join `order` o
	 where c.c_no = o.o_cno and p.p_no = o.o_pno and start_o_date <= o.o_date and end_o_date >= o.o_date;
end $$
delimiter ;

call ordercheck('2019-03-01', '2019-09-30');