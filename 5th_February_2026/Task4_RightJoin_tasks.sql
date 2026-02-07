select * from orders right join customers on orders.customer_id = customers.customer_id;


select * from departments

select * from customers right join orders on customers.customer_id = orders.order_id where orders.customer_id is null

select customers.customer_id, count(orders.customer_id) as num_of_orders from orders right join customers on orders.customer_id = customers.customer_id group by customers.customer_id