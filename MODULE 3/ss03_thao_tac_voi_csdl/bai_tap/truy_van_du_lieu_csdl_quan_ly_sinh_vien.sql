create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;
-- drop database quan_ly_sinh_vien;

create table class(
class_id int not null auto_increment primary key,
class_name varchar(60) not null,
start_date datetime not null,
`status` bit 
);

create table student(
student_id int not null auto_increment primary key,
student_name varchar(30) not null,
address varchar(50),
phone varchar(20),
`status` bit, 
class_id int not null,
foreign key (class_id) references class(class_id)
);

create table `subject`(
sub_id 	int not null auto_increment primary key,
sub_name varchar(60) not null,
credit tinyint not null default 1 check (credit >=1),
`status` bit default 1
);

create table mark(
mark_id int not null auto_increment primary key,
sub_id int not null,
student_id int not null,
mark float default 0 check (mark between 0 and 100),
exam_time tinyint default 1,
unique(sub_id, student_id),
foreign key (sub_id) references `subject`(sub_id),
foreign key (student_id) references student(student_id)
);

---- thêm dữ liệu 
use quan_ly_sinh_vien;
insert into class
value (1, 'A1', '2008-12-20', 1);
insert into class
value (2, 'A2', '2008-12-22', 1);
insert into class
value (3, 'B3', current_date, 0);

insert into student (student_name, address, phone, `status`, class_id)
value ('Hung', 'Ha Noi', '0912113113', 1, 1);
insert into student (student_name, address,`status`, class_id)
value ('Hoa', 'Hai phong', 1, 1);
insert into student (student_name, address, phone, `status`, class_id)
value ('Manh', 'HCM', '0123123123', 0, 2);

insert into `subject`
value  (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),	
       (4, 'RDBMS', 10, 1);

insert into mark (sub_id, student_id, mark, exam_time)
value  (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);   
       
--- truy vấn dữ liệu       
use quan_ly_sinh_vien;

--- 1 hiển thị danh sách tất cả các học viên
select * 
from student;      

--- 2 hiển thị danh sách tất cả các học viên đang học 
select * 
from student
where `status` = true;

--- 3 danh sách các môn học có thời gian học nhỏ hơn 10
select * 
from  `subject`
where credit < 10;

--- 4 hiển thị danh sách học viên lớp A1
select s.student_id, s.student_name, c.class_name
from student s 
join class c on s.class_id = c.class_id
where c.class_name = 'A1';

--- 5 hiển thị điểm môn CF của các học viên
select s.student_id, s.student_name, sub.sub_name, m.mark
from student s 
join mark m on s.student_id = m.student_id
join `subject` sub on sub.sub_id = m.sub_id
where  sub.sub_name = 'CF';

---- 6 bai tap Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’ (chưa được) 	
select *
from student
where student_name like 'H%';

--- 7 Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12
select *
from class
where (month (start_date)) = 12;

---- 8 Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * 
from  `subject`
where credit >= 3 and credit <=5 ;

---- 9 Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2. ( chưa được)
update student 
set class_id = '2'
where student_name = 'Hung';

--- 10 Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select s.student_name, sub.sub_name, m.mark
from student s 
join mark m on s.student_id = m.student_id
join `subject` sub on sub.sub_id = m.sub_id
order by mark asc, student_name desc; 


