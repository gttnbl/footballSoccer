insert into Pays (id,nom_pays,code_pays) values (1,'Bresil','BRZ');
insert into Pays (id,nom_pays,code_pays) values (2,'Angleterre','EN');
insert into stade (id,nom) values(1,'Anfield');
insert into Entraineur(id,first_name,last_name) values (1,'Jorgen', 'Klupp');
insert into staff (id,manager,entr_adjoint_princ,entr_adjoint_sec) values (1,1,1,1);
insert into Team (id,name,pays_id,stade_id,staff_id) values(1,'Liverpool',2,1,1);

insert into Player (id, team_id, first_name,last_name, num,pays_id ) values(1,1,'Sadio','Mane', 10,1);
insert into Player (id, team_id, first_name,last_name, num,pays_id ) values(2,1,'Mohammed','Salah', 11,1);
insert into Player (id, team_id, first_name,last_name, num,pays_id ) values(3,1,'Virgil','Van djik', 4,1);
insert into Player (id, team_id, first_name,last_name, num,pays_id ) values(4,1,'Roberto','Firmino', 9,1);
