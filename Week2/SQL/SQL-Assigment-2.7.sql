update customer set first_name = 'Robert', last_name = 'Walter' where first_name = 'Aaron' and last_name = 'Mitchell';

delete from customer where first_name = 'Robert' and last_name = 'Walter';

select * from invoice where customer_id = (select customer_id from customer where first_name = 'Robert' and last_name = 'Walter');

delete from invoice where customer_id = (select customer_id from customer where first_name = 'Robert' and last_name = 'Walter');

select * from invoice_line where invoice_id  
	in(select invoice_id from invoice where customer_id =  
		(select customer_id from customer where first_name = 'Robert' and last_name = 'Walter'));
	
	delete from invoice_line where invoice_id  
	in(select invoice_id from invoice where customer_id =  
		(select customer_id from customer where first_name = 'Robert' and last_name = 'Walter'));
	
	delete from invoice where customer_id = 
		(select customer_id from customer where first_name = 'Robert' and last_name = 'Walter');
	
	delete from customer where first_name = 'Robert' and last_name = 'Walter';



select * from invoice;
select customer_id from invoice;

		
	
	
select * from invoice_line il where invoice_id = 50 or invoice_id = 61;
select * from invoice_line il where invoice_id in(50,61);