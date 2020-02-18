-- 스윙 프로젝트
DROP SCHEMA IF EXISTS yi_java3st_1team;

-- 스윙 프로젝트
CREATE SCHEMA yi_java3st_1team;

-- 매입
CREATE TABLE yi_java3st_1team.SUPPLIER_PURCHASE (
	sp_no   INTEGER NOT NULL COMMENT '매입번호', -- 매입번호
	sp_pno  INTEGER NOT NULL COMMENT '품목번호', -- 품목번호
	sp_date DATE    NOT NULL COMMENT '매입일자', -- 매입일자
	sp_qty  INTEGER NOT NULL COMMENT '매입수량' -- 매입수량
)
COMMENT '매입';

-- 매입
ALTER TABLE yi_java3st_1team.SUPPLIER_PURCHASE
	ADD CONSTRAINT PK_SUPPLIER_PURCHASE -- 매입 기본키
		PRIMARY KEY (
			sp_no -- 매입번호
		);

-- 발주
CREATE TABLE yi_java3st_1team.SUPPLIER_ORDER (
	so_no   INTEGER NOT NULL COMMENT '발주번호', -- 발주번호
	so_pno  INTEGER NOT NULL COMMENT '품목번호', -- 품목번호
	so_date DATE    NOT NULL COMMENT '발주일자', -- 발주일자
	so_qty  INTEGER NOT NULL COMMENT '발주수량' -- 발주수량
)
COMMENT '발주';

-- 발주
ALTER TABLE yi_java3st_1team.SUPPLIER_ORDER
	ADD CONSTRAINT PK_SUPPLIER_ORDER -- 발주 기본키
		PRIMARY KEY (
			so_no -- 발주번호
		);

-- 출고
CREATE TABLE yi_java3st_1team.CLIENT_DELIVERY (
	cd_no   INTEGER NOT NULL COMMENT '출고번호', -- 출고번호
	cd_sno  INTEGER NOT NULL COMMENT '주문번호', -- 주문번호
	cd_date DATE    NOT NULL COMMENT '출고일자' -- 출고일자
)
COMMENT '출고';

-- 출고
ALTER TABLE yi_java3st_1team.CLIENT_DELIVERY
	ADD CONSTRAINT PK_CLIENT_DELIVERY -- 출고 기본키
		PRIMARY KEY (
			cd_no -- 출고번호
		);

-- 분류
CREATE TABLE yi_java3st_1team.CATEGORY (
	cate_no   INTEGER     NOT NULL COMMENT '분류번호', -- 분류번호
	cate_name VARCHAR(10) NOT NULL COMMENT '분류명' -- 분류명
)
COMMENT '분류';

-- 분류
ALTER TABLE yi_java3st_1team.CATEGORY
	ADD CONSTRAINT PK_CATEGORY -- 분류 기본키
		PRIMARY KEY (
			cate_no -- 분류번호
		);

-- 판매현황
CREATE TABLE yi_java3st_1team.ORDER (
	o_no   INTEGER      NOT NULL COMMENT '주문번호', -- 주문번호
	o_date DATE         NOT NULL COMMENT '주문일자', -- 주문일자
	o_cno  INTEGER      NOT NULL COMMENT '고객번호', -- 고객번호
	o_pno  INTEGER      NOT NULL COMMENT '품목번호', -- 품목번호
	o_qty  INTEGER      NOT NULL COMMENT '주문수량', -- 주문수량
	o_memo VARCHAR(255) NULL     COMMENT '주문요구사항', -- 주문요구사항
	o_dps  BOOLEAN      NULL     COMMENT '입금여부', -- 입금여부
	o_ok   BOOLEAN      NULL     COMMENT '주문완료', -- 주문완료
	o_eno  INTEGER      NULL     COMMENT '주문담당자' -- 주문담당자
)
COMMENT '판매현황';

-- 판매현황
ALTER TABLE yi_java3st_1team.ORDER
	ADD CONSTRAINT PK_ORDER -- 판매현황 기본키
		PRIMARY KEY (
			o_no -- 주문번호
		);

-- 재고수량
CREATE TABLE yi_java3st_1team.INVENTORY_QUANTITY (
	iq_no  INTEGER NOT NULL COMMENT '재고번호', -- 재고번호
	iq_pno INTEGER NOT NULL COMMENT '품목번호', -- 품목번호
	iq_qty INTEGER NOT NULL COMMENT '재고수량' -- 재고수량
)
COMMENT '재고수량';

-- 재고수량
ALTER TABLE yi_java3st_1team.INVENTORY_QUANTITY
	ADD CONSTRAINT PK_INVENTORY_QUANTITY -- 재고수량 기본키
		PRIMARY KEY (
			iq_no -- 재고번호
		);

