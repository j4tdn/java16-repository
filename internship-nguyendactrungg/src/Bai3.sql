1. 
	The relationship between tables Student and Class is n - 1
	
2.
	SELECT student.`name`, gender, class.`name` 
	FROM student JOIN class ON class_id = class.id

3. 
	SELECT teacher, COUNT(*) 
	FROM student JOIN class ON student.class_id = class.id
	WHERE gender = 'Male' AND class.`name` = '12A'
	GROUP BY class.id

4. 
	SELECT student.`name`, score
	FROM student JOIN result ON id = student_id
			 	JOIN class ON student.class_id = class.id
	AND class.`name` = '12B'