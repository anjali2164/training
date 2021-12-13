create database dxc;

use dxc;

create table department( Department_id int  not null, department_name varchar(30), manager_id int, locate_id int);
insert into sjob ( Department_id, department_title, manager_id,locate_id) values(null, 'human source', 400, 1499);
select * from department;