drop table IF EXISTS employee;
CREATE TABLE employee
(
 name varchar(100) NOT NULL,
  id int NOT NULL,
 PRIMARY KEY (id)
);
insert into employee
values('Jack',1);
insert into employee
values('Shrawya',2);