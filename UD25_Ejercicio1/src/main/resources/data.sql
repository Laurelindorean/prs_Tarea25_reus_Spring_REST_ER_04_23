DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;

CREATE TABLE fabricantes (
codigo INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(100) NULL,
PRIMARY KEY(codigo)
);

CREATE TABLE articulos(
codigo INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(100) NULL,
precio INT NULL , 
fk_fabricante INT  NULL, 
PRIMARY KEY(codigo), 
FOREIGN KEY(fk_fabricante) REFERENCES fabricantes(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO fabricantes (nombre) VALUES ('Nvidia');
INSERT INTO fabricantes (nombre) VALUES ('AMD');
INSERT INTO fabricantes (nombre) VALUES ('Razer');
INSERT INTO fabricantes (nombre) VALUES ('Hyper X');

INSERT INTO articulos (nombre, precio, fk_fabricante) VALUES ('QuadCast', 89, 4);
INSERT INTO articulos (nombre, precio, fk_fabricante) VALUES ('BlackWidow X', 120, 3);
INSERT INTO articulos (nombre, precio, fk_fabricante) VALUES ('SoloCast', 45, 4);
INSERT INTO articulos (nombre, precio, fk_fabricante) VALUES ('Ryzen y 7700X', 365, 2);
