-- PROCEDURE pra cadastrar cliente.

CREATE PROCEDURE add_cliente(p_Nome_Cliente VARCHAR(100),
                             p_Endereco VARCHAR(50),
                             p_Telefone VARCHAR(11),
                             p_CNPJ_CPF VARCHAR(14),
                             p_tipo_PF_PJ VARCHAR (4))
LANGUAGE plpgsql
AS $$
BEGIN
    INSERT INTO Clientes (Nome_Cliente, Endereco, Telefone, CNPJ_CPF, tipo_PF_PJ) 
    VALUES (p_nome, p_Endereco, p_Telefone, p_CNPJ_CPF, p_tipo_PF_PJ);
END;
$$;

-- PROCEDURE para cadastrar funcionários

CREATE PROCEDURE add_funcionario(p_Nome VARCHAR(100), 
                                 p_Cargo VARCHAR(30), 
                                 p_Telefone VARCHAR(11), 
                                 p_CPF VARCHAR(11), 
                                 p_funcionarios_TIPO VARCHAR(20))
LANGUAGE plpgsql
AS $$
BEGIN
    INSERT INTO Funcionarios (Nome, Cargo, Telefone, CPF, Telefone, CPF, Funcionarios_TIPO) 
    VALUES (p_Nome, p_Cargo, p_Telefone, p_CPF, p_funcionarios_TIPO);
END;
$$;

-- PROCEDURE para cadastrar Pedido

CREATE PROCEDURE add_pedido(p_Tipo VARCHAR(50),
                            p_Quantidade INTEGER,
                            p_Data DATE,
                            p_Comissao DECIMAL (6,2))
LANGUAGE plpgsql
AS $$
BEGIN
    INSERT INTO Pedidos(Tipo, Quantidade, Data, Comissao)
    VALUES (p_Tipo, p_Quantidade,p_Data, p_Comissao);
END;
$$;

--PROCEDURE para cadastrar Filial

CREATE PROCEDURE add_filial(p_Endereco VARCHAR(50),
                            p_Telefone VARCHAR(11))
LANGUAGE plpgsql
AS $$
BEGIN
    INSERT INTO Filiais(Endereco, Telefone)
    VALUES (p_Endereco, p_Telefone);
END;
$$;

-- PROCEDURE para cadastrar Produtos

CREATE PROCEDURE add_produto(p_NomeProduto VARCHAR(40),
                             p_Valor DECIMAL(6,2))
LANGUAGE plpgsql
AS $$
BEGIN
    INSERT INTO Produtos(Nm_produto, Valor)
    VALUES (p_NomeProduto, p_Valor);
END;
$$;