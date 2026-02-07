select * from customers
select * from orders
select * from products

select * from customers join orders on customers.customer_id = orders.customer_id join products on orders.order_id = products.order_id

select customers.customer_id, orders.order_name from orders

select * from customers join orders on customers.customer_id = orders.customer_id

select distinct * from customers join orders on customers.customer_id = orders.customer_id

select * from customers right join orders on customers.customer_id = orders.customer_id where orders.customer_id is not null

