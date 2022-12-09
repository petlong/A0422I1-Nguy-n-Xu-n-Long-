create database orm2;
use orm2;

create table student (
id varchar (50),
`name` varchar(45),
age int,
address varchar(45),
primary key(id)
);

insert into student
value ('1', 'Nam',20, 'Đà Nẵng');
