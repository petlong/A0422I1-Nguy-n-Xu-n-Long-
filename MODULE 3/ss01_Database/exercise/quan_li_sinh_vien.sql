create database student_management;
use student_management;

create table student (
id int,
`name` varchar(45),
age int,
country varchar(45),
primary key(id)
);

create table Class (
id int,
`name` varchar(45)
);

create table Teacher (
id int,
`name` varchar(45),
age int,
country varchar(45),
primary key(id)
);