CREATE DATABASE LESSON18_TvanNhan CHAR SET utf8mb4;
use LESSON18_TvanNhan;

CREATE TABLE `Student`(
	id int,
    `name` varchar(50),
    gender varchar(20),
    class_id int,
    PRIMARY KEY (id),
    constraint `FK_Class_Student` foreign key (class_id) references Class(id)
);

CREATE TABLE Result(
	student_id int,
    `subject` varchar(50),
    score float,
    constraint `FK_Result_Student` foreign key (student_id) references Student(id)
);

CREATE TABLE Class(
	id int,
    `name` varchar(100),
    teacher varchar(100),
    PRIMARY KEY (id)
);

select * from Class;
insert into Class(id, `name`, teacher)
values (1, '12A', 'He Cong Trung'),
		(2, '12B', 'Dang Tu Anh'),
        (3, '12C', 'Nguyen Van Tam');
        
select * from Student;
insert into Student(id, `name`, gender, class_id)
values (1, 'Dinh Thi Ngoc', 'Female', 2),
		(2, 'Nguyen Thanh Hung', 'Male', 1),
        (3, 'Tran Mai Hoa', 'Female', 2),
		(4, 'Doan Quang Vinh', 'Male', 1),
        (5, 'Cao Anh Dao', 'Female', 3),
		(6, 'Tran Kim Tuyen', 'Female', 3);
       
select * from Result;
insert into Result(student_id, `subject`, score)
values (1, 'Math', 8),
 (2, 'Literature', 7),
 (3, 'History', 9.5),
 (4, 'Math', 6.8),
 (5, 'Literature', 4.9),
 (6, 'History', 8.2);
 
 -- 2. list name ,gender  and teacher name of all students
 select st.`name`,
		st.gender,
        cl.teacher as `teacher name`
 from Student st join Class cl on st.class_id = cl.id;
 
 -- 3. List teacher name and number of all student  in class 12C
 select cl.teacher as `teacher name`,
		COUNT(st.id) as `number of all student`
 from Student st join Class cl on st.class_id = cl.id
 where st.class_id = 3;
 
 -- 4. List the Class name and number of the students who have good at Math(score >= 8) and good at Literature (score >= 8)
select cl.`name` as `class name`,
		COUNT(st.id) as `number of the students`
from Class cl join Student st on cl.id = st.class_id join Result re on re.student_id = st.id
where (re.`subject` like 'Math' or re.`subject` like 'Literature')  and re.score >= 8;
