          # GERADOR DE DADOS PARA MYSQL
	  http://www.generatedata.com/
          

	  # COMO CRIAR UMA BASE DE DADOS 
	  creata database mydb
  	  CHARACTER SET utf8
  	  COLLATE utf8_general_ci;
	  

	  # USANDO A SUA BASE DE DADOS 
	  use mydb;

	  # APAGANDO A SUA DATABASE
	  drop database mydb;

	  
	  # CRIANDO UMA TABELA
	  create table pessoa (
	  id int auto_increment not null primary key,
	  nome varchar(30),
          nascimento date,
	  sexo enum("M","F"),
          peso decimal(3,1),
	  nacionalidade varchar(30),	
   	  profissoa varchar(30)
	 ) default charset = utf8
	 
	 
	  # INSERINDO DADOS NA TABELA
	  insert into pessoa (id, nome, nascimento, sexo, peso, nacionalidade, profissao)
          values (default, 'Izabela', '2000-08-01', 'F', '52.3' ,'Brasileira', 'Atendente');
	 

	  # EXIBINDO DADOS DA TABELA
	  select * from pessoa
	  
	  
	  # SELECIONANDO OS DADOS DE UMA TABELA ORDENDANDO DE FORMA CRESCENTE
	  select * from pessoa
	  order by nome;


	  # SELECIONANDO OS DADOS DE UMA TABELA ORNDENANDO DE FORMA DECRECENTE
	  select * from pessoa
	  order by nome desc;


	  # SELECIONANDO ALGUNS DADOS APENAS DA TABELA
	  select nome, sexo  from pessoa; 
	  

	  # SELECIONANDO TODOS OS DADOS QUE POSSUEM 'M'
	  select * from pessoa
	  where sexo = 'M'

		  
	 # SELECIONADO TODO OS DADOS QUE SÃO MENORES QUE O ANO DE 2011
	  select * from pessoa 
	  where ano <2011;


	 # SELECIONADO TODO OS DADOS QUE SÃO MAIORES QUE O ANO DE 2011
	  select * from pessoa 
	  where ano > 2011;


	 # SELECIONADO TODO OS DADOS QUE SÃO IGUAIS A O ANO DE 2011
	  select * from pessoa 
	  where ano = 2011;
	  


	# SELECIONADO TODO OS DADOS QUE SÃO DIFRENTES A O ANO DE 2011
	  select * from pessoa 
	  where ano != 2011;
	  


	# SELECIONANDO TODOS OS VALORES DE UM DETERMINADO CAMPO
	  select * from pessoa 
          where ano in (2010, 2011);

	
	# SELECIONANDO TODOS OS VALORES QUE COMEÇAM COM (L)
	  select * from pessoa
	  where nome like 'L%'
		
	
		
	 # SELECIONANDO TODOS OS VALORES QUE TERMINAM COM A LETRA (A) NO FINAL
	  select * from pessoa
	  where nome like '%A';

	
	 # SELECIONANDO TODOS OS VALORES QUER COMEÇA COM A LETRA (A) NO INICIO, NO MEIO E NO FINAL.
	   select * from pessoa
	   where nome like '%A%'
	
	
	 # SELECIONANDO TODOS OS VALORES QUE NÃO CONTÉM A LETRA (A)
	  select * from pessoa
	  where nome not like '%A%'
		
	
	 # SELECIONANDO TODAS AS PESSOAS QUE CONTÉM MAGALHÃES NO SOBRENOME
	 select * from pessoa
	 where nome like '%_magalhães%';


	  # SELECIONANDO CAMPOS DISTINTOS, PEGANDO SOMENTE UM VALOR ÚNICO (NÃO REPETE VALORES)
	  select distinct nacionalidade  from pessoa;

	
	  # CONTANDO QUANTOS CAMPOS TEMOS NA TABELA 
	   select count(*) from pessoa;

	
	  # CONTANDO NO CAMPO (ANO) VALORES ACIMA DE (2012)
	  select count(*) from pessoa where ano > 2012;

	
	  # DESCOBRINDO O MAIOR VALOR DO CAMPO (ANO)
	  select max(ano) from pessoas;

	
	  # DESCOBRINDO O MENOR VALOR DO CAMPO(ANO)
	  select min(ano) from pessoas;

	
	 
	  # SOMANDO UM CAMPO DE UMA TABELA
	  select sum(totalHorasAulas) from pessoas;

	
	  # OBTENDO A MÉDIA DE UM CAMPO
	  select avg(totalHorasAulas) from pessoas;
	
	  
	  # AGRUPANDO REGISTROS 
	  select totalHorasAulas from pessoas
	  group by totalHorasAulas;

	
	  # AGRUPANDO E AGREGANDO 
	  select totalHorasAulas, count(nome) from pessoas
	  group by totalHorasAulas;


	  # UTILIZANDO HAVING COMO SE FOSSE UM IF EM GROUP BY
	  select * from pessoas
	  group by totalHorasAulas
	  having totalHorasAulas > 20;
		  
	
	  # MOSTRANDO A SUA TABELA
	  describe pessoa;



	  # COMO REMOVER UMA COLUNA
	  alter table  pessoa
	  drop column profissao;
	 
	 
	  # ESCOLHENDO UMA POSIÇÃO NA COLUNA, PARA SE ADICONAR
	  alter table  pessoa
	  add column profissao varchar(30) after nome;
	 
	 
	  # COLOCANDO UMA POSIÇÃO NO PRIMEIRO LUGAR DA TABELA
	  alter table pessoa
	  add column qualquer int first;
	  
	  
	  # MODIFICANDO O TIPO DA ESTRUTURA
	  alter table pessoa
	  modify column nascimento varchar(100);
	  
	  
	  # RENOMEANDO UMA COLUNA
	  alter table pessoa
          change column nome sobrenome varchar(20);
	  
	  
	  # RENOMEANDO O NOME DA TABELA
	  alter table pessoa
	  rename to JAILSON;
	  

	  # APAGANDO A TABELA
	  drop table pessoa;
	    
		  
	  # APAGANDO UMA LINHA DA TABELA
          DELETE FROM NOME_TABELA WHERE NOME_CAMPO = 4;
	    


	  # APAGANDO OS DADOS INTEIROS DA TABELA, MENOS A TABELA
          TRUNCATE TABLE NOME_TABELA
	  
