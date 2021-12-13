use hrdatabase;

create table employees (
employee_id int  not null primary key,
first_name varchar(20),
last_name varchar(20),
email varchar(20) not null,
phone_int varchar(20),
hire_date date not null,
job_id varchar(10) not null,
salary float not null,
commission_pct float,
manager_id int,
department_id int);

insert into employees values (1,'sush','bungatavula','sush@gmail.com','7096412356','2020-12-02','10013','49000','5200','161','1');
insert into employees values (2,'ANJALI','bEKKEM','I216@GMAIL.COM','9087654321','2020-2-02','1034','44300','2254','112','2');
insert into employees values (3,'THARUN','VALISETI','TARUN@GMAIL.COM','7567876547','2020-09-02','10083','9876','5322', '123','3');
