-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-08-2024 a las 19:17:56
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotelmanagement`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acompanante`
--

CREATE TABLE `acompanante` (
  `IdentificacionAcompanante` int(11) NOT NULL,
  `TipoIdentificacion` varchar(200) NOT NULL,
  `IdentificacionHuesped` int(11) DEFAULT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Apellido` varchar(255) NOT NULL,
  `Edad` int(11) NOT NULL,
  `Nacionalidad` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `acompanante`
--

INSERT INTO `acompanante` (`IdentificacionAcompanante`, `TipoIdentificacion`, `IdentificacionHuesped`, `Nombre`, `Apellido`, `Edad`, `Nacionalidad`) VALUES
(2134242, 'EXTRANJERO ', 1234567, 'Sofia', 'Telmo', 50, 'Argentina'),
(7136713, 'EXTRANJERO ', 7287323, 'Julia', 'Pierina', 27, 'Colombia'),
(7623913, 'EXTRANJERO ', 7287323, 'Marcos', 'Caceres Pierina', 14, 'Colombia'),
(71287631, 'EXTRANJERO ', 83673826, 'Maria', 'Rojas', 20, 'Argentina'),
(544783743, 'EXTRANJERO ', 2454242, 'Pedro', 'Sanches', 67, 'Estados Unidos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `CodigoAdministrador` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Apellido` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`CodigoAdministrador`, `Nombre`, `Apellido`) VALUES
(1, 'Juan', 'Perez'),
(2, 'Maria', 'Gomez'),
(3, 'Carlos', 'Lopez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `CodigoEmpleado` int(11) NOT NULL,
  `CodigoHotel` int(11) DEFAULT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Apellido` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`CodigoEmpleado`, `CodigoHotel`, `Nombre`, `Apellido`) VALUES
(1, 1, 'Pedro', 'Garcia'),
(2, 1, 'Ana', 'Martinez'),
(3, 1, 'Juan', 'Lopez'),
(4, 2, 'Luis', 'Rodriguez'),
(5, 2, 'Laura', 'Sanchez'),
(6, 2, 'Diego', 'Hernandez'),
(7, 3, 'Marina', 'Diaz'),
(8, 3, 'Jorge', 'Perez'),
(9, 3, 'Marta', 'Gomez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `CodigoFactura` int(11) NOT NULL,
  `IdentificacionHuesped` int(11) DEFAULT NULL,
  `CodigoHotel` int(11) DEFAULT NULL,
  `CodigoHabitacion` int(11) DEFAULT NULL,
  `CodigoPedido` int(11) DEFAULT NULL,
  `CodigoEmpleado` int(11) DEFAULT NULL,
  `FechaFactura` date NOT NULL,
  `TotalFactura` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `CodigoHabitacion` int(11) NOT NULL,
  `CodigoHotel` int(11) DEFAULT NULL,
  `TamanoHabitacion` varchar(50) NOT NULL,
  `PrecioPorDia` decimal(10,2) NOT NULL,
  `EstadoHabitacion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`CodigoHabitacion`, `CodigoHotel`, `TamanoHabitacion`, `PrecioPorDia`, `EstadoHabitacion`) VALUES
