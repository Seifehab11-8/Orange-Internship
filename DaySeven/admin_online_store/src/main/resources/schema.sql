create table if not exists asdmin (
    id int primary key,
    username varchar(50) not null,
    email varchar(50) not null,
    u_password varchar(50) not null
);
truncate table admin;
insert into admin (id, username, email, u_password) 
values (1, "seif", "semaziz2003@gmail.com", "password"),
        (2, "mohamed", "mohamed@gmail.com", "passordsa"),
        (3, "medhat", "medhat@gmail.com", "122345435");