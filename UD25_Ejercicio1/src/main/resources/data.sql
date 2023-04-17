DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;
CREATE TABLE fabricantes (
codigo INT AUTO_INCREMENT,
nombre VARCHAR(100),
PRIMARY KEY(codigo)
);

CREATE TABLE articulos(
codigo INT AUTO_INCREMENT,
nombre VARCHAR(100),
precio INT, 
fk_fabricante INT, 
PRIMARY KEY(codigo), 
CONSTRAINT fk_fabricante FOREIGN KEY(fk_fabricante) REFERENCES fabricantes (codigo)
);

INSERT INTO fabricantes (nombre) VALUES ('Nvidia');
INSERT INTO fabricantes (nombre) VALUES ('AMD');
INSERT INTO fabricantes (nombre) VALUES ('Razer');
INSERT INTO fabricantes (nombre) VALUES ('Hyper X');

INSERT INTO articulos (nombre, precio, fk_fabricante) VALUES ('QuadCast', 89, 4);
INSERT INTO articulos (nombre, precio, fk_fabricante) VALUES ('BlackWidow X', 120, 3);
INSERT INTO articulos (nombre, precio, fk_fabricante) VALUES ('SoloCast', 45, 4);
INSERT INTO articulos (nombre, precio, fk_fabricante) VALUES ('Ryzen y 7700X', 365, 2);
