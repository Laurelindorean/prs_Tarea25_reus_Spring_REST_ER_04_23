DROP TABLE IF EXISTS departamentos;
DROP TABLE IF EXISTS empleados;

CREATE TABLE departamentos(
codigo INT NOT NULL,
nombre VARCHAR(100), 
presupuesto INT, 
PRIMARY KEY(codigo)
);

CREATE TABLE empleados(
dni VARCHAR(8) NOT NULL, 
nombre VARCHAR(100),
apellidos VARCHAR(255), 
departamento_id INT, 
PRIMARY KEY(dni),
CONSTRAINT departamento_id FOREIGN KEY(departamento_id) 
REFERENCES departamentos(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO departamentos VALUES
(1, 'Administración', 67000),
(2, 'Dirección', 120000),
(3, 'Logística', 25000),
(4, 'Operaciones', 35000),
(5, 'Compras', 63000),
(6, 'Marketing', 45000),
(7, 'Auditoria', 43002),
(8, 'Tesorería', 84000),
(9, 'Comercial', 57800),
(10, 'Comunicación', 21040);

INSERT INTO empleados VALUES
('1245789A', 'Palmira', 'Romia', 2),
('4578899B', 'Marc', 'Saez', 5),
('1577899C', 'Marc', 'Rojo', 9),
('7884562D', 'Francisco', 'Parra', 7),
('8544879E', 'Aitor', 'Iglesias', 4),
('1478458R', 'Elena', 'Lopez', 1),
('6587878T', 'Paula', 'Sousa', 5),
('4777113S', 'Alejandro', 'Jimenez', 3),
('4112285X', 'Camila', 'Garcia', 10),
('4882442F', 'Roger', 'Gibert', 7); 