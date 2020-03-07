select user(), database();

drop table product;
create table product(
	code char(4) not null,
	name varchar(10) not null,
	primary key (code)
);

desc product;

insert into product values
('A001', '아메리카노'),
('A002', '카푸치노'),
('A003', '헤이즐넛'),
('A004', '에스프레소'),
('B001', '딸기쉐이크'),
('B002', '후르츠와인'),
('B003', '팥빙수'),
('B004', '아이스초코');

select * from product;