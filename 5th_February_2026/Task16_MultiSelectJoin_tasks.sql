select * from customers
select * from orders
select * from products

select customers.customer_id, customers.customer_name, orders.order_name, orders.order_price from customers
join orders on customers.customer_id = orders.customer_id

select a.customer_id, b.order_name from customers a join orders b on a.customer_id = b.customer_id

select count(a.customer_id) as customers, sum(b.order_price) as order_price from customers a
join orders b on a.customer_id = b.customer_id

select customers.customer_id, customers.customer_name,
case when orders.order_price > 500 then 'Costly' else 'Cost effective price' end as order_price_value
from customers join orders on customers.customer_id = orders.customer_id