create database school;

create table students(
_id int not null auto_increment,
name varchar(20),
email varchar(20) null,
course varchar(20) null,
enrollment_date date not null,
primary key(_id));


alter table students
change column _id student_id int not null,
change column name student_name varchar(20) not null;

alter table students 
change column email student_email varchar(30),
change column course student_course varchar(20)  ,
change column enrollment_date course_enrollment_date date null;

alter table students
ADD UNIQUE INDEX `student_email_UNIQUE`(`student_email`) VISIBLE;

insert into students(student_id,student_name,enrollment_date)values(123,'Rakesh','2023-09-01');


select * from students;
