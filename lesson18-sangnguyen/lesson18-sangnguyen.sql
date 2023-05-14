-- ----------- DDL ----------- --								
CREATE SCHEMA SCHOOL;
USE SCHOOL;
CREATE TABLE STUDENT (
    ID	 		INT 		NOT NULL PRIMARY KEY,
	`NAME` 		VARCHAR(50) NOT NULL,
    GENDER		VARCHAR(50),
	CLASS_ID	INT			NOT NULL
);

CREATE TABLE CLASS (
	ID			INT			NOT NULL PRIMARY KEY,
    `NAME`		VARCHAR(50)	NOT NULL,
    TEACHER		VARCHAR(50)	NOT NULL
);

CREATE TABLE RESULT (
	STUDENT_ID	INT			NOT NULL,
    `SUBJECT`	VARCHAR(50)	NOT	NULL,
    SCORE		FLOAT		NOT NULL			
);

ALTER TABLE STUDENT 
ADD CONSTRAINT FK_STUDENT_CLASS
FOREIGN KEY (CLASS_ID)
REFERENCES CLASS(ID);

ALTER TABLE RESULT 
ADD CONSTRAINT FK_RESULT_STUDENT
FOREIGN KEY (STUDENT_ID)
REFERENCES STUDENT(ID);

ALTER TABLE RESULT
ADD CONSTRAINT PK_RESULT
PRIMARY KEY (STUDENT_ID, `SUBJECT`);

-- -------------- DML -------------- --

INSERT INTO CLASS (ID, `NAME`, TEACHER)
VALUES	(1, "12A", "Ho Cong Trung"),
		(2, "12B", "Dang Tu Anh"),
        (3, "12C", "Nguyen Van Tam");

INSERT INTO STUDENT (ID, `NAME`, GENDER, CLASS_ID) 
VALUES 	(1,	 "Dinh Thi Ngoc", 		"Female", 	2),
		(2,	 "Nguyen Thanh Hung",	"Male", 	1),
        (3,	 "Tran Mai Hoa", 		"Female", 	2),
        (4,	 "Doan Quang Vinh",		"Male", 	1),
        (5,	 "Cao Anh Dao", 		"Female", 	3),
        (6,	 "Tran Kim Tuyen", 		"Male", 	3);
        
INSERT INTO RESULT	(STUDENT_ID, `SUBJECT`, SCORE)
VALUES	(1, "Math", 8),
		(2, "Literature", 7),
        (3, "History", 9.5),
        (4, "Math", 6.8),
        (5, "Literature", 4.9),
        (6, "History", 8.2),
        (3, "Math", 9.8),
        (1, "Literature", 8.2),
        (4, "History", 8.8);
        
-- ---------- Answer Question 1 ------------ --
-- Khoá chính của bảng RESULT là 2 cột STUDENT_ID và SUBJECT --

-- ---------- Write 3 Questions ------------ --
-- 1 --
SELECT 	st.`NAME`, 
		st.GENDER,
        cl.TEACHER
  FROM STUDENT st
  JOIN CLASS cl
	ON st.CLASS_ID = cl.id;

-- 2 --
SElECT 	cl.TEACHER,
		cl.`NAME`,
        st.ID
  FROM CLASS cl
  JOIN STUDENT st
    ON cl.ID = st.CLASS_ID
 WHERE cl.`NAME` = "12C";
 
 -- 3 --
 SELECT	rs.`SUBJECT`,
		rs.STUDENT_ID,
        cl.`NAME` AS 'CLASS NAME'
   FROM RESULT rs
   JOIN STUDENT st
     ON rs.STUDENT_ID = st.ID
   JOIN CLASS cl
     ON st.CLASS_ID = cl.id
  WHERE (rs.`SUBJECT` = 'Math' OR rs.`SUBJECT` = 'Literature') AND (rs.SCORE >= 8);	

