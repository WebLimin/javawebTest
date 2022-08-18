drop database if exists DBTest;
create database DBTest;
use DBTest;

create table t_User (
uId int unsigned primary key not null auto_increment,
uName varchar(50) not null,
uPass varchar(32) not null
);

INSERT INTO t_user VALUES(NULL,"shangsan","123456");
INSERT INTO t_user VALUES(NULL,"lisi","345678");
INSERT INTO t_user VALUES(NULL,"wangwu","654321");