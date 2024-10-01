-- Crear tabla login
CREATE TABLE login (
    email VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL
);


-- Crear tabla registro
CREATE TABLE registro (
    id_registro INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL
    rol ENUM('ADMIN', 'USER') NOT NULL
);


-- Crear tabla cliente
CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    telefono VARCHAR(20),
    direccion VARCHAR(255)
);

-- Crear tabla pedido
CREATE TABLE pedido (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

-- Crear tabla intermedia para productos en pedidos
CREATE TABLE pedido_productos (
    id_pedido INT,
    id_producto INT,
    FOREIGN KEY (id_pedido) REFERENCES pedido(id_pedido),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)  -- Asumiendo que 'productos' es la tabla base para 'Productos'
);