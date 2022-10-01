create database demo;
use demo;
create table products(
id int primary key auto_increment,
productcode varchar(20),
productname varchar(50),
productprice float,
productamount int,
productdescription varchar(100),
productstatus bit
);
--  Chèn một số dữ liệu mẫu cho bảng Products.
insert into products (productCode, productName, productPrice, productAmount, productDescription, productStatus)
values	('p1','iphone 4',100,5,'cũ',1),
		('p2','iphone 5',200,10,'cũ',1),
		('p3','iphone 6',300,15,'mới',0),
		('p4','iphone 7',400,20,'mới',0);
        
select *from products;

--  Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create unique index index_productcode on products(productcode);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index index_product on products(productname,productprice);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào 
explain select *from products where productcode='p2';

-- So sánh câu truy vấn trước và sau khi tạo index
drop index index_productcode on products;
-- chưa tạo index
select *from products where productcode='p3';
explain select *from products where productcode='p3';
--  đã tạo index 
create unique index index_productcode on products(productcode);
explain select *from products where productcode='p3';

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products. 
create view view_product as
select productcode, productname, productprice, productstatus 
from products;

select *from view_product;

-- Tiến hành sửa đổi view
 create or replace view  view_product as
select productcode, productname, productprice 
from products;

select *from view_product;

--  Tiến hành xoá view
drop view view_product;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure display_product()
begin
select *from products;
end //
delimiter ;

call display_product();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure add_product(
id int,
productcode varchar(20),
productname varchar(50),
productprice float,
productamount int,
productdescription varchar(100),
productstatus bit)
begin
	insert into products value (id,productCode, productName, productPrice, productAmount, productDescription, productStatus);
end //
delimiter ;

call add_product(5,'p5','iphone x',500,10,'mới',1);

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure update_product_id(
id int,
productcode varchar(20),
productname varchar(50),
productprice float,
productamount int,
productdescription varchar(100),
productstatus bit)
begin
update products 
set productcode = productcode,
	productname = productname,
    productprice = productprice,
    productamount = productamount,
    productdescription = productdescription,
    productstatus = productstatus
where products.id=id;
end //
delimiter ;
call update_product_id(5,'p14','iphone 14',5000,15,'mới',0);

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure delete_product_id(id int)
begin
delete from products where products.id =id;
end //
delimiter ;
call delete_product_id(4);