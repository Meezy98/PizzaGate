drop table user_creds cascade;
drop table user_profile cascade;
drop table pizza_size cascade;
drop table cheese_type cascade;
drop table side_items cascade;
drop table sauce_type cascade;
drop table meat_type cascade;
drop table pizza_toppings cascade;
create table user_creds(
userID serial primary key,
user_name varchar unique not null,
password varchar not null
);

create table user_profile(
profileID serial primary key,
userID integer unique not null,
first_name varchar not null,
last_name varchar not null,
email varchar unique not null,
foreign key (userID) references user_creds(userID)
);

create table pizza_size(
sizeID serial primary key,
size_type varchar unique not null
);

create table cheese_type(
cheeseID serial primary key,
cheese_type varchar unique not null
);

create table sauce_type(
sauceID serial primary key,
sauce_type varchar unique not null
);

create table meat_type(
meatID serial primary key,
meat_type varchar unique not null
);

create table side_items(
sideID serial primary key,
side_items varchar unique not null
);


create table pizza_toppings(
pizzaID serial primary key,
order_number varchar unique not null,
pizza_size varchar unique not null,
cheese_type varchar unique not null,
sauce_type varchar unique not null,
meat_type varchar unique not null,
side_items varchar unique not null,
foreign key (pizza_size) references pizza_size(size_type),
foreign key (cheese_type) references cheese_type(cheese_type),
foreign key (sauce_type) references sauce_type(sauce_type),
foreign key (meat_type) references meat_type(meat_type),
foreign key (side_items) references side_items(side_items)
);



insert into user_creds values(default,'JohnDoe322', 'IDKBRO!');
