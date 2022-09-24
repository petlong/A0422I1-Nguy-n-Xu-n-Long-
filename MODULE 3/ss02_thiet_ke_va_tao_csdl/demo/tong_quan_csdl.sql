CREATE DATABASE IF NOT EXISTS c0522g1;
USE c0522g1;

create table class_type(
id int primary key auto_increment,
`name` varchar(20)
);
create table class(
id int primary key auto_increment,
`name` varchar(20),
class_type_id int,
foreign key(class_type_id) references class_type(id)
);

create table jame(
`account` varchar(50) primary key,
`password` varchar(50)
);

create table student(
id int primary key auto_increment,
`name` varchar(50),
birthday date,
gender boolean,
email varchar(50),
`point` int,
`account` varchar(50),
class_id int,
foreign key(`account`) references jame(`account`),
foreign key(class_id) references class(id)
);
create table instructor(
id int primary key auto_increment,
`name` varchar(50),
birthday date,
salary float
);

create table instructor_class (
class_id int,
instructor_id int,
start_time date,
primary key (class_id,instructor_id),
foreign key(class_id) references class(id),
foreign key(instructor_id) references instructor(id)
);
