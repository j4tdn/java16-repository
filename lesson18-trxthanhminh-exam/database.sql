CREATE DATABASE java16_database_exam CHAR SET utf8mb4;

USE java16_database_exam;


CREATE TABLE CLASS 
(
	ID INT PRIMARY KEY,
    `NAME` VARCHAR(50) NOT NULL,
    TEACHER VARCHAR(50) NOT NULL
);

CREATE TABLE STUDENT
(
	ID INT PRIMARY KEY,
    `NAME` VARCHAR(50) NOT NULL,
    GENDER VARCHAR(10) NOT NULL,
    CLASS_ID INT NOT NULL,
    CONSTRAINT FK_STUDENT_CLASS FOREIGN KEY(CLASS_ID) REFERENCES CLASS(ID)
);

CREATE TABLE RESULT 
(
	STUDENT_ID INT NOT NULL,
    `SUBJECT` VARCHAR(50) NOT NULL,
    SCORE INT NOT NULL,
    CONSTRAINT PK_RESULT PRIMARY KEY(STUDENT_ID, `SUBJECT`),
    CONSTRAINT FK_RESULT_STUDENT FOREIGN KEY(STUDENT_ID) REFERENCES STUDENT(ID)
);

INSERT INTO CLASS(ID, `NAME`, TEACHER)
VALUES (1, "12A", "Ho Cong Trung"),
	   (2, "12B", "Dang Tu Anh"),
	   (3, "12C", "Nguyen Van Tam");
       
INSERT INTO STUDENT(ID, `NAME`, GENDER, CLASS_ID)
VALUES (1, "Dinh Thi Ngoc", "Female", 2),
	   (2, "Nguyen Thanh Hung", "Male", 1),
	   (3, "Tran Mai Hoa", "Female", 2),
	   (4, "Doan Quang Vinh", "Male", 1),
	   (5, "Cao Anh Dao", "Female", 3),
	   (6, "Tran Kim Tuyen", "Male", 3);

INSERT INTO RESULT(STUDENT_ID, `SUBJECT`, SCORE)
VALUES (1, "Math", 8),
	   (2, "Literature", 7),
       (3, "History", 9.5),
       (4, "Math", 6.8),
       (5, "Literature", 4.9),
       (6, "History", 8.2);

SELECT * FROM STUDENT;
SELECT * FROM CLASS;
SELECT * FROM RESULT;

-- question 1: primary key of RESULT table are STUDENT_ID and SUBJECT




SELECT st.*
	FROM STUDENT st
    JOIN CLASS cl
      ON st.CLASS_ID = cl.ID;
    
