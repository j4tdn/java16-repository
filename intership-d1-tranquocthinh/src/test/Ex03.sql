-- Answer 1: 1 - N
-- Answer 2:
-- List name, gender and class name of all students.
   SELECT NAME_STUDENT, GENDER, NAME_CLASS
		FROM STUDENT S JOIN CLASS C
		ON S.ID = C.ID;
		
-- Answer 3: List teacher name and number of male student in class 12A.
	SELECT TEACHER,
	   COUNT(GENDER)
	FROM CLASS C
	  JOIN STUDENT S
	    ON C.ID = S.ID
	WHERE `NAME` = '12A'
	AND GENDER = 'MALE';

-- Answer 4: List name and score of the students in class 12B.
	SELECT NAME_STUDENT, SCORE
		FROM STUDENT S JOIN RESULT R
			ON S.ID = R.ID
		JOIN CLASS C
			ON S.ID = C.ID
		WHERE `NAME` = '12B';
		
		
