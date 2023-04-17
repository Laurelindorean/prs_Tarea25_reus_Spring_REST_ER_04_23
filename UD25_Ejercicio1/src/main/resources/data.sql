DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;


CREATE TABLE fabricantes (
  codigo int AUTO_INCREMENT,
  nombre varchar(250) DEFAULT NULL,
  PRIMARY KEY (codigo)
);

CREATE TABLE articulos(
	codigo INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    precio INT,
    fabricante_id INT NULL, 
    PRIMARY KEY(codigo) ,
	FOREIGN KEY (fabricante_id)
		REFERENCES fabricantes(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE
);


INSERT INTO fabricantes (nombre) VALUES ('Nvidia');
INSERT INTO fabricantes (nombre) VALUES ('AMD');
INSERT INTO fabricantes (nombre) VALUES ('Razer');
INSERT INTO fabricantes (nombre) VALUES ('Hyper X');

INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('QuadCast', 89, 4);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('BlackWidow X', 120, 3);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('SoloCast', 45, 4);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Ryzen y 7700X', 365, 2);

