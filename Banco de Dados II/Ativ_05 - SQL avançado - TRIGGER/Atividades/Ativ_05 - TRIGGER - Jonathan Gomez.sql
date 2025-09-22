-- Trigger Function para validar CPF/CNPJ
CREATE OR REPLACE FUNCTION validar_cpf_cnpj()
RETURNS TRIGGER AS $$
BEGIN
    -- Verifica se já existe um cliente com o mesmo CPF/CNPJ
    IF EXISTS (
        SELECT 1
        FROM Clientes
        WHERE CNPJ_CPF = NEW.CNPJ_CPF
          AND idCliente <> NEW.idCliente  -- ignora o mesmo registro em caso de update
    ) THEN
        RAISE EXCEPTION 'Erro: CPF/CNPJ % já está cadastrado.', NEW.CNPJ_CPF;
    END IF;

    -- Se não houver duplicata, permite a inserção/atualização
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Trigger para chamar a função de validação antes de inserir ou atualizar
CREATE TRIGGER trigger_validar_cpf_cnpj
BEFORE INSERT OR UPDATE ON Clientes
FOR EACH ROW
EXECUTE FUNCTION validar_cpf_cnpj();
