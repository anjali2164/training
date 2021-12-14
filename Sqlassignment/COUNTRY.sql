use hrdatabase;

create table country (
country_id char(4) NOT NULL, country_name varchar(40), region_id int);

insert into country (country_id, country_name, region_id) values(344, 'chinna', 1);
insert into country (country_id, country_name, region_id) values(356, 'india', 2);
insert into country (country_id, country_name, region_id) values(352, 'ISLAND',3);
SELECT * FROM COUNTRY;
