CREATE TABLE Employee
(
EID INT,
EName VARCHAR(50),
Department  VARCHAR(50),
Salary DECIMAL(8,2),
JoiningDate DATETIME,
City VARCHAR(50)
);

INSERT INTO Employee
		VALUES (101,'RAHUL','ADMIN',56000,'01-JAN-1990','RAJKOT'),
			   (102,'HARDIK','IT',18000,'25-SEP-1990','AHMEDABAD'),
			   (103,'BHAVIN','HR',25000,'14-MAY-1991','BARODA'),
			   (104,'BHOOMI','ADMIN',39000,'08-FEB-1991','RAJKOT'),
			   (105,'ROHIT','IT',17000,'23-JUL-1990','JAMNAGAR'),
			   (106,'PRIYA','IT',9000,'18-OCT-1990','AHMEDABAD'),
			   (107,'NEHA','HR',34000,'25-DEC-1991','RAJKOT');

SELECT*FROM Employee;

(1) SELECT MAX(SALARY) As Maximum, MIN(SALARY) As Minimum, AVG(SALARY) As Average_Sal,SUM (salary) As Total_Sal FROM EMPLOYEE

(2) SELECT COUNT(*)  FROM EMPLOYEE

(3) SELECT MAX(SALARY) FROM EMPLOYEE
    WHERE DEPARTMENT='IT'
    GROUP BY CITY

(6) SELECT CITY FROM EMPLOYEE
    GROUP BY CITY
    HAVING COUNT(ENAME)>1

(7) SELECT Department,SUM(Salary) FROM Employee
    GROUP BY Department

(8) SELECT AVG(Salary) FROM EMPLOYEE
    GROUP BY Department
    WHERE CITY='AHMEDABAD'
     WHERE CITY='RAJKOT'
     GROUP BY DEPARTMENT
     HAVING SUM(SALARY)>50000
     WHERE CITY='Rajkot'
     FROM EMPLOYEE
     FROM EMPLOYEE
     WHERE JOININGDATE<'1991-01-01'

(14) SELECT Department, SUM(SALARY)
     FROM EMPLOYEE
     GROUP BY DEPARTMENT
     HAVING SUM(SALARY)>35000
     ORDER BY SUM(SALARY)

(15) SELECT Department
     FROM EMPLOYEE
     GROUP BY DEPARTMENT
     HAVING COUNT(EID)>2

(16) SELECT MIN(SALARY)
	 FROM EMPLOYEE
	 WHERE CITY='RAJKOT'

(17) SELECT CITY, COUNT(*) 
     FROM EMPLOYEE
     GROUP BY CITY

(18) SELECT DEPARTMENT,MIN(SALARY)
	 FROM EMPLOYEE
	 GROUP BY DEPARTMENT

(19) SELECT SUM(SALARY)
     FROM EMPLOYEE
	 GROUP BY CITY

(20) SELECT MIN(SALARY),MAX(SALARY),SUM(SALARY),DEPARTMENT
	 FROM EMPLOYEE
	 GROUP BY DEPARTMENT