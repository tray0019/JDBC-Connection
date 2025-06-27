DROP SCHEMA IF EXISTS `detectives` ;

CREATE SCHEMA IF NOT EXISTS detectives DEFAULT CHARACTER SET utf8mb4;
-- DROP USER IF EXISTS 'tray0019' @'localhost';
CREATE USER IF NOT EXISTS 'tray0019'@'localhost' IDENTIFIED BY '2025';
GRANT ALL ON detectives.* TO 'tray0019'@'localhost';

USE detectives;

CREATE TABLE detective(
	detectiveID int NOT NULL AUTO_INCREMENT,
    detectiveFNAME varchar(50) NOT NULL,
    detectiveLNAME varchar(50), 
    PRIMARY KEY (detectiveID)
) ENGINE=InnoDB auto_increment=6 default charset=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO detective(detectiveFNAME, detectiveLNAME) VALUES ('Sherlock','Holmes');
INSERT INTO detective(detectiveFNAME, detectiveLNAME) VALUES ('Light','Yagami');

select * from detective;