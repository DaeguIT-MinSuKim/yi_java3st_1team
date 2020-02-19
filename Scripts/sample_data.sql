
load data local infile 'D:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/supplier.txt'
into table yi_java3st_1team.supplier
character set 'utf8'
fields terminated by ',';

select * from supplier s ;

load data local infile 'D:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/category.txt'
into table yi_java3st_1team.category 
character set 'utf8'
fields terminated by ',';

select * from category c;

load data local infile 'D:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/client.txt'
into table yi_java3st_1team.client
character set 'utf8'
fields terminated by ',';

select * from client c ;

load data local infile 'D:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/department.txt'
into table yi_java3st_1team.department 
character set 'utf8'
fields terminated by ',';

select * from department d ;

load data local infile 'D:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/employee.txt'
into table yi_java3st_1team.employee 
character set 'utf8'
fields terminated by ',';

select * from employee e ;

load data local infile 'D:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/product.txt'
into table yi_java3st_1team.product 
character set 'utf8'
fields terminated by ',';

select * from product p ;

load data local infile 'D:/workspace/workspace_gradle/yi_java3st_1team/document/sample_data/zip_code/choongbuk.txt'
into table yi_java3st_1team.zip_code
character set 'utf8'
fields terminated by ',';

select * from zip_code zc ;