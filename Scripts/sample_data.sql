
load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/supplier.txt'
into table yi_java3st_1team.supplier
character set 'utf8'
fields terminated by ',';

select * from supplier s ;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/category.txt'
into table yi_java3st_1team.category 
character set 'utf8'
fields terminated by ',';

select * from category c;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/client.txt'
into table yi_java3st_1team.client
character set 'utf8'
fields terminated by ',';

select * from client c ;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/department.txt'
into table yi_java3st_1team.department 
character set 'utf8'
fields terminated by ',';

select * from department d ;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/employee.txt'
into table yi_java3st_1team.employee 
character set 'utf8'
fields terminated by ',';

select * from employee e ;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/product.txt'
into table yi_java3st_1team.product 
character set 'utf8'
fields terminated by ',';

select * from product p ;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/zip_code/ulsan.txt'
into table yi_java3st_1team.zip_code
character set 'utf8'
fields terminated by ',';

select * from zip_code zc ;

load data local infile 'D:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/order.txt'
into table yi_java3st_1team.order
character set 'utf8'
fields terminated by ',';

select * from `order` o ;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/client_delivery.txt'
into table yi_java3st_1team.client_delivery 
character set 'utf8'
fields terminated by ',';

select * from client_delivery cd;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/discount_rate.txt'
into table yi_java3st_1team.discount_rate 
character set 'utf8'
fields terminated by ',';

select * from discount_rate;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/supplier_order.txt'
into table yi_java3st_1team.supplier_order 
character set 'utf8'
fields terminated by ',';

select * from supplier_order so ;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/supplier_purchase.txt'
into table yi_java3st_1team.supplier_purchase
character set 'utf8'
fields terminated by ',';

select * from supplier_purchase;

load data local infile 'E:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/inventory_quantity.txt'
into table yi_java3st_1team.inventory_quantity 
character set 'utf8'
fields terminated by ',';

select * from inventory_quantity iq ;