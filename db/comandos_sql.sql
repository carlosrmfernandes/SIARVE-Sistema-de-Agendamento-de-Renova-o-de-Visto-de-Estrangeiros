CREATE TABLE produtos(
codigo integer not null,
descricao varchar(30) not null
)

CREATE TABLE cadastroestrangeiro (
 numpassaporte  varchar(30)  not null primary key,
 celular varchar(60) not null,
 nome varchar(60) not null,
 endereco varchar(60) not null,
 email varchar(60) not null,
 data date,
 estadocivil varchar(60) not null,
 funcao varchar(60) not null,
 cpf varchar(60) not null,
 localfuncao varchar(60) not null,
 estado varchar(60) not null,
 sexo varchar(60) not null
);

insert into produtos(codigo, descricao)
values(1,'arroz')
;
insert into produtos(codigo, descricao)
values(2,'feij�o')
;
insert into produtos(codigo, descricao)
values(3,'macarr�o')
;
commit
;


select * from produtos


;

update produtos
set descricao = 'Arroz pr�-cozido'
where codigo = 1
commit