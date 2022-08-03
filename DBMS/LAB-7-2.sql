CREATE TABLE Student_Marks
(
Sid INT,
SName VARCHAR(50),
Marks INT
);

INSERT INTO Student_Marks
		VALUES (1,'JOHN',90),
		       (2,'MARTIN',80),
			   (3,'CAROL',89),
			   (4,'JACK',99),
			   (5,'ROSE',88),
			   (6,'MARY',90);

 SELECT*FROM Student_Marks;

(1) Select COUNT(*)  FROM Student_Marks

(2) Select SUM(Marks)  FROM Student_Marks

(3) Select AVG(Marks)  FROM Student_Marks

(4) Select MIN(Marks)  FROM Student_Marks

(5) Select MAX(Marks)  FROM Student_Marks