use pharmacie;
Create table if not exists medicaments(
IDm int auto_increment,
Name varchar(50),
ExpDate datetime,

primary key(IDm)
);


CREATE table if not exists clients(
IDc int auto_increment,
firstName varchar(45),
lastName varchar(45),
birthDate datetime,
gender varchar(10),
email varchar(100),
motPass varchar(50),

primary key (IDc)
);

insert into clients(IDc, firstname, lastname, birthDate, gender, email, motPass)
 values(1, 'Lilia', 'SAIDI', '2001-06-06', 'female', 'lilia@gail.com', 'helloworld');

create table if not exists commande(
ID int auto_increment,
DateC datetime,
IDc int,
IDm int,
primary key(ID),
foreign key (IDc) references clients (IDc),
foreign key (IDm) references medicaments(IDm)
);