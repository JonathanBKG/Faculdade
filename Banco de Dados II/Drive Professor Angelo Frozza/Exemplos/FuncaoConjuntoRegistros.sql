CREATE OR REPLACE FUNCTION
	produtosNFEntrada(codigo_nf INTEGER)
	RETURNS SETOF RECORD AS $$
	DECLARE registro RECORD;
	BEGIN
		RETURN QUERY SELECT e.numeroNFEntrada, ie.idproduto, ie.valorunitario, 
			       ie.quantidade
			--INTO registro
			FROM itens_entrada ie
			LEFT JOIN entradas e ON e.numeroNFEntrada = ie.numeroNFEntrada 
			WHERE e.numeroNFEntrada = codigo_nf;
		RETURN;  -- aqui efetivamente faz o return
	END;
	$$ LANGUAGE 'plpgsql';
	
	
	select * from produtosNFEntrada(2) 
	   AS (numeroNFEntrada INTEGER, idproduto INTEGER, 
		   valorunitario DECIMAL, quantidade INTEGER);

SELECT * FROM fornecedores;
insert into fornecedores (nome, email)
  values ('forn 1', 'forn1@forn1.com.br')
SELECT * from entradas;
insert into entradas (data, valortotal, idfornecedor) 
values ('23/11/2023', 1000, 1);
SELECT * FROM itens_entrada;
INSERT INTO itens_entrada (quantidade, valorunitario, idproduto, numeronfentrada)
   VALUES (10, 11, 8, 2),
           (5, 12, 9, 2),
		   (7, 10, 10, 2);
 SELECT * FROM produtos;