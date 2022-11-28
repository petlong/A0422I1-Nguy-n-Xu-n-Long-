create database exam;
use exam;

create table category(
category_id int primary key auto_increment,
category_name varchar(45)
);

create table product(
product_id int primary key auto_increment,
product_name varchar(45),
product_price float,
product_color varchar(45),
product_description varchar(100),
product_category_id int,
foreign key(product_category_id) references category(category_id)
);

