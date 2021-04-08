--Creating tables to efficiently store information

-- 1NF --> 6NF

-- 1NF : We need a primary key ! Also need atomic columns.  'The Key'

-- 2NF : You need to first achieve 1NF. No partial dependencies! 'The whole key'

-- 3NF: Achieve 2nd NF. No Transitive dependencies.'Nothing but they key'

-- 'The key, the whole key and nothing but the key'


--What does it mean for something to be transitive. 

-- a > b
-- b > c
-- -> a > c

-- Atomic columns, can't be split up futher. 


--Primary Key : unique identifier for a record!
--Foreign key : references a primary key in another table 
--Candidate Key : is a column, that can acts as a primary key (but is NOT a primary key)
--Composite Key : is multiple columns that can acts as a primary key. 

select * from users where user_id = 1;

select * from users 


create table users( 
	user_id serial8 primary key, -- same as unique and not-null and desginates as the 'primary' way of selecting records
	
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	
	street_address varchar(30),
	city varchar(30),
	state char(2),
	zip_code char(5),
	
	date_of_birth date,
	driver_id char(8) -- Candidate key column 
);

select * from users;

insert into 
	users 
	values
	('bob','mcbob','12 fake street','Dallas','TX','12345','1990-12-1','12345678');

drop table users cascade;

select * from users;

select * from users where name = 'Bob McBob' and age = '22' and address= '123 sideroad, Alska, 12345' and date_of_birth = '1990-12-01';

select name from users where age = 11;

insert into users values 
	('Stevey "McSteve" McBob',11,'123 sideroad, Alska, 12345','2000-12-1','123-1241');

