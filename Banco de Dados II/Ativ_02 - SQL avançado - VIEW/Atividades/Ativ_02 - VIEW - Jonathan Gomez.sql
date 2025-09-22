-- 1º VIEW para ver os vendedores
CREATE VIEW Vendedores
    AS SELECT idFun, nome, Cargo, CPF
    FROM Funcionarios
    WHERE cargo = 'Vendedor';


-- 2º VIEW para ver clientes somente Pessoa Física

CREATE VIEW ClientePF_Pedidos
    AS SELECT C.idCliente, C.Nome_Cliente, C.tipo_PF_PJ, C.CNPJ_CPF, P.idPedido, P.tipo, P.Quantidade, P.Data
    FROM Clientes C
    INNER JOIN Pedidos P 
    ON C.idCliente = P.idCliente
    WHERE C.tipo_PF_PJ = 'CPF';

-- 3º VIEW para ver pedidos de 2024

CREATE VIEW Pedidos2024
    AS SELECT P.data, P.idcliente, C.Nome_Cliente, P.tipo, P.Quantidade, P.Comissao, P.idfun
    FROM Pedidos P
    INNER JOIN Clientes C 
    ON P.idCliente = C.idCliente
    WHERE P.data >= '2024-01-01' AND P.data <= '2024-12-31';

-- 4º VIEW Funcionarios da Filial 3

CREATE VIEW FunFilial3
    AS SELECT F.idFun, F.Nome, F.Cargo, F.Funcionarios_TIPO, F.idFilial, L.Endereco, L.Telefone
    FROM Funcionarios F
    INNER JOIN Filiais L 
    ON F.idFilial = L.idFilial
    WHERE F.idFilial = 3;

-- 5º VIEW mostrar os pedidos feitos e os itens associados
CREATE VIEW PedidosItens
    AS SELECT P.idPedido, P.tipo, P.Quantidade, P.Data, PI.QtProduto, PI.Valor_total, PI.Valor_un
    FROM Pedidos P
    INNER JOIN Pedido_itens PI 
    ON P.idPedido = PI.idPedido;
