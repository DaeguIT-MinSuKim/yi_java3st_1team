-- 사용자 추가
drop user if exists 'user_yi_java3st_1team'@'localhost';
grant all privileges on yi_java3st_1team.* to 'user_yi_java3st_1team'@'localhost'
identified by 'rootroot';
flush privileges;