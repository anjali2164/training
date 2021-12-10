use hrdatabase;

create table slocations (location_id int(4) not null, 
street_address varchar(40), 
postal_code varchar(12), city varchar(30) not null, 
state_province varchar(25), 
country_id int 
);

