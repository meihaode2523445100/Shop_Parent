create database db_msg;

use db_msg;

#1����Ϣ��
create table message(id bigint primary key AUTO_INCREMENT,pcode int,type int,
title varchar(50),content varchar(100),receive varchar(20),flag int);

#2����Ϣ��ˮ��
create table messagelog(id bigint primary key AUTO_INCREMENT,mid int,createtime datetime,
ip varchar(20),info varchar(100));

#3�����ռ�¼
create table msgreceive(id bigint primary key AUTO_INCREMENT,no varchar(20),createtime datetime,flag int);
