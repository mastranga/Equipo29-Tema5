-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-10-2023 a las 00:58:30
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunar23`
--
CREATE DATABASE IF NOT EXISTS `vacunar23` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `vacunar23`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `codCita` int(11) NOT NULL,
  `codRefuerzo` int(11) NOT NULL,
  `fechaHoraCita` varchar(60) NOT NULL,
  `centroVacunacion` varchar(60) NOT NULL,
  `fechaHoraColoca` datetime DEFAULT NULL,
  `dni` int(11) NOT NULL,
  `nroSerie` int(11) NOT NULL,
  `cancelada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cita`
--

INSERT INTO `cita` (`codCita`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dni`, `nroSerie`, `cancelada`) VALUES
(3, 1, '2023-10-04 15:00', 'Hospital Italiano', '2023-10-04 00:00:00', 35255569, 1, 0),
(4, 1, '2023-10-18 15:00', 'Hospital Italiano', NULL, 35255569, 1, 0),
(5, 1, '2023-11-01 15:00', 'Hospital Italiano', NULL, 35255569, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `idCiudadano` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombreCompleto` varchar(60) NOT NULL,
  `email` varchar(60) NOT NULL,
  `celular` varchar(60) NOT NULL,
  `patologia` varchar(60) DEFAULT NULL,
  `ambitoTrabajo` varchar(60) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`idCiudadano`, `dni`, `nombreCompleto`, `email`, `celular`, `patologia`, `ambitoTrabajo`, `estado`) VALUES
(1, 11222333, 'Laura Fernander', 'mail2@mail.com', '1123335469', NULL, 'SalUD', 1),
(2, 35255555, 'Carlos Marx', 'mail3@mail.com', '1123558974', NULL, 'comercio', 1),
(3, 35255569, 'Bruno Mastrangelo', 'mail@mail.com', '1125556661', 'diabetes', 'desempleado', 1),
(4, 32555666, 'Raul Lopez', 'rlopez@gmail.oom', '1152356699', NULL, 'administrativo', 1),
(5, 111222333, 'Mariana Salazar', 'mail5@mail.com', '112233556', NULL, 'comercio', 1),
(6, 25698789, 'Juan Mario', 'mail6@mail.com', '1125569874', NULL, 'comercio', 1),
(7, 32698774, 'Mariano Martinez', 'mail7@mail.com', '1125566987', 'asma', 'educacion', 1),
(8, 36985441, 'Carlos Tevez', 'mail8@mail.com', '1125888974', 'asma', 'comercio', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `idLaboratorio` int(11) NOT NULL,
  `cuit` varchar(60) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `pais` varchar(60) NOT NULL,
  `domicilio` varchar(60) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`idLaboratorio`, `cuit`, `nombre`, `pais`, `domicilio`, `estado`) VALUES
(1, '30503518518', 'Pfizer', 'USA', 'Wall Street ', 1),
(2, '30503518512', 'Test', 'Argentina', 'Av de mayo', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `nroSerie` int(11) NOT NULL,
  `marca` varchar(60) NOT NULL,
  `medida` double NOT NULL,
  `fechaCad` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idLaboratorio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`nroSerie`, `marca`, `medida`, `fechaCad`, `estado`, `idLaboratorio`) VALUES
(1, 'Moderna', 0.3, '2023-10-04', 1, 1),
(2, 'test2', 0.9, '2023-10-19', 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`codCita`),
  ADD KEY `dni` (`dni`),
  ADD KEY `nroSerie` (`nroSerie`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`idCiudadano`),
  ADD UNIQUE KEY `email` (`email`,`celular`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`idLaboratorio`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`nroSerie`),
  ADD KEY `idLaboratorio` (`idLaboratorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `codCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  MODIFY `idCiudadano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  MODIFY `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  MODIFY `nroSerie` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `ciudadano` (`dni`),
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`nroSerie`) REFERENCES `vacuna` (`nroSerie`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`idLaboratorio`) REFERENCES `laboratorio` (`idLaboratorio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
