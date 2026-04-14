CREATE DATABASE IF NOT EXISTS tareas_db;
USE tareas_db;

CREATE TABLE tareas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255),
    asignatura VARCHAR(100),
    completada BOOLEAN DEFAULT FALSE
);