-- 1º INNER JOIN para saber os clientes 
-- que fizeram pedido e que são pessoas
-- Físicas.
SELECT *
    FROM Clientes C
    INNER JOIN Pedidos P
    ON C.idCliente = P.idCliente
    WHERE tipo_PF_PJ = 'CPF';	


--2º LEFT JOIN para saber os clientes
--que eram somente "Venda"
SELECT *
	FROM Clientes C 
	LEFT JOIN Pedidos P
	ON C.idCliente = P.idCliente
	WHERE tipo = 'Venda'; 


-- 3º RIGHT JOIN para mostrar todos
-- os funcionarios que trabalham na 
-- filial 3.
SELECT *
	FROM Filiais Fi 
	RIGHT JOIN Funcionarios F
	ON Fi.idFilial = F.idFilial
	WHERE Fi.idFilial = '3'; 


-- 4º INNER JOIN e LEFT JOIN para filtrar todos os clientes que pediram o produto 
--'Comando' com o idProduto '4'
SELECT *
	FROM Pedido_itens Pi
	INNER JOIN Pedidos P 
	ON Pi.idPedido = P.idPedido
	LEFT JOIN Clientes C
	ON P.idCliente = C.idCliente
	WHERE idProduto = '4';


-- 5º INNER JOIN para saber qual cliente teve um pos venda com qual funcionário
SELECT C.idCliente, C.Nome_Cliente, F.idFun, F.nome
	FROM Clientes C
	INNER JOIN Pos_Vendas Pv
	ON C.idCliente = Pv.idCliente
	INNER JOIN Funcionarios F
	ON Pv.idFun = F.idFun;