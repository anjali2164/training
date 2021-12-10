use hrdatabase;

create table sjob (job_id varchar(10) NOT NULL, job_title varchar(15), min_salary int, max_salary int);
insert into sjob (job_id, job_title, min_salary, max_salary) values('it', 'PROGRAMAR', 4000, 50000);
insert into sjob (job_id, job_title, min_salary, max_salary) values('AC', 'ACCOUNT', 4000, 50000);
insert into sjob (job_id, job_title, min_salary, max_salary) values('ST', 'CLERK', 4000, 50000);

SELECT * FROM SJOB;