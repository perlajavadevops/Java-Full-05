--create database batch03;

CREATE TABLE `emp` (
  `id` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `salary` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DELIMITER $$
CREATE PROCEDURE `DeleteEmployee`(IN id_i INT)
begin    
	delete from emp where id=id_i;
	commit;
	end$$
DELIMITER ;

CALL `batch03`.`DeleteEmployee`(2);

DELIMITER $$
CREATE PROCEDURE `InsertEmployee`(IN id INT,    
IN name VARCHAR(100), IN salary FLOAT)
begin    
insert into emp values(id,name, salary);    
end$$
DELIMITER ;

CALL `batch03`.`InsertEmployee`(2,'hi',20000);

CALL `batch03`.`SelectAllEmployees`();

DELIMITER $$
CREATE PROCEDURE `SelectAllEmployees`()
begin    
	select * from emp;   
	end$$
DELIMITER ;



DELIMITER $$
CREATE PROCEDURE `UpdateEmployee`(IN id_i INT,    
	IN name_a VARCHAR(100), IN salary_s FLOAT)
begin    
	update emp set name=name_a, salary=salary_s where id=id_i;  
	end$$
DELIMITER ;

CALL `batch03`.`UpdateEmployee`(2, 'Hello_qqq', 8000);


DELIMITER $$
CREATE PROCEDURE `SelectSingleEmployee`(IN id_i INT)
begin    
	select * from emp where id = id_i;   
	end$$
DELIMITER ;

CALL `batch03`.`SelectSingleEmployee`(2);