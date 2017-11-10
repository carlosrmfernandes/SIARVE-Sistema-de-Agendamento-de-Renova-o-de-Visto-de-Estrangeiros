CREATE TABLE produtos(
codigo integer not null,
descricao varchar(30) not null
)
CREATE TABLE "COLLEAGUES" (
    "ID" INTEGER not null primary key,
    "FIRSTNAME" VARCHAR(30),
    "LASTNAME" VARCHAR(30),
    "TITLE" VARCHAR(10),
    "DEPARTMENT" VARCHAR(20),
    "EMAIL" VARCHAR(60)
);


insert into produtos(codigo, descricao)
values(1,'arroz')
;
insert into produtos(codigo, descricao)
values(2,'feijão')
;
insert into produtos(codigo, descricao)
values(3,'macarrão')
;
commit
;


select * from produtos


;

update produtos
set descricao = 'Arroz pré-cozido'
where codigo = 1
commit