create database quan_ly_don_hang;
use quan_ly_don_hang;
----- drop database quan_ly_don_hang;

create table phieuxuat
(
sopx int primary key,
ngayxuat datetime
);

create table vattu
(
mavt int primary key,
tenvt varchar(50)
);

create table chitietphieuxuat
(
sopx int,
mavt int,
dgxuat float,
slxuat int,
primary key(sopx,mavt),
foreign key(sopx) references phieuxuat(sopx),
foreign key(mavt) references vattu(mavt)
);

create table phieunhap
(
sopn int primary key,
ngaynhap datetime
);

create table chitietphieunhap
(
sopn int,
mavt int,
dgnhap float,
slnhap int,
primary key(sopn,mavt),
foreign key(sopn) references phieunhap(sopn),
foreign key(mavt) references vattu(mavt)
);

create table nhacc
(
mancc int	 primary key,
tenncc varchar(50),
diachi varchar(100)
);

create table dondh(
sodh int primary key,
ngaydh datetime,
mancc int,
foreign key(mancc) references nhacc(mancc)
);

create table chitietdondathang(
sodh int,
mavt int,
primary key(sodh,mavt),
foreign key(sodh) references dondh(sodh),
foreign key(mavt) references vattu(mavt)
);

create table sodienthoai(
masdt int primary key,
sdt varchar(20),
mancc int,
foreign key(mancc) references nhacc(mancc)
);