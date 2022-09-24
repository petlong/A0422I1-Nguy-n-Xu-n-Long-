create database quan_ly_ban_hang;
use quan_ly_ban_hang;
----- drop database quan_ly_ban_hang;----

create table customer(
cId varchar(20) not null primary key,
cName varchar(50) not null,
cAge int
);

create table product(
pId varchar(20) not null primary key,
pName varchar(50) not null,
cPrice float not null
);

create table oder(
oId varchar(20) not null primary key,
oDate datetime not null,
oTotalPrice float not null,
cId varchar(20) not null,
foreign key (cId) references customer(cId)
);

create table oderDetail(
oId varchar(20) not null,
pId varchar(20) not null,
odQTY int not null,
primary key (oId, pId),
foreign key (oId) references oder(oId),
foreign key (pId) references product(pId)
);