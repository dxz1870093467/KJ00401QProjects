-- 创建并使用数据库：ums_db
drop database if exists ums_db;
create database ums_db character set 'utf8mb4';
use ums_db;

-- 用户信息表：sys_user
drop table if exists sys_user;
create table sys_user(
    id int(10) not null auto_increment comment '主键',
    name varchar(255) not null comment '用户姓名',
    cellphone varchar(100) not null comment '手机号码',
    idCard varchar(100) not null comment '身份证号码',
    email varchar(500) not null comment '电子邮件',
    status int(2) not null default 1 comment '用户状态：0-禁用，1-启用',
    createTime timestamp not null default CURRENT_TIMESTAMP  comment '创建时间',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP  comment '修改时间',
    primary key (id)
)Engine=InnoDB charset='utf8mb4' comment='用户信息表';