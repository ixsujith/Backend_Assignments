select v1.c_id as C1, v2.c_id as C2, v1.l_id as Location_ID, v1.entry_data as c1_entry_data, v2.entry_data as c2_entry_data,
v1.exit_data as c1_exit_data, v2.exit_data as c2_exit_data,
concat('From ', greatest(cast(v1.entry_data as date), cast(v2.entry_data as date)), ' to ',
least(cast(v1.exit_data as date), cast(v2.exit_data as date))) as collided_timings
from visits v1
join visits v2 on v1.l_id = v2.l_id
where v1.c_id < v2.c_id

select c.c_id, c.c_name, i.status_id, cast(i.date_time as date) as date_data from citizens c join infect_status i on c.c_id = i.c_id
where i.c_status = 'Recovered'
order by i.date_time asc

select d.b_id, count(d.b_id) as vaccine_use_count, b.stock as original_stock, (b.stock - count(d.b_id)) as available_stock
from dose_data d join batch_data b on d.b_id = b.b_id
group by d.b_id, b.stock

select * from infect_status
select * from visits

select i.c_id as citizen_id, v.l_id as location_id, v.v_id as visiting_id, datediff(day, i.date_time, v.entry_data) as visited_after_affected
from infect_status i join visits v on i.c_id = v.c_id
where i.c_status = 'Affected'
and datediff(day, i.date_time, v.entry_data) between 0 and 3

select * from audit_logs

select viewer_id, cast(date_time as date) as date_data, count(viewer_id) as view_count
from audit_logs
group by viewer_id, cast(date_time as date)
order by cast(date_time as date) asc