-- 고객별 판매현황 조회
-- 총 매출금
select SUM(o.o_qty * p.p_price)
  from `order` o natural join product p
 where p.p_no = o.o_pno;
 
-- 총 미수금
select SUM(o.o_qty * p.p_price)
  from `order` o natural join product p
 where p.p_no = o.o_pno and o.o_dps = '0';


-- SW별 판매현황 조회
-- 총 판매금액
select SUM(o.o_qty * p.p_price)
  from `order` o natural join product p
 where p.p_no = o.o_pno;
 
-- 총 판매이윤
select	SUM(case when (o.o_qty >= 50 and o.o_qty < 100) then o.o_qty*p.p_price*0.9-(o.o_qty*p.p_cost)
			  when o.o_qty >= 100 then o.o_qty*p.p_price*0.85-(o.o_qty*p.p_cost)
		 else (o.o_qty*p.p_price)-(o.o_qty*p.p_cost)	end) as 판매이윤
  from product p natural join `order` o
 where p.p_no = o.o_pno;

-- 전체 판매 현황 / 거래명세서
-- 총 판매금액
select SUM(o.o_qty * p.p_price)
  from `order` o natural join product p
 where p.p_no = o.o_pno;
 
-- 총 납품금액
select SUM(o.o_qty*p.p_price+o.o_qty*p.p_price*0.1)
  from `order` o natural join product p
 where p.p_no = o.o_pno;