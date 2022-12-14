CREATE TABLE STUDENT2
(
RNO int,
NAME varchar(50),
CITY varchar(50),
DID int
);

CREATE TABLE ACADEMIC2
(
RNO int,
SPI Decimal(4,2),
BKLOG int
);

CREATE TABLE DEPARTMENT2
(
DID int,
DName varchar(50)
);

INSERT INTO STUDENT2
	VALUES(101,'RAJU','RAJKOT',10),
	      (102,'AMIT','AHMEDABAD',20),
		  (103,'SANJAY','BARODA',40),
		  (104,'NEHA','RAJKOT',20),
		  (105,'MEERA','AHMEDABAD',30),
		  (106,'MAHESH','BARODA',10)

INSERT INTO ACADEMIC2
	VALUES(101,8.8,0),
	      (102,9.2,2),
		  (103,7.6,1),
		  (104,8.2,4),
		  (105,7.0,2),
		  (106,8.9,3)

INSERT INTO DEPARTMENT2
	VALUES(10,'COMPUTER'),
	      (20,'ELECTRICAL'),
		  (30,'MECHANICAL'),
		  (40,'CIVIL')

SELECT*FROM STUDENT2;
SELECT*FROM ACADEMIC2;
SELECT*FROM DEPARTMENT2;

									LAB-11

{TO CHECK FIRST EXECUTE INNER QUERY(NOT COMPULSARY)}

(1) SELECT RNO,NAME,CITY
    FROM STUDENT2
    WHERE DID=(SELECT DID FROM DEPARTMENT2
	       WHERE DNAME='COMPUTER');

(2) SELECT NAME FROM STUDENT2
    WHERE RNO IN(SELECT RNO FROM ACADEMIC2
             WHERE SPI>8); 

(3) SELECT RNO,NAME,CITY
    FROM STUDENT2 WHERE CITY='RAJKOT'
    AND DID=(SELECT DID FROM DEPARTMENT2 
             WHERE DNAME='COMPUTER');

(4) SELECT COUNT(*)
    FROM STUDENT2 WHERE DID=(SELECT DID FROM DEPARTMENT2
			    WHERE DNAME='ELECTRICAL');

(5) SELECT NAME FROM STUDENT2 
    WHERE RNO=(SELECT RNO FROM ACADEMIC2 
	       WHERE SPI=(SELECT MAX(SPI) FROM ACADEMIC2));

(6) SELECT *FROM STUDENT2
    WHERE RNO IN(SELECT RNO FROM ACADEMIC2
                 WHERE BKLOG>1);

(7) SELECT NAME FROM STUDENT2
    WHERE
    RNO=(SELECT RNO FROM ACADEMIC2 
	 WHERE SPI=(SELECT MAX(SPI) FROM ACADEMIC2 
		    WHERE SPI<(SELECT MAX (SPI) FROM ACADEMIC2)));


(8) SELECT NAME FROM STUDENT2
    WHERE DID IN(SELECT DID FROM DEPARTMENT2
                 WHERE DNAME='COMPUTER'
		    OR DNAME='MECHANICAL');
 

(9) SELECT NAME FROM STUDENT2
    WHERE DID=(SELECT DID FROM STUDENT2
	       WHERE RNO=102);

(10) SELECT NAME FROM STUDENT2
     WHERE RNO=(SELECT RNO FROM ACADEMIC2
		WHERE SPI>9)
		AND
	DID=(SELECT DID FROM DEPARTMENT2 
	     WHERE DNAME='ELECTRICAL'); 
 