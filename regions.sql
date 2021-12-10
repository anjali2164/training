use hrdatabase;
create table regions (region_id int not null, region_name varchar(25) unique);
insert into regions (region_id, region_name) values(3,'hhk');
insert into regions (region_id, region_name) values(2,'hgf');
insert into regions (region_id, region_name) values(1,'jhg');

select * from regions;

