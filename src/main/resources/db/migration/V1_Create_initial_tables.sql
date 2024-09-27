-- V1__Create_product_tables.sql

-- Crear tabla bebida
CREATE TABLE bebida (
    id_bebida INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    sabor VARCHAR(255),
     tamanio ENUM('PEQUEÑA', 'MEDIANA','FAMILIAR'),
    cantidad INT,
    precio DECIMAL(10, 2)

);

-- Crear tabla pizza
CREATE TABLE pizza (
    id_pizza INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    sabor VARCHAR(255),
    tamanio ENUM('PEQUEÑA', 'MEDIANA','FAMILIAR'),
    cantidad INT,
    precio DECIMAL(10, 2)
);

-- Crear tabla empanada
CREATE TABLE empanada (
    id_empanada INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    sabor VARCHAR(255),
    cantidad INT,
    precio DECIMAL(10, 2)
);

-- Crear tabla postre
CREATE TABLE postre (
    id_postre INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    sabor VARCHAR(255),
    tamanio ENUM('PEQUEÑA', 'MEDIANA','FAMILIAR'),
    cantidad INT,
    precio DECIMAL(10, 2)
);
