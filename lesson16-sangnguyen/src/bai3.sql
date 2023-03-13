-- DDL --
CREATE DATABASE SCHOOL;

USE SCHOOL;

CREATE TABLE STUDENT
(
	ID				INT				NOT NULL,
    `NAME`			VARCHAR(50)		NOT NULL,
    GENDER			VARCHAR(50)		NOT NULL,
    CLASS_ID		INT				NOT NULL
);

CREATE TABLE RESULT
(
	STUDENT_ID		INT				NOT NULL,
    `SUBJECT`		VARCHAR(50)		NOT NULL,
    SCORE			VARCHAR(20)		NOT NULL
);

CREATE TABLE CLASS
(
	ID				INT				NOT NULL,
    NAME			VARCHAR(50)		NOT NULL,
    TEACHER			VARCHAR(50)		NOT NULL
);

-- DML --
INSERT INTO CLASS(ID, NAME, TEACHER)
VALUES	(1, "12A", "Ho Cong Trung"), 
		(2, "12B", "Dang Tu Anh"),
        (3, "12C", "Nguyen Van Tam");
        
INSERT INTO STUDENT(ID, NAME, GENDER, CLASS_ID)
VALUES	(1, "Dinh Thi Ngoc", "Female", 2), 
		(2, "Nguyen Thanh Hung", "Male", 1),
        (3, "Tran Mai Hoa", "Female", 2),
        (4, "Doan Quang Vinh", "Male", 1),
        (5, "Cao Anh Dao", "Female", 3),
        (6, "Tran Kim Tuyen", "Male", 3);
        
INSERT INTO RESULT(STUDENT_ID, SUBJECT, SCORE)
VALUES	(1, "Math", "Female"),
		(2, "Literature", "Female"),
        (3, "History", "Male"),
        (4, "Math", "Male"),
        (5, "Literature", "Female"),
        (6, "History", "Male"),
        (7, "Math", "Male"),
        (8, "Literature", "Female"),
        (9, "History", "Male");

ALTER TABLE STUDENT 
ADD CONSTRAINT FK_STUDENT_CLASS
FOREIGN KEY (CLASS_ID) REFERENCES CLASS(ID);  

ALTER TABLE STUDENT
ADD CONSTRAINT PK_STUDENT
PRIMARY KEY (ID);     
ALTER TABLE CLASS
ADD CONSTRAINT PK_CLASS
PRIMARY KEY (ID);   
-- Question 1: Which is relationship between tables Student and Result.
-- Answer 1: the Relationship between tables Student and Result is n-n.

-- Question 2: List name, gender and class name of all students.
-- Answer 2:
SELECT 	`NAME`,
		GENDER,
        CLASS_ID
	FROM STUDENT;
-- Question 3: 
-- Answer 3;
SELECT * 
	FROM STUDENT 
		WHERE CLASS_ID = (
			SELECT ID 
				FROM CLASS 
					WHERE `NAME` = "12B");
