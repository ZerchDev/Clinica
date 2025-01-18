CREATE TABLE medicos (
    id BIGINT NOT NULL IDENTITY(1,1), -- Utiliza IDENTITY para auto-incrementar
    nombre VARCHAR(100) NOT NULL,
    apellidoPaterno VARCHAR(100) NOT NULL,
    apellidoMaterno VARCHAR(100) NOT NULL,
    telefono VARCHAR(10) NOT NULL UNIQUE,
    cedula VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    especialidad VARCHAR(100) NOT NULL,

    PRIMARY KEY (id) -- Define la clave primaria
);