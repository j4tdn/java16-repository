-- Answer 1 s primary key of Result table is STUDENT_ID

-- Answer 2
-- 2. List name, gender and teacher name of all students.
SELECT S.NAME, GENDER, C.TEACHER
FROM STUDENT S JOIN CLASS C ON C.ID = S.CLASS_ID;

-- Answer 3
-- 3. List teacher name and number of all student in class 12C.
SELECT TEACHER, COUNT(S.ID) COUNT_STUDENT
FROM STUDENT S JOIN CLASS C ON S.CLASS_ID = C.ID
WHERE C.`NAME` = '12C'
GROUP BY C.TEACHER;

-- Answer 4
-- 4. List the class name and number of the students who have good at Math (score>=8) and good at Literature(score>=8
SELECT  C.NAME, S.NAME, COUNT(S.ID) COUNT_STUDENT
FROM STUDENT S JOIN CLASS C ON   S.CLASS_ID = C.ID
WHERE S.ID = (SELECT STUDENT_ID 
				FROM   RESULT
				WHERE SUBJECT IN ('Literature','Math') AND  SCORE >= 8)
GROUP BY C.NAME;


-- SELECT C.NAME, S.NAME
-- FROM CLASS C JOIN STUDENT S ON C.ID = S.CLASS_ID
-- JOIN RESULT R ON S.ID = R.STUDENT_ID
-- WHERE R.SUBJECT = 'Math' AND SCORE >= 8
-- UNION
-- SELECT C.NAME, S.NAME
-- FROM CLASS C JOIN STUDENT S ON C.ID = S.CLASS_ID
-- JOIN RESULT R ON S.ID = R.STUDENT_ID
-- WHERE R.SUBJECT = 'Literature' AND SCORE >= 8;


