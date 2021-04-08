--Multiplicity 

-- Relationships that an entities have with each other. 

-- One-to-one 
-- Many-to-one 
-- One-to-Many 
-- Many-to-Many

truncate planets cascade;
drop table if exists planets cascade; 
drop table if exists moons cascade;


create table planets(
	planet_id serial8 primary key,
	planet_name varchar(30) not null unique,
	atmosphere boolean not null, 
	volume float8 check(volume > 0)
);

select * from planets;

insert into planets (planet_name, atmosphere, volume) values
	('Mercury',false,0.2),
	('Venus',true,0.9),
	('Earth',true,1),
	('Mars',false,0.4),
	('Jupiter',true,60);

update planets set planet_id = 3 where planet_name = 'Earth';
	
delete from planets where planet_name = 'Mercury';

delete from planets where planet_name = 'Earth';

drop table moons;

create table moons( 
	moon_id serial8 primary key,
	moon_name varchar(30) not null unique,
	fk_planet_id int references planets(planet_id) on delete cascade
);

select * from moons;

insert into moons (moon_name,fk_planet_id) 
	values 
	('fakey fake', -1);

insert into moons (moon_name,fk_planet_id) 
	values
	('The Moon', (select planet_id from planets where planet_name = 'Earth')),
	('Deimos', (select planet_id from planets where planet_name = 'Mars'));


create table features( 

	feature_id serial primary key, 
	feature name unique not null
);

insert into features (feature) 
	values
		('Mountains'),
		('Volcanoes'),
		('Storms '),
		('Magnetic field');

create table planet_features(
	fk_planet_id int references planets(planet_id) on update cascade,
	fk_features_id int references features(feature_id) on delete cascade 
);

select * from planet_features;

drop table planet_features ;

insert into planet_features values
	((select planet_id from planets where planet_name = 'Earth'), 
	(select feature_id from features where feature = 'Mountains'));


