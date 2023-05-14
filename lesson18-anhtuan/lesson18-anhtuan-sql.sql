1. Primary key is column student_id and subject
2. 	SELECT st.name, st.gender, class.teacher
	FROM student st
	JOIN class
	ON st.class_id = class.id;
3. 	SELECT class.teacher, count(*)
	FROM student st
	JOIN class
	ON st.class_id = class.id
	WHERE class.name ;
4.
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