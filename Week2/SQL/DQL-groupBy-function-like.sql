--DQL

-- Data Query Language
-- SELECT 

select * from customer;

select COUNT(*) as number_of_people , country from customer group by country order by number_of_people desc;

select COUNT(*) as number_of_people , country from customer group by country having COUNT(*) > 1;

select * from customer where first_name like 'J_'; --only select customers like Ja , Jo , Je , Jz , etx.

select * from customer where first_name like 'J%'; -- % placeholder for 0 or more characters 

select COUNT(*),country from customer where first_name like 'J%' group by country;


-- Functions 

-- tangent, difference between a function, a method and a stored procedure 

-- both functions and methods and stored procedures take in input arguments 
-- functions and methods can have return values but stored procedures don't have a return 
-- a method is a funciton associated with an object. 


--Aggregate functions and scalar functions

--Aggregate functions act on a set of data and return a single value 
-- COUNT , AVG , SUM , MIN , MAX 

-- Scalar functions act on a single record and return a single value 
-- UPPERCASE , LOWERCASE 


select count(*), sum(*), upper(lower(billing_city)) from invoice group by billing_city having sum(total) < 40;

select upper(lower(billing_city)) from invoice group by billing_city having sum(total) < 40;

delete from invoice where billing_city in(select billing_city from invoice group by billing_city having sum(total) < 40);



select * from invoice where left (billing_city, 2) in ('Br','Lo');

select * from invoice where right (billing_city, 1) in ('n');


