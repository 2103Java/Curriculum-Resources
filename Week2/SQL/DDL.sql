-- DDL : Data Definitional Language 
-- Is what allows us to manage our table structures altogether. 

--CREATE
--DROP : removes the records and the table structure.
--TRUNCATE : removes all the records, but the table structure stays in tact. 
--ALTER : Changing the structure of the table. 

--Databases can have multiple schemas, they define a collection of database objects, that are to 
--	be associated with a database. 

drop table fruits;

truncate table fruits;

create table fruits(

	colour varchar(15),
	fruit_name varchar(30) not null unique,
	isBerry boolean,
	expirationDate date,
	amount smallint

)

alter table fruits alter isBerry set not null;