(101, 1, 'Doble', 150.00, 'OCUPADO'),
(102, 1, 'Doble', 150.00, 'Disponible'),
(103, 1, 'Doble', 150.00, 'RESERVADO'),
(104, 1, 'Doble', 150.00, 'OCUPADO'),
(105, 1, 'Doble', 150.00, 'MANTENIMIENTO '),
(201, 1, 'Doble', 150.00, 'OCUPADO'),
(202, 1, 'Doble', 150.00, 'OCUPADO'),
(203, 1, 'Doble', 150.00, 'DISPONIBLE '),
(204, 1, 'Doble', 150.00, 'Disponible'),
(205, 1, 'Doble', 150.00, 'MANTENIMIENTO '),
(301, 2, 'Individual', 100.00, 'RESERVADO'),
(302, 2, 'Individual', 100.00, 'Disponible'),
(303, 2, 'Individual', 100.00, 'Disponible'),
(304, 2, 'Individual', 100.00, 'Disponible'),
(305, 2, 'Individual', 100.00, 'Disponible'),
(401, 2, 'Individual', 100.00, 'Disponible'),
(402, 2, 'Individual', 100.00, 'Disponible'),
(403, 2, 'Individual', 100.00, 'Disponible'),
(404, 2, 'Individual', 100.00, 'Disponible'),
(405, 2, 'Individual', 100.00, 'Disponible'),
(501, 3, 'Suite', 200.00, 'Disponible'),
(502, 3, 'Suite', 200.00, 'Disponible'),
(503, 3, 'Suite', 200.00, 'Disponible'),
(504, 3, 'Suite', 200.00, 'Disponible'),
(505, 3, 'Suite', 200.00, 'Disponible'),
(601, 3, 'Suite', 200.00, 'Disponible'),
(602, 3, 'Suite', 200.00, 'Disponible'),
(603, 3, 'Suite', 200.00, 'Disponible'),
(604, 3, 'Suite', 200.00, 'OCUPADO'),
(605, 3, 'Suite', 200.00, 'RESERVADO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hotel`
--

CREATE TABLE `hotel` (
  `CodigoHotel` int(11) NOT NULL,
  `DireccionHotel` varchar(255) NOT NULL,
  `Ciudad` varchar(255) NOT NULL,
  `Aforo` int(11) NOT NULL,
  `CantidadHabitaciones` int(11) NOT NULL,
  `Ruc` varchar(20) NOT NULL,
  `CodigoAdministrador` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `hotel`
--

INSERT INTO `hotel` (`CodigoHotel`, `DireccionHotel`, `Ciudad`, `Aforo`, `CantidadHabitaciones`, `Ruc`, `CodigoAdministrador`) VALUES
(1, 'Av. Lima 123', 'Lima', 200, 100, '12345678901', 1),
(2, 'Jr. Cuzco 456', 'Cuzco', 150, 80, '23456789012', 2),
(3, 'Calle Arequipa 789', 'Arequipa', 180, 90, '34567890123', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `IdentificacionHuesped` int(11) NOT NULL,
  `TipoIdentificacionA` varchar(200) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Apellido` varchar(255) NOT NULL,
  `Nacionalidad` varchar(255) NOT NULL,
  `Edad` int(11) NOT NULL,
  `FechaIngreso` date NOT NULL,
  `FechaSalida` date NOT NULL,
  `NumeroAcompanantes` int(11) NOT NULL,
  `CodigoHabitacion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`IdentificacionHuesped`, `TipoIdentificacionA`, `Nombre`, `Apellido`, `Nacionalidad`, `Edad`, `FechaIngreso`, `FechaSalida`, `NumeroAcompanantes`, `CodigoHabitacion`) VALUES
(1234567, 'EXTRANJERO ', 'YAMPIER', 'CACERESA CARI', 'China', 20, '2024-05-02', '2024-05-04', 1, 201),
(2454242, 'EXTRANJERO ', 'Lurdes', 'Nano Castillo', 'Alemania', 34, '2024-05-20', '2024-05-28', 1, 604),
(7287323, 'EXTRANJERO ', 'Yerson', 'Cacere Cari', 'Colombia', 28, '2024-05-24', '2024-05-30', 2, 104),
(83673826, 'EXTRANJERO ', 'Anibal', 'Maurico Merino', 'Arabia Saudita', 20, '2024-05-24', '2024-05-27', 1, 101);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `CodigoPedido` int(11) NOT NULL,
  `IdentificacionHuesped` int(11) DEFAULT NULL,
  `CodigoServicio` int(11) DEFAULT NULL,
  `CodigoEmpleado` int(11) DEFAULT NULL,
  `CantidadPedido` int(11) NOT NULL,
  `CobroTotalServicios` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`CodigoPedido`, `IdentificacionHuesped`, `CodigoServicio`, `CodigoEmpleado`, `CantidadPedido`, `CobroTotalServicios`) VALUES
(3, 7287323, 3, 5, 4, 60.00),
(5, 2454242, 4, 4, 5, 125.00),
(6, 2454242, 3, 4, 5, 75.00),
(7, 2454242, 2, 4, 5, 25.00),
(8, 83673826, 4, 4, 3, 75.00),
(9, 83673826, 5, 4, 3, 30.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `CodigoServicio` int(11) NOT NULL,
  `DescripcionServicio` varchar(255) NOT NULL,
  `PrecioServicio` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`CodigoServicio`, `DescripcionServicio`, `PrecioServicio`) VALUES
(1, 'Almuerzo', 20.00),
(2, 'Bebidas', 5.00),
(3, 'Desayuno', 15.00),
(4, 'Cena', 25.00),
(5, 'Servicio a la Habitación', 10.00),
(6, 'Lavandería', 8.00),
(7, 'Spa', 50.00),
(8, 'Gimnasio', 30.00),
(9, 'Transporte', 40.00),
(10, 'Excursiones', 100.00);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acompanante`
--
ALTER TABLE `acompanante`
  ADD PRIMARY KEY (`IdentificacionAcompanante`),
  ADD KEY `IdentificacionHuesped` (`IdentificacionHuesped`);

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`CodigoAdministrador`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`CodigoEmpleado`),
  ADD KEY `CodigoHotel` (`CodigoHotel`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`CodigoFactura`),
  ADD KEY `IdentificacionHuesped` (`IdentificacionHuesped`),
  ADD KEY `CodigoHotel` (`CodigoHotel`),
  ADD KEY `CodigoHabitacion` (`CodigoHabitacion`),
  ADD KEY `CodigoPedido` (`CodigoPedido`),
  ADD KEY `CodigoEmpleado` (`CodigoEmpleado`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`CodigoHabitacion`),
  ADD KEY `CodigoHotel` (`CodigoHotel`);

--
-- Indices de la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`CodigoHotel`),
  ADD KEY `CodigoAdministrador` (`CodigoAdministrador`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`IdentificacionHuesped`),
  ADD KEY `CodigoHabitacion` (`CodigoHabitacion`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`CodigoPedido`),
  ADD KEY `IdentificacionHuesped` (`IdentificacionHuesped`),
  ADD KEY `CodigoServicio` (`CodigoServicio`),
  ADD KEY `CodigoEmpleado` (`CodigoEmpleado`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`CodigoServicio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `CodigoAdministrador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `CodigoEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `CodigoFactura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hotel`
--
ALTER TABLE `hotel`
  MODIFY `CodigoHotel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `CodigoPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `CodigoServicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `acompanante`
--
ALTER TABLE `acompanante`
  ADD CONSTRAINT `acompanante_ibfk_1` FOREIGN KEY (`IdentificacionHuesped`) REFERENCES `huesped` (`IdentificacionHuesped`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`CodigoHotel`) REFERENCES `hotel` (`CodigoHotel`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`IdentificacionHuesped`) REFERENCES `huesped` (`IdentificacionHuesped`),
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`CodigoHotel`) REFERENCES `hotel` (`CodigoHotel`),
  ADD CONSTRAINT `factura_ibfk_3` FOREIGN KEY (`CodigoHabitacion`) REFERENCES `habitacion` (`CodigoHabitacion`),
  ADD CONSTRAINT `factura_ibfk_4` FOREIGN KEY (`CodigoPedido`) REFERENCES `pedido` (`CodigoPedido`),
  ADD CONSTRAINT `factura_ibfk_5` FOREIGN KEY (`CodigoEmpleado`) REFERENCES `empleado` (`CodigoEmpleado`);

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`CodigoHotel`) REFERENCES `hotel` (`CodigoHotel`);

--
-- Filtros para la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD CONSTRAINT `hotel_ibfk_1` FOREIGN KEY (`CodigoAdministrador`) REFERENCES `administrador` (`CodigoAdministrador`);

--
-- Filtros para la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD CONSTRAINT `huesped_ibfk_1` FOREIGN KEY (`CodigoHabitacion`) REFERENCES `habitacion` (`CodigoHabitacion`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`IdentificacionHuesped`) REFERENCES `huesped` (`IdentificacionHuesped`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`CodigoServicio`) REFERENCES `servicio` (`CodigoServicio`),
  ADD CONSTRAINT `pedido_ibfk_3` FOREIGN KEY (`CodigoEmpleado`) REFERENCES `empleado` (`CodigoEmpleado`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
