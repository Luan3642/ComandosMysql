package comandomysql;

public class ComandoMysql {

    public static void main(String[] args) {
        /* COMO REMOVER UMA COLUNA
	 alter table  lote
	 drop column cor;
	 
	 
	  ESCOLHENDO UMA POSIÇÃO NA COLUNA, PARA SE ADICONAR
	 alter table lote
	 add column nome varchar(10) after garantia;
	 
	 
	  COLOCANDO UMA POSIÇÃO NO PRIMEIRO LUGAR DA TABELA
	  alter table lote
	  add column qualquer int first;
	  
	  
	  MODIFICANDO O TIPO DA ESTRUTURA
	  alter table lote
	  modify column entrada varchar(100);
	  
	  
	   RENOMEANDO UMA COLUNA
	  alter table lote
      change column entrada entradinha varchar(20);
	  
	  
	   RENOMEANDO O NOME DA TABELA
	  alter table lote
	  rename to JAILSON;
	  
	   APAGANDO A TABELA
	  drop table lote;*/
	    
	  APAGANDO UMA LINHA DA TABELA
         DELETE FROM NOME_TABELA WHERE NOME_CAMPO = 4;
	    
	    APAGANDO OS DADOS INTEIROS DA TABELA, MENOS A TABELA
		    TRUNCATE TABLE NOME_TABLEA;
       }
    
    }

