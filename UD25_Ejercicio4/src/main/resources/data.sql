DROP TABLE IF EXISTS peliculas;
DROP TABLE IF EXISTS salas;

CREATE TABLE peliculas(
codigo INT AUTO_INCREMENT, 
nombre VARCHAR(100),
calificacion_edad INT,
PRIMARY KEY(codigo)
);

CREATE TABLE salas(
codigo INT AUTO_INCREMENT, 
nombre VARCHAR(100), 
pelicula_id INT, 
PRIMARY KEY(codigo),
FOREIGN KEY(pelicula_id) REFERENCES peliculas(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO peliculas (nombre, calificacion_edad) VALUES
('La Comunidad del Anillo', 12),
('Matrix', 12),
('It Follows', 16),
('Los Goonies', 8),
('Everything Everywhere All at Once', 14),
('Malditos Bastardos', 16),
('Saw', 18),
('The Suicide Squad', 17),
('Star Wars. Una nueva esperanza', 12),
('Cadena perpetua', 14);

INSERT INTO salas (nombre, pelicula_id) VALUES
('Lauren', 10),
('OCine', 8), 
('Yelmo', 5),
('JCA', 7),
('Paradiso', 10),
('La Maquinista', 6),
('3D', 4),
('Cinesa', 4),
('Major', 1),
('Central', 3);