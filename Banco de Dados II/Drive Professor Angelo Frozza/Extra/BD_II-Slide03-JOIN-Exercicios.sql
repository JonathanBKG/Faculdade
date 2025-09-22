PRODUTO CARTESIANO
==================
1)
SELECT m.nome, m.cpf
   FROM medicos m,
        pacientes p
   WHERE m.cpf = p.cpf
    -- RI e FILTROS

2) 
SELECT m.nome, m.especialidade
   FROM medicos m,
        atendimentos a,
        ambulatorio am
   WHERE m.cpf = a.cpf
     AND a.idAmb = am.idAmb
     AND am.andar = 1 -- Filtro

3) 
SELECT m.nome, m.idade
  FROM medicos m,
       consultas c,
       pacientes p
  WHERE m.cpf = c.cpfMed
    AND c.cpfPac = p.cpf
    AND p.nome = 'Ana';  --Filtro

4) 
SELECT am.numero
  FROM ambulatorio am,
       ambulatorio am5
  WHERE am5.numero = 5 -- Filtro
    AND am5.andar - am.andar 

JUNÇÕES
=======
JOIN
1) 
SELECT am.numero, am.andar
   FROM ambulatorio am
   JOIN atendimento a 
             ON am.numero = a.numero
   JOIN medicos m 
             ON a.cpf = m.cpf
   WHERE m.especilidade = 'Ortopedista';

2) 
SELECT f.codigo, f.nome, m.codigo, m.nome
   FROM medicos m
   JOIN funcionarios f 
             ON m.cidade = f.cidade;

3) 
SELECT m.codigo, m.nome
   FROM medicos m 
   JOIN consultas c ON m.cpf = c.cpfMed
   JOIN medicos ma ON ma.nome = 'Maria' 
   WHERE c.hora < '12:00'
     AND m.idade < ma.idade;

4)
SELECT f.nome, f.salario
   FROM funcionarios f 
   JOIN funcionarios f2 ON f2.nome = 'Carlos'
   WHERE f.salario < f2.salario;

NATURAL JOIN
1)
SELECT p.codigo, p.nome
   FROM pacientes p 
   NATURAL JOIN consultas c 
   WHERE c.hora > '14:00';

2)
SELECT am.numero, am.andar
   FROM ambularios am
   NATURAL JOIN atendimento a
   NATURAL JOIN medicos m 
   JOIN consultas c ON c.cpfMed = m.cpf
   WHERE  c.data = '2018-10-12';

3)
SELECT m.cpf, m.nome, m.especialidade 
   FROM medicos m
   JOIN consultas c ON c.cpfMed = m.cpf
   NATURAL JOIN pacientes p
   WHERE p.doenca = 'Tendinite';

OUTER JOIN
==========
LEFT, RIGTH ou FULL

1)
SELECT am.*, m.codigo, m.nome
   FROM ambularios am
   FULL JOIN atendimento a ON a.numero = am.numero
   LEFT JOIN medicos m ON a.cpf = m.cpf;

2)
SELECT m.cpf, m.nome, c.data, p.cpf, p.nome
   FROM medicos m 
   LEFT JOIN consultas c ON m.cpf = c.cpfMed
   LEFT JOIN pacientes p ON p.cpf = c.cpfPac;

