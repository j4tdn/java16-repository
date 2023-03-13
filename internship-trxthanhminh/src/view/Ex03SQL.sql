-- Answer 1
-- Relation ship between Student and Result is 1-n

-- Answer 2
SELECT st.name,
	   gender,
	   cl.name
	FROM Student st
	JOIN Class cl 
	ON st.class_id = cl.id;
	
-- Answer 3 
WITH number_of_student AS (SELECT *,
	   count(id) number
	FROM Student
	WHERE gender = 'Female';
);
	
SELECT cl.teacher,
	FROM number_of_student nbos
	JOIN Class cl
	ON nbos.class_id = cl.id
	WHERE cl.id = 2;

-- Answer 4
SELECT  st.*,
	    r.*
	FROM Student st
	JOIN Result r
	ON st.id = r.student_id
	WHERE st.class_id = 3
	AND r.subject = 'History'
	ORDER BY r.score DESC;
