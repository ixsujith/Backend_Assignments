create table citizens (
	c_id bigint primary key,
	c_name varchar(100) not null,
	c_phoneNum varchar(20) unique,
	c_address varchar(255) not null,
	c_city varchar(100) not null,
	c_country varchar(100) not null
)

create table locations (
	l_id bigint primary key,
	l_name varchar(100) not null
)

create table visits (
	v_id bigint primary key,
	c_id bigint,
	l_id bigint,
	foreign key(c_id) references citizens(c_id),
	foreign key(l_id) references locations(l_id),
	entry_data datetime2 default(sysdatetime()) not null,
	exit_data datetime2 default(sysdatetime()) not null
)

create table infect_status (
	status_id bigint primary key,
	c_id bigint foreign key references citizens(c_id),
	date_time datetime2 default(sysdatetime()) not null,
	c_status varchar(100) not null
)

create table batch_data (
	b_id bigint primary key,
	vaccine_name varchar(100) not null,
	vaccine_disease varchar(100) not null,
	stock int not null
)

create table dose_data (
	dose_id bigint primary key,
	b_id bigint foreign key references batch_data(b_id),
	c_id bigint foreign key references citizens(c_id),
	date_time datetime2 default(sysdatetime()) not null,
	dose_count int not null
)

create table audit_logs (
	audit_id bigint primary key,
	viewer_id bigint not null,
	c_id bigint foreign key references citizens(c_id),
	date_time datetime2 default(sysdatetime()) not null
)