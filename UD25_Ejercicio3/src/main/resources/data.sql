DROP TABLE IF EXISTS almacenes;
DROP TABLE IF EXISTS cajas;

CREATE TABLE almacenes(
    codigo INT AUTO_INCREMENT,
    lugar VARCHAR(100),
    capacidad INT,
    PRIMARY KEY(codigo)
);

CREATE TABLE cajas(
    num_referencia CHAR(5),
    contenido VARCHAR(100),
    valor INT, 
    almacen_id INT, 
    PRIMARY KEY (num_referencia), 
    FOREIGN KEY (almacen_id) REFERENCES almacenes(codigo)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO almacenes (lugar, capacidad) VALUES
('Lleida', 5),
('Tarragona', 2),
('Nueva York', 10),
('Paris', 6),
('Córdoba', 2),
('Reus', 4),
('Londres', 7),
('Glasgow', 6),
('Edimburgo', 4),
('Tokio', 8);

INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES
('1D5E', 'Patatas', 10, 7),
('1R7T', 'Kiwis', 5, 2),
('2V6R', 'Manzanas', 20, 2),
('3M4N', 'Melocotones', 15, 6),
('1T2Y', 'Peras', 4, 6),
('8Z5L', 'Piñas', 25, 8),
('2R3Y', 'Ciruelas', 30, 1),
('7V8L', 'Cebollas', 14, 4),
('8W7B', 'Ajos', 54, 3),
('1F4T', 'Cerezas', 21, 10);