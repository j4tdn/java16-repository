create database student_class_management;
use student_class_management;


-- 1. PK of Result is student_id and subject
create table class(
	id int primary key,
    `name` nvarchar(255),
    teacher nvarchar(255)
);

create table student(
	id int PRIMARY KEY,
    `name` nvarchar(255),
    gender varchar(6),
    class_id int,
    CONSTRAINT FK_STUDENT_CLASS FOREIGN KEY(class_id) REFERENCES class(id)
);

create table result(
	student_id int,
    `subject` varchar(255),
    score int,
    primary key(student_id, `subject`)
);

insert into class
values(1, 'c1', 'teacher1'), (2, 'c2', 'teacher2'), (3, 'c3', 'teacher3'),(4, 'c4', 'teacher4');

insert into student 
values (1, 'jasmine', 'female', 1), (2, 'bill', 'male', 2), (3, 'helen', 'female', 2), (4, 'john', 'male', 1) ;

insert into result 
values (1, 'math', 8), (1,'lit', 9),(1, 'history' , 5),  
 (2, 'math', 7),(2, 'lit', 7),(2, 'history', 9),
 (3, 'math', 10), (3, 'lit', 4), (3, 'history', 7),
 (4, 'math', 6), (4, 'lit', 10),(4, 'history', 6);
 
 
 
 -- Question 2:
 -- 3.
 select s.`name`, s.gender, c.teacher
 from student s
 join class c
 on s.class_id=c.id;
 
 
 -- 3.
 select c.teacher, count(*) number_of_students
 from class c 
 join student s
 on s.class_id=c.id
 where c.`name`='c1' -- c1 instead of 12C1
 group by c.id;
 
 -- 4.
 select student_id
 from result r
 where r.`subject`='math' and r.score >=8 
	and exists(
		select *
        from result r2
        where r2.student_id = r.student_id
			and r2.`subject`='lit' and r2.score >=8 
    );
    

select *
from student s
where s.id in (
	select student_id
	 from result r
	 where r.`subject`='math' and r.score >=8 
		and exists(
			select *
			from result r2
			where r2.student_id = r.student_id
				and r2.`subject`='lit' and r2.score >=8 
    )
);
 
 
 
