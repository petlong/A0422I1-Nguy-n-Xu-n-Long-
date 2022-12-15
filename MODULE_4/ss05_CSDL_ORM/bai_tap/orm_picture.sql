create database orm_picture;
use orm_picture;

create table `Comment` (
id int,
author varchar(50),
feedback varchar(250),
`like` int,
primary key(id)
);