--------------------------------------------------------------------------------------------------------------	  	  
	  
	   TEORIA BANCO DE DADOS
	   
	   Tipos primitivos (VARIAVEIS)  
  
  	   *Númerico
	   
	   -inteiro: TinyInt, SmallInt, Int, MediumInt, BigInt
	   
	   -Real: Decimal, Float, Double, Real
	   
	   -Lógico: Bit, Boolean
	   	   
  -------------------------------------------------------------------------------------------------------------
  	 
		   
	   *Data/tempo: Date, DateTime, TimeStamp, Time, Year
	   
	   
  -------------------------------------------------------------------------------------------------------------
  
	   *Literal
	   
	   -caractere: Char, VarChar
	   
	   -texto: TinyText, Text, MediumText, LongText

	   -Binario: TinyBlob, Blob, MediumBlob, LongBlob
	   
	   -Coleção: Enum, Set
	   
---------------------------------------------------------------------------------------------------------------


	   *Espacial: Geometry, Point, Polygon, MultiPolygon	
		   
----------------------------------------------------------------------------------------------------------------	   
		  		   
		  
		   
	    SQL Linguagem estruturada
		    
            DDL Data Definition Language (Linguagem de difinição de dados): 
	    - create: criação da estrutura. 
	    - alter: altera a estrutura. 
            - drop: exclui uma estrutura.

		    
	    DML Data Manipulation Language (Linguagem de manipulação de dados) 
	    -Insert: insere dados.
	    -update: altera dados. 
            -delete: exclui dados
		    
	    DQL Data Query Language (Linguagem de consulta de dados)
	    -Select: retorna dados.
            -Ordenação de dados 
            -Agrupamento de dados.
	    -Funções aritméticas. 
	    -Filtros de seleção.
		    
	    DCL Data Control Language (Linguagem de controle de dados)
	    -Grant: Habita acessa a dados e operações. 
	    -revoke: revoga acesso a dados e operações. 
		    
	    DTL Data Transaction Language (Linguagem de transação de dados):
	    -Start  transaction: incia a transação. 
	    -commit: concretiza a transação.
            -rolback: anula a transação.      
		    
		    
	

