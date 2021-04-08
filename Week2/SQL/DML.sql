--DML 
-- Data Manipulation language
-- CREATE. READ, UPDATE, DELETE - CRUD 

--INSERT
--SELECT
--UPDATE 
--DELETE 


insert into fruits values ('Red','Apple',false,'2021-04-01',2000);

insert into fruits values ('Red','Strawberry',false);

insert into fruits (fruit_name,isberry);


-----------------------------------------------------------------------

select * from fruits;


select * from fruits where colour = 'Red'; --'where' is a clause that filters our results based on a condition 

select * from fruits where isBeRry = true; 

select fruit_name from fruits where IsBerrY = true; -- returns all the records/rows, but only the fruit_name column

select fruit_name, expirationdate from fruits where isBerry = true and colour = 'Red';

select fruit_name, expirationdate from fruits where isBerry = true or colour = 'Red';



--Aliase is a way of referencing something, by another name 

select fruit_name as name, expirationdate as expires from fruits where isBerry = true;

select * from fruits as f where f.isBerry = true;

--order by 

select * from fruits order by fruit_name asc;

select * from fruits order by fruit_name desc;


---------------------------------------------------------------------------------------
--UPDATE

update fruits set expirationdate = '2021-05-01' where fruit_name = 'Strawberry';
update fruits set amount = 100;


---------------------------------------------------------------------------------------
--DELETE 

delete from fruits where isberry = true;

delete from fruits;