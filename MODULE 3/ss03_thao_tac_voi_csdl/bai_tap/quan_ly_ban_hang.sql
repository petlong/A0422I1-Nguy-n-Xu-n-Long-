create database quan_ly_ban_hang;
use quan_ly_ban_hang;
--- drop database quan_ly_ban_hang;

create table customer(
cId int auto_increment primary key,
cName varchar (25) not null,
cAge tinyint
);

create table product(
pId int auto_increment primary key,
pName varchar(25) not null,
cPrice int
);

create table `order`(
oId int auto_increment primary key,
oDate date not null,
oTotalPrice int,
cId int,
foreign key (cId) references customer(cId)
);

create table oder_detail(
oId int ,
pId int ,
odQTY int not null,
primary key (oId, pId),
foreign key (oId) references `order`(oId),
foreign key (pId) references product(pId)
);

insert into customer
value 	(1, 'Minh Quan',10),
		(2, 'Ngoc Oanh',20),
        (3, 'Hong Ha',50);
        
insert into `order`	
value 	(1,'2006-03-21', null,1),
		(2,'2006-03-23', null,2),
        (3,'2006-03-16', null,1);    

insert into product
value 	(1,'May Giat',3),
		(2,'Tu Lanh',5),
        (3,'Dieu Hoa',7),
        (4,'Quat',1),
        (5,'Bep Dien',2);
        
insert into oder_detail
value 	(1,1,3),
		(1,3,5),
        (1,4,7),
        (2,1,1),
        (3,1,2),       
		(2,5,1),
        (2,3,2);  
        
---- 1 Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng `Order`       
select oId, oDate, oTotalPrice
from `order`;

--- 2 Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.cId, c.cName, c.cAge, p.pName as ten_san_pham, o.oDate
from customer c  
inner join `order` o on c.cId = o.cId   
inner join oder_detail od on o.oId = od.oId
inner join product p on od.pId = p.pId;

--- 3 Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

---- 4 Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
---- giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
---- Giá bán của từng loại được tính = odQTY*pPrice
select o.oId, o.oDate, p.pId, sum(od.odQTY * p.cPrice)  as 'total_price_order' 
from `order` o 
inner join oder_detail od on o.oId = od.oId
inner join product p on od.pId = p.pId
group by o.oId;

 

        