-- ANSWER 1
-- relationship between tables Student and Result is : 1 - n

-- ANSWER 2
SELECT ST.`NAME`, GENDER, CL.`NAME`
FROM STUDENT ST JOIN CLASS CL ON ST.CLASS_ID = CL.ID;

-- ANSWER 3
SELECT TEACHER, COUNT(ID) `NUMBER OF FEMALE STUDENT`
FROM STUDENT ST JOIN CLASS CL ON ST.CLASS_ID = CL.ID
WHERE CL.`NAME` LIKE '12B' AND GENDER LIKE 'FEMALE';

-- ANSWER 4
SELECT ST.`NAME`,SCORE 
FROM CLASS CL JOIN STUDENT ST ON ST.CLASS_ID = CL.ID JOIN CLASS JOIN RESULT RS ON ST.ID = RS.STUDENT_ID
WHERE CL.`NAME` LIKE '12B' AND `SUBJECT` LIKE 'HISTORY'
ORDER BY SCORE DESC