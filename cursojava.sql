DROP DATABASE cursojava;

CREATE SCHEMA IF NOT EXISTS cursojava DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE cursojava ;

CREATE TABLE IF NOT EXISTS cursojava.user (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(70) NOT NULL,
  surnames VARCHAR(140) NOT NULL,
  email VARCHAR(255) NOT NULL,
  phone VARCHAR(32) NOT NULL,
  password VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

ALTER TABLE `cursojava`.`user` 
CHANGE COLUMN `phone` `phone` VARCHAR(32) NULL ;

INSERT INTO `cursojava`.`user` (`name`, `surnames`, `email`, `phone`, `password`) VALUES ('Edgar', 'Jimenez Galicia', 'edgar.mxm@gmail.com', '1234567891', 'password');
INSERT INTO `cursojava`.`user` (`name`, `surnames`, `email`, `phone`, `password`) VALUES ('Cesar', 'Rubio Guzman', 'cesar.mxm@gmail.com', null, 'password');
