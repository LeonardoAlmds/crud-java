create database diary;
use diary;

create table contacts (
	id int auto_increment not null primary key,
    `name` varchar(40),
    age int,
    registrationDate date
);
