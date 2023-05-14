create database lesson18_tthinh char set utf8mb4;
use lesson18_tthinh;

CREATE TABLE Class (
	id INT NOT NULL PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    teacher VARCHAR(255) NOT NULL
);

CREATE TABLE Student (
	id INT NOT NULL PRIMARY KEY,
	`name` VARCHAR(255) NOT NULL,
	gender VARCHAR(10) NOT NULL,
    class_id INT NOT NULL,
    CONSTRAINT FK_Student_Class FOREIGN KEY (class_id) REFERENCES Class(id)
);

CREATE TABLE Result (
    student_id INT NOT NULL,
    `subject` VARCHAR(255) NOT NULL,
    score DOUBLE NOT NULL,
    CONSTRAINT FK_Student_Result FOREIGN KEY (student_id) REFERENCES Student(id)
);

INSERT INTO Class(id, name, teacher) VALUES ('1', '12A', 'Ho Cong Trung');
INSERT INTO Class(id, name, teacher) VALUES ('2', '12B', 'Dang Tu Anh');
INSERT INTO Class(id, name, teacher) VALUES ('3', '12C', 'Nguyen Van Tam');

INSERT INTO Student(id, name, gender, class_id) VALUES (1, 'Dinh Thi Ngoc', 'Female', 2);
INSERT INTO Student(id, name, gender, class_id) VALUES (2, 'Nguyen Thanh Hung', 'Male', 1); 
INSERT INTO Student(id, name, gender, class_id) VALUES (3, 'Tran Mai Hoa', 'Female', 2); 
INSERT INTO Student(id, name, gender, class_id) VALUES (4, 'Doan Quang Vinh', 'Male', 1); 
INSERT INTO Student(id, name, gender, class_id) VALUES (5, 'Cao Anh Dao', 'Female', 3); 
INSERT INTO Student(id, name, gender, class_id) VALUES (6, 'Tran Kim Tuyen', 'Male', 3); 

INSERT INTO Result(student_id, subject, score) VALUES(1, 'Math', 8);
INSERT INTO Result(student_id, subject, score) VALUES(2, 'Literature', 7);
INSERT INTO Result(student_id, subject, score) VALUES(3, 'History', 9.5);
INSERT INTO Result(student_id, subject, score) VALUES(4, 'Math', 6.8);
INSERT INTO Result(student_id, subject, score) VALUES(5, 'Literature', 4.9);
INSERT INTO Result(student_id, subject, score) VALUES(6, 'History', 8.2);
INSERT INTO Result(student_id, subject, score) VALUES(6, 'Math', 9.8);
INSERT INTO Result(student_id, subject, score) VALUES(6, 'Literature', 7.2);
INSERT INTO Result(student_id, subject, score) VALUES(6, 'History', 8.8);
INSERT INTO Result(student_id, subject, score) VALUES(6, 'Math', 8.8);
-- Cau 1
-- Student_id and subject
-- Cau 2
SELECT st.`name`,
	   st.gender,
       cl.teacher
  FROM Student st
  JOIN Class cl
    ON st.class_id = cl.id;

-- Cau 3
SELECT cl.teacher,
	   COUNT(*) AS num_students
	FROM Class cl
	JOIN Student st
	  ON cl.id = st.class_id 
WHERE cl.`name` LIKE '%12C%'
GROUP BY cl.teacher;
        