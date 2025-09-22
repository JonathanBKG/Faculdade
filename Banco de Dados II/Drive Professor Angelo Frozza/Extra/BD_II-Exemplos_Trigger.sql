-- EXEMPLO: CRIAR LOG NO BANCO DE DADOS

CREATE TABLE auditoria (
	idAuditoria SERIAL PRIMARY KEY,
	date        TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	table_name  TEXT NOT NULL,
	oldData     TEXT DEFAULT '',
	newData     TEXT DEFAULT ''
);


UPDATE clientes 
   SET telefonecel = '47 99988 1234'
   WHERE idCliente = 10;
   
UPDATE: newData - valores novos / oldaData - valores antigos
INSERT: newData - valores novos / oldData - vazio
DELETE: newData - vazio / oldData - valores antigos


-- TRIGGER FUNCTION
CREATE OR REPLACE FUNCTION tf_auditoria()
RETURNS trigger AS $auditaBB$
DECLARE  dadosAntigos TEXT;
         dadosNovos   TEXT;
		 tabela       TEXT;
BEGIN
   tabela := TG_TABLE_NAME;
   IF (TG_OP = 'DELETE') THEN
	  dadosAntigos := ROW(OLD.*); 
	  INSERT INTO auditoria (table_name, oldData, newData)
	     VALUES (tabela, dadosAntigos, DEFAULT);
	  RETURN OLD;
   ELSEIF (TG_OP = 'UPDATE') THEN
	  dadosAntigos := ROW(OLD.*);
	  dadosNovos := ROW(NEW.*);
	  INSERT INTO auditoria (table_name, oldData, newData)
	     VALUES (tabela, dadosAntigos, dadosNovos);
	  RETURN NEW;
   ELSEIF (TG_OP = 'INSERT') THEN
	  dadosNovos := ROW(NEW.*);
	  INSERT INTO auditoria (table_name, oldData, newData)
	     VALUES (tabela, DEFAULT, dadosNovos);
	  RETURN NEW;
   END IF;
   
   RETURN NEW;
END;
$auditaBB$ LANGUAGE 'plpgsql';

-- NEW: mantém os dados novos (INSERT, UPDATE)
-- OLD: mantém os dados antigos (UPDATE, DELETE) 


-- TRIGGER
CREATE TRIGGER t_auditoria
   AFTER INSERT OR UPDATE OR DELETE ON cardapios
   FOR EACH ROW EXECUTE PROCEDURE tf_auditoria();
   

-- HORA DE TESTAR SE FUNCIONA   
SELECT * FROM auditoria;
SELECT * FROM pedidos;

INSERT INTO pedidos (dataEmissao, idCliente, 
					 idFuncionarioEmite,
					 idFuncionarioEntrega)
		VALUES ('28-09-2023', 80, 2, 1);
	
UPDATE pedidos SET idCliente = 8
    WHERE numeropedido = 26;
	
DELETE FROM pedidos 
    WHERE numeropedido = 24;
	
SELECT * FROM cardapios;

INSERT INTO cardapios (cardapio, idpizzaria)
   VALUES ('Primavera PROMO', 1);
