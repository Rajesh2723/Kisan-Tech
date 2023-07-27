Create schema company;
use company;
create table employee(id int not null,name varchar(20),primary key(id));

insert into employee(id,name) values(9,'Rajesh'),(2,'Rakesh'),(3,'Ramu');
select * from employee;
truncate employee;
drop table employee;
drop schema company;

