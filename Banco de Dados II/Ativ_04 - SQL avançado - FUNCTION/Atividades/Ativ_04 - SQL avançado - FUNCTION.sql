-- Calcula a comissão total a pagar.---------------------------

CREATE OR REPLACE FUNCTION totalComissao ()
RETURNS DECIMAL(10, 2) AS $$
DECLARE rec RECORD;
        result DECIMAL(10,2) := 0;
BEGIN
    result := 0;
    FOR rec IN SELECT Comissao FROM Pedidos LOOP
        result := result + rec.Comissao;
    END LOOP;
    RETURN result;
END;
$$ LANGUAGE 'plpgsql';

-- Calcula o valor total do pedido.------------------------

CREATE OR REPLACE FUNCTION totalPedido (pedido_id INTEGER)
RETURNS DECIMAL(10,2) AS $$
DECLARE rec RECORD;
        valor_total DECIMAL(10,2) :=0;
BEGIN
    FOR rec IN SELECT valor_un, qtproduto FROM Pedido_itens
    WHERE idPedido = pedido_id
    LOOP
        valor_total := valor_total + (rec.valor_un * rec.qtproduto);
    END LOOP;
    RETURN valor_total;
END;
$$ LANGUAGE 'plpgsql';


-- Atualiza o Status do funcionário--------------------

CREATE OR REPLACE FUNCTION attStatusFun(
    p_idFun INTEGER,
    p_novoCargo VARCHAR,
    p_novoTipo VARCHAR
)
RETURNS VOID AS $$
BEGIN
    IF EXISTS (SELECT 1 FROM Funcionarios WHERE idFun = p_idFun) THEN
        UPDATE Funcionarios
        SET Cargo = p_novoCargo,
        Funcionarios_TIPO = p_novoTipo
        WHERE idFun = p_idFun;
        -- Comandos para informar o Usuário do status
        RAISE NOTICE 'Status do funcionário atualizado com sucesso!';
    ELSE
        RAISE NOTICE 'Funcionário com ID: % não encontrado', p_idFun;
    END IF;
END;
$$ LANGUAGE 'plpgsql';

-- Cria um novo pedido-------------------

CREATE OR REPLACE FUNCTION novoPedido(
    p_tipo VARCHAR,
    p_quantidade NUMERIC,
    p_data DATE,
    p_comissao DECIMAL(10,2),
    p_idCliente INTEGER,
    p_idFilial INTEGER,
    p_idFun INTEGER    
)
RETURNS TEXT AS $$
DECLARE
    cliente_existe BOOLEAN;
    filial_existe BOOLEAN;
    fun_existe BOOLEAN;
BEGIN
    -- Verifica se o Cliente existe
    SELECT EXISTS(SELECT 1 FROM Clientes
    WHERE idCliente = p_idCliente)
    INTO cliente_existe;
    IF NOT cliente_existe THEN
        RETURN 'Erro: Cliente não encontrado';
    END IF;

    -- Verifica se a filial existe
    SELECT EXISTS(SELECT 1 FROM Filiais
    WHERE idFilial = p_idFilial)
    INTO filial_existe;
    IF NOT filial_existe THEN
        RETURN 'Erro: Filial não encontrada';
    END IF;

    -- Verifica se o funcionário existe
    SELECT EXISTS(SELECT 1 FROM Funcionarios 
    WHERE idFun = p_idFun)
    INTO fun_existe;
    IF NOT fun_existe THEN
        RETURN 'Erro: Funcionário não encontrado';
    END IF;

    -- Verifica se a quantidade é positiva
    IF p_quantidade <= 0 THEN
        RETURN 'Erro: Quantidade deve ser positiva';
    END IF;

    -- Se tudo for validado, insere o pedido
    INSERT INTO Pedidos (Tipo, Quantidade, Data, Comissao, idCliente, idFilial, idFun)
    VALUES (p_tipo, p_quantidade, p_data, p_comissao, p_idCliente, p_idFilial, p_idFun);

    RETURN 'Pedido inserido com sucesso!';
END;
$$ LANGUAGE 'plpgsql';

-- Atualizar Endereço de um Cliente ---------------------
CREATE OR REPLACE FUNCTION attEndCliente(p_idCliente INTEGER, p_novoEndereco VARCHAR)
RETURNS VOID AS $$
BEGIN
    IF EXISTS (SELECT 1 FROM Clientes WHERE idCliente = p_idCliente)
    THEN
        UPDATE Clientes
        SET Endereco = p_novoEndereco
        WHERE idCliente = p_idCliente;
        -- comando para informar que o endereço foi atualizado.
        RAISE NOTICE 'Endereço atualizado com sucesso!';
    ELSE

        RAISE NOTICE 'Cliente com ID: % não encontrado', p_idCliente;
    END IF;
END;
$$ LANGUAGE 'plpgsql';
    