-- 소프트웨어
CREATE TABLE yi_java3st_1team.PRODUCT (
	p_no    INTEGER     NOT NULL COMMENT '품목번호', -- 품목번호
	p_cate  INTEGER     NULL     COMMENT '분류', -- 분류
	p_name  VARCHAR(50) NOT NULL COMMENT '품목명', -- 품목명
	p_cost  INTEGER     NOT NULL COMMENT '공급가격', -- 공급가격
	p_price INTEGER     NOT NULL COMMENT '판매가격', -- 판매가격
	p_sno   INTEGER     NULL     COMMENT '공급회사번호', -- 공급회사번호
	p_qty   INTEGER     NOT NULL COMMENT '최초재고수량', -- 최초재고수량
	p_date  DATE        NOT NULL COMMENT '최초등록일자', -- 최초등록일자
	p_pic   LONGBLOB    NULL     COMMENT '품목이미지' -- 품목이미지
)
COMMENT '소프트웨어';

-- 소프트웨어
ALTER TABLE yi_java3st_1team.PRODUCT
	ADD CONSTRAINT PK_PRODUCT -- 소프트웨어 기본키
		PRIMARY KEY (
			p_no -- 품목번호
		);

-- 고객사
CREATE TABLE yi_java3st_1team.CLIENT (
	c_no       INTEGER      NOT NULL COMMENT '고객번호', -- 고객번호
	c_name     VARCHAR(50)  NOT NULL COMMENT '상호명', -- 상호명
	c_ceo      VARCHAR(50)  NULL     COMMENT '대표명', -- 대표명
	c_address  VARCHAR(255) NOT NULL COMMENT '주소', -- 주소
	c_tel      VARCHAR(30)  NOT NULL COMMENT '전화번호', -- 전화번호
	c_id       VARCHAR(30)  NOT NULL COMMENT 'ID', -- ID
	c_pw       VARCHAR(30)  NOT NULL COMMENT 'PW', -- PW
	c_mail     VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
	c_salseman INTEGER      NULL     COMMENT '영업담당직원' -- 영업담당직원
)
COMMENT '고객사';

-- 고객사
ALTER TABLE yi_java3st_1team.CLIENT
	ADD CONSTRAINT PK_CLIENT -- 고객사 기본키
		PRIMARY KEY (
			c_no -- 고객번호
		);

-- 공급회사
CREATE TABLE yi_java3st_1team.SUPPLIER (
	s_no      INTEGER      NOT NULL COMMENT '회사번호', -- 회사번호
	s_name    VARCHAR(50)  NOT NULL COMMENT '회사명', -- 회사명
	s_bln     VARCHAR(30)  NOT NULL COMMENT '사업자등록번호', -- 사업자등록번호
	s_address VARCHAR(255) NULL     COMMENT '주소', -- 주소
	s_tel     VARCHAR(30)  NOT NULL COMMENT '전화번호', -- 전화번호
	s_fax     VARCHAR(30)  NULL     COMMENT 'FAX 번호' -- FAX 번호
)
COMMENT '공급회사';

-- 공급회사
ALTER TABLE yi_java3st_1team.SUPPLIER
	ADD CONSTRAINT PK_SUPPLIER -- 공급회사 기본키
		PRIMARY KEY (
			s_no -- 회사번호
		);

-- 우편번호
CREATE TABLE yi_java3st_1team.ZIP_CODE (
	z_code    VARCHAR(30) NULL COMMENT '우편번호', -- 우편번호
	z_sido    VARCHAR(30) NULL COMMENT '시도', -- 시도
	z_sigungu VARCHAR(30) NULL COMMENT '시군구', -- 시군구
	z_doro    VARCHAR(30) NULL COMMENT '도로명', -- 도로명
	z_num1    INTEGER     NULL COMMENT '상세주소1', -- 상세주소1
	z_num2    INTEGER     NULL COMMENT '상세주소2' -- 상세주소2
)
COMMENT '우편번호';

-- 할인율
CREATE TABLE yi_java3st_1team.DISCOUNT_RATE (
	dr_qty  INTEGER NULL COMMENT '수량', -- 수량
	dr_rate INTEGER NULL COMMENT '할인율' -- 할인율
)
COMMENT '할인율';

-- 직원
CREATE TABLE yi_java3st_1team.EMPLOYEE (
	e_no      INTEGER     NOT NULL COMMENT '사원번호', -- 사원번호
	e_name    VARCHAR(50) NOT NULL COMMENT '사원명', -- 사원명
	e_dept    INTEGER     NOT NULL COMMENT '부서번호', -- 부서번호
	e_title   VARCHAR(10) NOT NULL COMMENT '직책', -- 직책
	e_manager BOOLEAN     NOT NULL COMMENT '관리자구분', -- 관리자구분
	e_id      VARCHAR(30) NOT NULL COMMENT 'ID', -- ID
	e_pw      VARCHAR(30) NOT NULL COMMENT 'PW', -- PW
	e_mail    VARCHAR(40) NOT NULL COMMENT '이메일' -- 이메일
)
COMMENT '직원';

