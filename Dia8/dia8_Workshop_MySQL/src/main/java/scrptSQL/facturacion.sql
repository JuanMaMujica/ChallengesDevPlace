-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dia8_challenge
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dia8_challenge
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dia8_challenge` DEFAULT CHARACTER SET utf8 ;
USE `dia8_challenge` ;

-- -----------------------------------------------------
-- Table `dia8_challenge`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dia8_challenge`.`Cliente` (
  `dni` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `fechaNacimiento` DATE NULL,
  PRIMARY KEY (`dni`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dia8_challenge`.`Vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dia8_challenge`.`Vendedor` (
  `dni` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `fechaNacimiento` DATE NULL,
  `salario` DECIMAL NULL,
  PRIMARY KEY (`dni`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dia8_challenge`.`Productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dia8_challenge`.`Productos` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `precio` DECIMAL NULL,
  `cantidad` INT NULL,
  `stockMinimo` INT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dia8_challenge`.`Facturacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dia8_challenge`.`Facturacion` (
  `nroFactura` INT NOT NULL,
  `fechaCompra` DATE NULL,
  `Cliente_dni` INT NOT NULL,
  `Vendedor_dni` INT NOT NULL,
  PRIMARY KEY (`nroFactura`),
  INDEX `fk_Facturacion_Cliente1_idx` (`Cliente_dni` ASC) VISIBLE,
  INDEX `fk_Facturacion_Vendedor1_idx` (`Vendedor_dni` ASC) VISIBLE,
  CONSTRAINT `fk_Facturacion_Cliente1`
    FOREIGN KEY (`Cliente_dni`)
    REFERENCES `dia8_challenge`.`Cliente` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Facturacion_Vendedor1`
    FOREIGN KEY (`Vendedor_dni`)
    REFERENCES `dia8_challenge`.`Vendedor` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dia8_challenge`.`Detalle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dia8_challenge`.`Detalle` (
  `Facturacion_nroFactura` INT NOT NULL,
  `Productos_codigo` INT NOT NULL,
  `precio` DOUBLE UNSIGNED NULL,
  `cantidadProducto` INT UNSIGNED NULL,
  `Total` DOUBLE UNSIGNED NULL,
  PRIMARY KEY (`Facturacion_nroFactura`, `Productos_codigo`),
  INDEX `fk_Facturacion_has_Productos_Productos1_idx` (`Productos_codigo` ASC) VISIBLE,
  INDEX `fk_Facturacion_has_Productos_Facturacion1_idx` (`Facturacion_nroFactura` ASC) VISIBLE,
  CONSTRAINT `fk_Facturacion_has_Productos_Facturacion1`
    FOREIGN KEY (`Facturacion_nroFactura`)
    REFERENCES `dia8_challenge`.`Facturacion` (`nroFactura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Facturacion_has_Productos_Productos1`
    FOREIGN KEY (`Productos_codigo`)
    REFERENCES `dia8_challenge`.`Productos` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
