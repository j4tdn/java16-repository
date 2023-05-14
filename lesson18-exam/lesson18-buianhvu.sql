CREATE TABLE Student (
    id INT(11) NOT NULL ,
    `name` VARCHAR(50) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    class_id INT(11) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (class_id) REFERENCES Class(id)
);

CREATE TABLE Result (
    id INT(11) NOT NULL,
    student_id INT(11) NOT NULL,
    `subject` VARCHAR(50) NOT NULL,
    score FLOAT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (student_id) REFERENCES Student(id)
);

Alter TABLE Result 
DROP COLUMN id;


CREATE TABLE Class (
    id INT(11) NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    teacher VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO Student (id, name, gender, class_id) VALUES
(1, 'John', 'Male', 1),
(2, 'Jane', 'Female', 2),
(3, 'Bob', 'Male', 1),
(4, 'Alice', 'Female', 2),
(5, 'Mike', 'Male', 3);

INSERT INTO Class (id, name, teacher) VALUES
(1, 'Math 101', 'Mr. Smith'),
(2, 'Physics 101', 'Ms. Johnson'),
(3, 'Chemistry 101', 'Dr. Lee');

INSERT INTO Result (id, student_id, subject, score) VALUES
(1, 1, 'Math', 8.5),
(2, 1, 'Physics', 9.0),
(3, 2, 'Math', 7.0),
(4, 2, 'Physics', 8.0),
(5, 3, 'Math', 6.5),
(6, 3, 'Physics', 7.5),
(7, 4, 'Math', 9.5),
(8, 4, 'Physics', 8.5),
(9, 5, 'Math', 8.0),
(10, 5, 'Physics', 7.0);

-- The PK of Result : student_id, subject.--

SELECT s.`name`, s.gender, c.teacher
FROM Student s
JOIN Class c ON s.class_id = c.id;

SELECT c.teacher, COUNT(*) as number_of_students
FROM Student s
INNER JOIN Class c ON s.class_id = c.id
WHERE c.name = 'Chemistry 101'
GROUP BY c.teacher;

SELECT c.name, COUNT(*) as number_of_students
FROM Student s
INNER JOIN Result r ON s.id = r.student_id
INNER JOIN Class c ON s.class_id = c.id
WHERE r.subject = 'Math' AND r.score >= 8 AND s.id IN 
    (SELECT s.id FROM Student s 
     INNER JOIN Result r ON s.id = r.student_id 
     WHERE r.subject = 'Physics' AND r.score >= 8)
GROUP BY c.name;