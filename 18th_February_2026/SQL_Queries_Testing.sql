select v1.c_id as C1, v2.c_id as C2, v1.l_id as Location_ID, v1.entry_data as c1_entry_data, v2.entry_data as c2_entry_data,
v1.exit_data as c1_exit_data, v2.exit_data as c2_exit_data,
concat('From ', greatest(v1.entry_data, v2.entry_data), ' to ', least(v1.exit_data, v2.exit_data)) as collided_timings
from visits v1
join visits v2 on v1.l_id = v2.l_id
where v1.c_id < v2.c_id

select c.c_id, c.c_name from citizens c join infect_status i on c.c_id = i.c_id
where i.c_status = 'Recovered'
order by c.c_id asc

select d.b_id, count(d.b_id) as vaccine_use_count, b.stock as original_stock, (b.stock - count(d.b_id)) as available_stock
from dose_data d join batch_data b on d.b_id = b.b_id
group by d.b_id, b.stock

select i.c_id, v.l_id from infect_status i join visits v on i.c_id = v.c_id
where i.c_status = 'Affected'
and datediff(day, i.date_time, v.entry_data) between 0 and 3

select * from audit_logs

select viewer_id, cast(date_time as date) as date_data, count(viewer_id) as view_count
from audit_logs
group by viewer_id, cast(date_time as date)
order by viewer_id asc