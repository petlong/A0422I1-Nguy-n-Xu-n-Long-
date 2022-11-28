create database product_exam;

create table category(
category_id int unique,
category_name varchar(45)
);


create table product(
product_id int primary key auto_increment,  -- k innsert
product_name varchar(255) not null,
product_price double not null,
product_quantity int not null,
product_color varchar(255) not null,
product_description varchar(255),
category_id int not null,
foreign key (category_id) references category(category_id)
);

update product set product_name = 'as', product_price = 1, product_quantity = 1, product_color = 'cl', category_id = 1 where product_id = 1;

insert into category
values ( 1, 'phone'),
		(2, 'television');
        
insert into product (product_name,
product_price,
product_quantity,
product_color,
category_id)
values ('iPhone 11', 799, 12, 'Purple, Yellow, Green', 1),
('iPhone 11 Pro', 1100, 12, 'Green, Black, White', 1),
('iPhone X', 749, 13, 'Coral, black, blue', 1),
('Smart tivi màn hình cong 4kUHD 49 inch RU7300', 10000, 5, 'Black', 2),
('Samsung glaxy S10 E', 420, 10, 'Prism White, Prism Blue, Ceramic Black', 1);
