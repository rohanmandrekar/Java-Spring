insert into user_details(id, birth_date,name)
values(1001,current_date(),'Rohan');
insert into user_details(id, birth_date,name)
values(1002,current_date(),'Sarina'); 
insert into user_details(id, birth_date,name)
values(1003,current_date(),'Tester');

insert into post(id,description,user_id)
values(2001,'Heyyy snapchat! Welcome to my vlog!',1002);

insert into post(id,description,user_id)
values(1001,'hello world',1001);

insert into post(id,description,user_id)
values(2002,'I wont drink water',1002);

insert into post(id,description,user_id)
values(1002,'Drink water',1001);