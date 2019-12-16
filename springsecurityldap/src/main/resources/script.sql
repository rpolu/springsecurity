create table USERS_LDAP (
	id bigint not null auto_increment, 
	email varchar(255), 
	first_name varchar(255), 
	last_name varchar(255),
	username varchar(255), 
	primary key (id)) ;
INSERT INTO USERS_LDAP (email, first_name, last_name, username) values ('dhiraj@gmail.com', 'Dhiraj', 'Ray', 'only2dhir');
INSERT INTO USERS_LDAP (email, first_name, last_name, username) values ('mike@gmail.com', 'Mike', 'Huss', 'mikehuss');
