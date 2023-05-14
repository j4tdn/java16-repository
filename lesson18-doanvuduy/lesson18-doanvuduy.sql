CREATE DATABASE java16_class_test CHAR SET utf8mb4;
USE java16_class_test;

CREATE TABLE class (
	id INT PRIMARY KEY,
    name VARCHAR(200) ,
    teacher VARCHAR(200)
    
);
CREATE TABLE student (
	id INT PRIMARY KEY,
    name VARCHAR(200) ,
    gender VARCHAR(200),
    class_id INT,
    CONSTRAINT FK_student_class FOREIGN KEY (class_id) REFERENCES class(id) 
);
CREATE TABLE result (
	student_id int ,
    subject VARCHAR(200),
    score double,
    CONSTRAINT PK_CTDH PRIMARY KEY (student_id,subject),
    CONSTRAINT FK_student_result FOREIGN KEY (student_id) REFERENCES student(id) 
);
INSERT INTO class(id,name,teacher) values(1,"12A","Ho Cong Tung ");
INSERT INTO class(id,name,teacher) values(2,"12B","Dang Tu Anh ");
INSERT INTO class(id,name,teacher) values(3,"12C","Nguyen Van Tam");

INSERT INTO student(id,name,gender,class_id) values (1, "Dinh Thi Ngoc", "Female",2);
INSERT INTO student(id,name,gender,class_id) values (2, "Nguyen Thanh Hung", "Male",1);
INSERT INTO student(id,name,gender,class_id) values (3, "tran mai hoa", "Female",2);
INSERT INTO student(id,name,gender,class_id) values (4, "Doan Quang Vinh", "Female",1);
INSERT INTO student(id,name,gender,class_id) values (5, "Cao Anh Dao", "Male",3);
INSERT INTO student(id,name,gender,class_id) values (6, "Tran Anh Tuyen", "Female",3);

INSERT INTO result(student_id,subject, score) values (1,"Math",8);
INSERT INTO result(student_id,subject, score) values (2,"Literature",7);
INSERT INTO result(student_id,subject, score) values (3,"History",9.5);
INSERT INTO result(student_id,subject, score) values (4,"Math",6.8);
INSERT INTO result(student_id,subject, score) values (5,"Literature",4.9);
INSERT INTO result(student_id,subject, score) values (6,"History",8.2);
INSERT INTO result(student_id,subject, score) values (6,"Math",9);
INSERT INTO result(student_id,subject, score) values (6,"Literature",7.2);


SELECT * from result;

-- question 1
-- Primary key of result table is student_id and subject

-- question 2
SELECT st.name, st.gender, class.teacher
FROM student st
JOIN class
ON st.class_id = class.id;

-- question 3
SELECT class.teacher, count(*)
FROM student st
JOIN class
ON st.class_id = class.id
WHERE class.name LIKE "%12C%";
-- question 4
SELECT *
FROM student st
JOIN class
ON st.class_id = class.id
JOIN result
ON st.id = result.student_id
WHERE ( result.subject LIKE "%Math%" AND result.score >= 8 )
UNION
SELECT *
FROM student st
JOIN class
ON st.class_id = class.id
JOIN result
ON st.id = result.student_id
WHERE ( result.subject LIKE "%Literature%" AND result.score >= 8 );











-- temp
SELECT class.teacher, count(*)
FROM student st
JOIN class
ON st.class_id = class.id
GROUP BY class.id;

WITH studentInfo AS (
SELECT student.*, avg(result.score) avg
FROM student
JOIN result
ON student.id = result.student_id
GROUP BY student.id),
 pointInfo AS (
SELECT class.id, class.name, max(avg) avg
FROM studentInfo si
JOIN class
ON si.class_id = class.id
GROUP BY class.id
)
SELECT pi.id, pi.name , si.name, si.avg
FROM studentInfo si
JOIN pointInfo pi
ON si.avg = pi.avg;