CREATE DATABASE gestionescolar;
USE gestionescolar;


CREATE TABLE IF NOT EXISTS profesores (
    profesorid INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    asignatura VARCHAR(100) NOT NULL
);


CREATE TABLE IF NOT EXISTS cursos (
    cursoid INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    profesorid INT NOT NULL,
    FOREIGN KEY (profesorid) REFERENCES profesores(profesorid)
);


CREATE TABLE IF NOT EXISTS estudiantes (
    estudianteid INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    cursoid INT NOT NULL,
    FOREIGN KEY (cursoid) REFERENCES cursos(cursoid)
);


INSERT INTO profesores (profesorid, nombre, apellido, email, asignatura)
VALUES 
(1, 'Juan', 'Pérez', 'juan.perez@uni.edu', 'Matemáticas'),
(2, 'María', 'Gómez', 'maria.gomez@uni.edu', 'Historia');


INSERT INTO cursos (cursoid, nombre, profesorid)
VALUES
(1, 'Álgebra', 1),
(2, 'Matemáticas', 1),
(3, 'Historia', 2);


INSERT INTO estudiantes (estudianteid, nombre, apellido, email, cursoid)
VALUES
(101, 'Carlos', 'López', 'carlos.lopez@student.com', 1),
(102, 'Ana', 'Martínez', 'ana.martinez@student.com', 2),
(103, 'Luis', 'Rodríguez', 'luis.rodriguez@student.com', 3);
SELECT * FROM profesores;
SELECT * FROM cursos;
SELECT * FROM estudiantes;


