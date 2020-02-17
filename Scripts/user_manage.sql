-- 사용자 추가
drop user if exists 'jane_yi_java3st_1team'@'192.168.10.%';
grant all privileges on yi_java3st_1team.* to 'jane_yi_java3st_1team'@'192.168.10.%'
identified by 'rootroot';
flush privileges;