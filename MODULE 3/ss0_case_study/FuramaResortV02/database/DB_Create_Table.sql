create database CaseStudy_Furama_E;
use CaseStudy_Furama_E;

create table CaseStudy_Furama_E.`position`(
position_id int primary key auto_increment,
position_name varchar(45)
);

create table CaseStudy_Furama_E.education_degree(
education_degree_id int primary key auto_increment,
education_degree_name varchar(45)
);

create table CaseStudy_Furama_E.division(
division_id int primary key auto_increment,
division_name varchar(45)
);

create table CaseStudy_Furama_E.`user`(
username varchar(255) primary key,
`password` varchar(255)
);

create table CaseStudy_Furama_E.`role`(
role_id int primary key auto_increment,
role_name varchar(255)
);

create table CaseStudy_Furama_E.user_role(
role_id int not null auto_increment,
username varchar(255) not null,
foreign key (role_id) references CaseStudy_Furama_E.`role`(role_id),
foreign key (username) references CaseStudy_Furama_E.`user`(username)
);

create table CaseStudy_Furama_E.employee(
employee_id int primary key auto_increment,
employee_name varchar(45) not null,
employee_birthday date not null,
employee_id_card varchar(45) not null,
employee_salary double not null,
employee_phone varchar(45) not null,
employee_email varchar(45),
employee_address varchar(45),
position_id int not null,
education_degree_id int not null,
division_id int not null,
username varchar(255),
foreign key (position_id) references casestudy_furama_e.`position`(position_id),
foreign key (education_degree_id) references casestudy_furama_e.education_degree(education_degree_id),
foreign key (division_id) references casestudy_furama_e.division(division_id),
foreign key (username) references casestudy_furama_e.`user`(username)
);

create table CaseStudy_Furama_E.customer_type(
customer_type_id int primary key auto_increment,
customer_type_name varchar(45)
);

create table CaseStudy_Furama_E.customer(
customer_id int primary key auto_increment,
customer_type_id int not null,
customer_name varchar(45) not null,
customer_birthday date not null,
customer_gender bit(10) not null,
customer_id_card varchar(45) not null,
customer_phone varchar(45) not null,
customer_email varchar(45),
customer_address varchar(45),
foreign key (customer_type_id) references casestudy_furama_e.customer_type (customer_type_id)
);

create table casestudy_furama_e.service_type(
service_type_id int primary key auto_increment,
service_type_name varchar(45)
);

create table casestudy_furama_e.rent_type(
rent_type_id int primary key auto_increment,
rent_type_name varchar(45),
rent_type_cost double
);

create table casestudy_furama_e.service(
service_id int primary key auto_increment,
service_name varchar(45) not null,
service_area int,
service_cost double not null,
service_max_people int,
rent_type_id int not null,
service_type_id int not null,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,
foreign key (rent_type_id) references casestudy_furama_e.rent_type (rent_type_id),
foreign key (service_type_id) references casestudy_furama_e.service_type (service_type_id)
);

create table casestudy_furama_e.attach_service(
attach_service_id int primary key auto_increment,
attach_service_name varchar(45) not null,
attach_service_cost double not null,
attach_service_unit int not null,
attach_service_status varchar(45)
);


create table casestudy_furama_e.contract(
contract_id int primary key auto_increment, 
contract_start_date datetime not null,
contract_end_date datetime not null,
contract_deposit double not null,
contract_total_money double not null,
employee_id int  not null,
customer_id int not null,
service_id int not null,
foreign key (employee_id) references casestudy_furama_e.employee (employee_id),
foreign key (customer_id) references casestudy_furama_e.customer (customer_id),
foreign key (service_id) references casestudy_furama_e.service (service_id)
);


create table casestudy_furama_e.contract_detail(
contract_detail_id int primary key auto_increment,
contract_id int not null,
attach_service_id int not null,
quantity int not null,
foreign key (contract_id) references casestudy_furama_e.contract(contract_id),
foreign key (attach_service_id) references casestudy_furama_e.attach_service(attach_service_id)
);


-- insert value--

insert into position (position_name)
values ( 'Quản lý'),
		( 'Nhân viên');

insert into education_degree (education_degree_name)
values ('Trung Cấp'),
		('Cao Đẳng'),
        ('Đại Học'),
        ('Sau đại học');

insert into division (division_name)
values ('Sale-Marketing'),
		('Hành chính'),
        ('Phục vụ'),
        ('Quản lý');
        
insert into user
values ("An.nv", "1234"),
		("Binh.lv", "1234"),
		("Yen.ht", "1234"),
		("Toan.vc", "1234"),
		("Phat.nb", "1234"),
		("Nghi.nka", "1234"),
		("Ha.nh", "1234"),
		("Dong.nh", "1234"),
		("Hoang.t", "1234"),
		("Dao.nc", "1234");



insert into employee (
employee_name ,
employee_birthday ,
employee_id_card ,
employee_salary ,
employee_phone ,
employee_email ,
employee_address ,
position_id ,
education_degree_id ,
division_id ,
username )
values ('Nguyễn Văn An', '1970-11-07', '456231786', 10000000, '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng', 1, 3, 1, "An.nv"),
		('Lê Văn Bình', '1997-04-09', '654231234', 7000000, '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', 1, 2, 2, "Binh.lv"),
        ('Hồ Thị Yến', '1995-12-12', '999231723', 14000000, '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', 1, 3, 2, "Yen.ht"),
        ('Võ Công Toản', '1980-04-04', '123231365', 17000000, '0374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', 1, 4, 4, "Toan.vc"),
        ('Nguyễn Bỉnh Phát', '1999-12-09', '454363232', 6000000, '0902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng', 2, 1, 1, "Phat.nb"),
        ('Khúc Nguyễn An Nghi', '2000-11-08', '964542311', 7000000, '0978653213', 'annghi20@gmail.com', '294 Nguyễn Tất Thành, Đà Nẵng', 2, 2, 3, "Nghi.nka"),
        ('Nguyễn Hữu Hà', '1993-01-01', '534323231', 8000000, '0941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', 2, 3, 2, "Ha.nh"),
        ('Nguyễn Hà Đông', '1989-09-03', '234414123', 9000000, '0642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', 2, 4, 4, "Dong.nh"),
        ('Tòng Hoang', '1982-09-03', '256781231', 6000000, '0245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', 2, 4, 4, "Hoang.t"),
        ('Nguyễn Công Đạo', '1994-01-08', '755434343', 8000000, '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', 2, 3, 2, "Dao.nc");



	

