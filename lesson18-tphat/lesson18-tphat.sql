create database lesson18_tphat;
use lesson18_tphat;

create table Class(
	id int primary key,
    `name` varchar(50) not null,
    teacher varchar(50) not null
);

create table Student(
	id int,
    `name` varchar(50) not null,
    gender varchar(50) not null,
    class_id int,
    constraint pk_student primary key(id),
    constraint fK_student_class  foreign key (class_id) references Class(id)
);

create table Result(
	student_id int,
	`subject` varchar(50),
	score float,
    constraint fk_result_student foreign key (student_id) references Student(id)
);

select * from Class;
select * from Student;
select * from Result;

insert into Class(id, `name`, teacher)
values (1, '12A', 'He Cong Trung'),
		(2, '12B', 'Dang Tu Anh'),
        (3, '12C', 'Nguyen Van Tam');
        
insert into Student(id, `name`, gender, class_id)
values (1, 'Dinh Thi Ngoc', 'Female', 2),
		(2, 'Nguyen Thanh Hung', 'Male', 1),
        (3, 'Tran Mai Hoa', 'Female', 2),
		(4, 'Doan Quang Vinh', 'Male', 1),
        (5, 'Cao Anh Dao', 'Female', 3),
		(6, 'Tran Kim Tuyen', 'Female', 3);
        
insert into Result(student_id, `subject`, score)
values (1, 'Math', 8),
 (2, 'Literature', 7),
 (3, 'History', 9.5),
 (4, 'Math', 6.8),
 (5, 'Literature', 4.9),
 (6, 'History', 8.2);


-- cau 1
select s.`name`, s.gender, c.teacher 
	from student s
    join class c
		on s.class_id = c.id;

-- cau 2
select c.teacher,  count(s.id) number_of_students
	from class c
    join student s
		on c.id = s.class_id
where c.`name` = '12C';

-- cau 3
select c.`name`,
	   COUNT(s.id) number_of_students
	from student s
	join class c
		on s.class_id = c.id
	join result r
		on s.id = r.student_id
where (r.`subject` = 'Math' OR r.`subject` = 'Literature') AND (r.score >= 8);