create database thue_exam;
use thue_exam;
create table thanhtoan(
thanhtoan_id int unique,
thanhtoan_name varchar(45)
);


create table thue(
thue_id int primary key auto_increment,
thue_name varchar(255) ,
thue_phone varchar(255),
thue_date date,
thanhtoan_id int,
thanhtoan_note varchar(255),
foreign key (thanhtoan_id) references thanhtoan(thanhtoan_id)
);

insert into thanhtoan
values ( 1, 'month'),
		(2, '3 month'),
		(3, 'year');
        
insert into thue(
thue_name,
thue_phone,
thue_date,
thanhtoan_id,
thue_note
)
values ('Nguyen Van A', 0123456789, '2022-04-11',1,'new'),
('Nguyen Van B', 0123456789, '2022-05-11',2,'old'),
('Nguyen Van c', 0123456789, '2022-06-11',1,'new');
