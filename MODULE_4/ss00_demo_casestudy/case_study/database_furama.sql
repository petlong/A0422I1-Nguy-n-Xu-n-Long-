create database furama_module4;

insert into furama_module4.`account`
values	('admin',  '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu'),
		('user', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu');
        

insert into furama_module4.`role`
values 	(1, 'ROLE_ADMIN'),
		(2, 'ROLE_USER');
        
insert into furama_module4.account_role
values 	(1,'admin',1),
		(2,'admin',2),
        (3,'user',2);
        
insert into furama_module4.education_degree
values 	(1, 'Trung cấp'),
		(2, 'Cao đẳng'),
		(3, 'Đại học'),
        (4, 'Sau đại học');
        
insert into furama_module4.position
values	(1, 'Lễ tân'),
		(2, 'Phục vụ'),
        (3, 'Chuyên viên'),
        (4, 'Giám sát'),
        (5, 'Quản lý'),
        (6, 'Giám đốc');
        
insert into furama_module4.division
values 	(1, 'Sale - Marketing'),
		(2, 'Hành chính'),
        (3, 'Phục vụ'),
        (4, 'Quản lý');
        
insert into furama_module4.customer_type
values	(1, 'Diamond'),
		(2, 'Plantinum'),
        (3, 'Gold'),
        (4, 'Silver');
        
--

insert into furama_module4.rent_type
values 	(1, 'year', 12000),
		(2, 'month', 1100),
        (3, 'day', 100),
        (4, 'hour', 10);
        
insert into furama_module4.service_type
values 	(1, 'Villa'),
		(2, 'House'),
        (3, 'Room');

insert into furama_module4.attach_service
values 	(1, 50, 'còn', 10, 'Massage'),
		(2, 30, 'còn', 5, 'Karaoke'),
        (3, 10, 'còn', 10, 'Food'),
        (4, 5, 'còn', 10, 'Water'),
        (5, 10, 'còn', 10, 'Thuê xe');
        
insert into furama_module4.customer
values (1,'Đà Nẵng', '1970-11-11', 'thanhnx@gmail.com', 1, '201333222', 'Thành', '0987123456', 1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        