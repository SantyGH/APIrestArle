create database tiendavirtual;
use tiendavirtual;
create table producto(
id int auto_increment primary key,
nombre varchar(50) not null,
precio double not null,
stock int not null,
categoria varchar(40) not null);

select * from producto;
drop table product;