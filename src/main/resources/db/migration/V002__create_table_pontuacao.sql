create table pontuacao (
	candidato_id bigint not null,
	matematica decimal(10,2) not null,
	biologia decimal(10,2) not null,
	projeto decimal(10,2) not null,
	
	primary key (candidato_id)
) engine=InnoDB default charset=utf8;

alter table pontuacao add constraint fk_pontuacao_candidato_id
	foreign key (candidato_id) references candidato (id);
