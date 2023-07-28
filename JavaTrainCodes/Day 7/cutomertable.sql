create schema ecom;

use  ecom;

create table customers(
	customerId int not null auto_increment primary key,
    firstName varchar(20) not null,
    lastName varchar(20) not null,
    email varchar(20) not null,
    Password varchar(20) not null
);
create table categories(
categoryId int not null auto_increment primary key,
name varchar(20) not null
);

create table products(
productId int not null auto_increment primary key,
name varchar(20) not null,
price decimal(5,2) not null	,
categoryId int not null,
foreign key(categoryId) references
categories(categoryId)
);

create table customer_orders(
orderId int not null auto_increment primary key,
customerId int not null,
orderDate date not null,
foreign key(customerId) references
customers(customerId)
);

create table order_products(
orderId int not null,
productId int not null,
quantity int not null,
primary key(orderId,productId),
foreign key(orderId) references
customer_orders(orderId),
foreign key(productId) references
products(productId)
);

insert into customers(`firstName`, `customerId`, `lastName`, `email`, `Password`)
values('rajesh',123,'G','rajesh@gmail.com',12344),('raj',345,'t','taj@gamil.com',45664);

 insert into categories values(123,"Rajesh"),(345,"Ram"),(111,"Par");

insert into products ( name,price,categoryId) 
values("Rak",45.44,123);

insert into products(name,price,categoryId) values("Ram",12.67,345),("RRR",45.90,111);
select * from products,categories,customers;
insert into customer_orders (customerId,orderDate)values(123,"2030-03-01"),(345,"2022-04-30");
select * from customer_orders;
select * from products;

insert into order_products(orderId,productId,quantity) values(1,1,2);

select categories.categoryId,categories.name,products.name,products.price
from categories
INNER JOIN products
ON categories.categoryId=products.categoryId;

select c.categoryId,c.name,p.name,p.price
from categories as c
INNER JOIN products as p
ON c.categoryId=p.categoryId;

select c.firstName,co.orderDate 
from customers as c
inner join customer_orders as co
on c.customerID=co.customerID;
select * from customer_orders;

select firstName from customers where customerId in(select orderId from customer_orders where 
orderId in(select productId from products ));

##get the details of the customers whether they have purchased somthing or not
select c.firstName ,co.orderDate
from customers as c
left join customer_orders as co
on c.customerId=co.customerId;

select c.firstName ,co.orderDate
from customers as c
right join customer_orders as co
on c.customerId=co.customerId;




