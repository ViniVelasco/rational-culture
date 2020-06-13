set foreign_key_checks = 0;

delete from candidato;
delete from pontuacao;

set foreign_key_checks = 1;

alter table candidato auto_increment = 1;
alter table pontuacao auto_increment = 1;

insert into candidato (id, nome) values
	(1, 'Matheus'),
	(2, 'Barbara'),
	(3, 'Ronaldo'),
	(4, 'Thiago'),
	(5, 'Ivan'), 
	(6, 'Amanda'),
	(7, 'Eduardo'),
	(8, 'Alex'),
	(9, 'Giovanna'),
	(10, 'Jessica');
	
insert into pontuacao (candidato_id, matematica, biologia, projeto) values
	(1, 76, 58, 21),
	(2, 4, 5, 22),
	(3, 15, 59, 12),
	(4, 41, 42, 99),
	(5, 22, 90, 9), 
	(6, 82, 77, 15),
	(7, 82, 99, 56),
	(8, 11, 4, 22),
	(9, 16, 29, 94),
	(10, 1, 7, 59);
	