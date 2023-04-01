drop table IF EXISTS employee;
CREATE TABLE employee
(
 name varchar(100) NOT NULL,
  id varchar(11) NOT NULL,
 PRIMARY KEY (id)
);
insert into employee
values('1','Jack');
insert into employee
values('2','Shrawya');