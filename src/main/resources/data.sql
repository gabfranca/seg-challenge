INSERT INTO categoria VALUES (1,current_timestamp(), current_timestamp(), 'VIDA', 'VIDA')
INSERT INTO categoria VALUES (2,current_timestamp(), current_timestamp(), 'AUTO', 'AUTO')
INSERT INTO categoria VALUES (3,current_timestamp(), current_timestamp(), 'VIAGEM', 'VIAGEM')
INSERT INTO categoria VALUES (4,current_timestamp(), current_timestamp(), 'RESIDENCIAL', 'RESIDENCIAL')
INSERT INTO categoria VALUES (5,current_timestamp(), current_timestamp(), 'PATRIMONIAL', 'PATRIMONIAL')

INSERT INTO imposto VALUES (1,current_timestamp(), current_timestamp(), 'IOF', 'Imposto sobre Operacao Finaneira (IOF)' )
INSERT INTO imposto VALUES (2,current_timestamp(), current_timestamp(), 'PIS', 'Programa de Integração Social(PIS)' )
INSERT INTO imposto VALUES (3,current_timestamp(), current_timestamp(), 'COFINS', 'Contribuição para o Financiamento da Seguridade Social (COFINS)' )


INSERT INTO categoria_imposto   VALUES ( 1, 1 ,  1,1   )
INSERT INTO categoria_imposto   VALUES ( 2, 2 ,  1,5.5 )
INSERT INTO categoria_imposto   VALUES ( 3, 3 ,  1,2   )
INSERT INTO categoria_imposto   VALUES ( 4, 4 ,  1,4   )
INSERT INTO categoria_imposto   VALUES ( 5, 5 ,  1,5   )
INSERT INTO categoria_imposto   VALUES ( 1, 6 ,  2,2   )
INSERT INTO categoria_imposto   VALUES ( 2, 7 ,  2,4   )
INSERT INTO categoria_imposto   VALUES ( 3, 8 ,  2,4   )
INSERT INTO categoria_imposto   VALUES ( 4, 9 ,  2,2.5  )
INSERT INTO categoria_imposto   VALUES ( 5, 10,   2, 3  )
INSERT INTO categoria_imposto   VALUES ( 1,  11,  3, 3  )
INSERT INTO categoria_imposto   VALUES ( 2,  12,  3, 1  )
INSERT INTO categoria_imposto   VALUES ( 3,  13,  3, 1  )
INSERT INTO categoria_imposto   VALUES ( 4,  14,  3, 3  )
INSERT INTO categoria_imposto   VALUES ( 5, 15,   3, 2  )

-- -- create table seguro (
-- --     codigo_seguro int primary key identity,
-- --     nome_seguro varchar(50)
-- --     decricao_seguro varchar(150)
-- --     data_criacao_seguro datetime,
-- --     data_alteracao_seguro datetime
-- -- )

-- -- create table categoria_imposto(
-- --     codigo_categoria_imposto identity,
-- --     codigo_seguro int foreign key references seguro(codigo_seguro),
-- --     codigo_imposto int foreign key references imposto(codigo_imposto),
-- -- )

-- -- create table imposto (
-- --     codigo_imposto int primary key identity,
-- --     nome_imposto varchar(50)
-- --     decricao_imposto varchar(150)
-- --     valor_taxa_imposto decimal
-- --     data_criacao_imposto datetime,
-- --     data_alteracao_imposto datetime
-- -- )