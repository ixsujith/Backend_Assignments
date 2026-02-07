select * from customers
select * from orders
select * from products

select * from customers where customers.customer_id in (select orders.customer_id from orders)

select * from customers where customers.customer_id not in (select orders.customer_id from orders where orders.customer_id is not null)

select orders.order_name from orders join customers on orders.customer_id = customers.customer_id 
where customers.customer_id not in (select customer_id from orders)