-- 직원
ALTER TABLE yi_java3st_1team.EMPLOYEE
	ADD CONSTRAINT PK_EMPLOYEE -- 직원 기본키
		PRIMARY KEY (
			e_no -- 사원번호
		);

-- 부서
CREATE TABLE yi_java3st_1team.DEPARTMENT (
	d_no    INTEGER     NOT NULL COMMENT '부서번호', -- 부서번호
	d_name  VARCHAR(50) NOT NULL COMMENT '부서명', -- 부서명
	d_floor INTEGER     NOT NULL COMMENT 'floor' -- floor
)
COMMENT '부서';

-- 부서
ALTER TABLE yi_java3st_1team.DEPARTMENT
	ADD CONSTRAINT PK_DEPARTMENT -- 부서 기본키
		PRIMARY KEY (
			d_no -- 부서번호
		);

-- 매입
ALTER TABLE yi_java3st_1team.SUPPLIER_PURCHASE
	ADD CONSTRAINT FK_PRODUCT_TO_SUPPLIER_PURCHASE -- 소프트웨어 -> 매입
		FOREIGN KEY (
			sp_pno -- 품목번호
		)
		REFERENCES yi_java3st_1team.PRODUCT ( -- 소프트웨어
			p_no -- 품목번호
		);

-- 발주
ALTER TABLE yi_java3st_1team.SUPPLIER_ORDER
	ADD CONSTRAINT FK_PRODUCT_TO_SUPPLIER_ORDER -- 소프트웨어 -> 발주
		FOREIGN KEY (
			so_pno -- 품목번호
		)
		REFERENCES yi_java3st_1team.PRODUCT ( -- 소프트웨어
			p_no -- 품목번호
		);

-- 출고
ALTER TABLE yi_java3st_1team.CLIENT_DELIVERY
	ADD CONSTRAINT FK_ORDER_TO_CLIENT_DELIVERY -- 판매현황 -> 출고
		FOREIGN KEY (
			cd_sno -- 주문번호
		)
		REFERENCES yi_java3st_1team.ORDER ( -- 판매현황
			o_no -- 주문번호
		);

-- 판매현황
ALTER TABLE yi_java3st_1team.ORDER
	ADD CONSTRAINT FK_PRODUCT_TO_ORDER -- 소프트웨어 -> 판매현황
		FOREIGN KEY (
			o_pno -- 품목번호
		)
		REFERENCES yi_java3st_1team.PRODUCT ( -- 소프트웨어
			p_no -- 품목번호
		);

-- 판매현황
ALTER TABLE yi_java3st_1team.ORDER
	ADD CONSTRAINT FK_CLIENT_TO_ORDER -- 고객사 -> 판매현황
		FOREIGN KEY (
			o_cno -- 고객번호
		)
		REFERENCES yi_java3st_1team.CLIENT ( -- 고객사
			c_no -- 고객번호
		);

-- 재고수량
ALTER TABLE yi_java3st_1team.INVENTORY_QUANTITY
	ADD CONSTRAINT FK_PRODUCT_TO_INVENTORY_QUANTITY -- 소프트웨어 -> 재고수량
		FOREIGN KEY (
			iq_pno -- 품목번호
		)
		REFERENCES yi_java3st_1team.PRODUCT ( -- 소프트웨어
			p_no -- 품목번호
		);

-- 소프트웨어
ALTER TABLE yi_java3st_1team.PRODUCT
	ADD CONSTRAINT FK_SUPPLIER_TO_PRODUCT -- 공급회사 -> 소프트웨어
		FOREIGN KEY (
			p_sno -- 공급회사번호
		)
		REFERENCES yi_java3st_1team.SUPPLIER ( -- 공급회사
			s_no -- 회사번호
		);

-- 소프트웨어
ALTER TABLE yi_java3st_1team.PRODUCT
	ADD CONSTRAINT FK_CATEGORY_TO_PRODUCT -- 분류 -> 소프트웨어
		FOREIGN KEY (
			p_cate -- 분류
		)
		REFERENCES yi_java3st_1team.CATEGORY ( -- 분류
			cate_no -- 분류번호
		);

-- 직원
ALTER TABLE yi_java3st_1team.EMPLOYEE
	ADD CONSTRAINT FK_DEPARTMENT_TO_EMPLOYEE -- 부서 -> 직원
		FOREIGN KEY (
			e_dept -- 부서번호
		)
		REFERENCES yi_java3st_1team.DEPARTMENT ( -- 부서
			d_no -- 부서번호
		);