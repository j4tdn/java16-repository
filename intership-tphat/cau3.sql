-- 1. Mỗi quan hệ giữa các bảng Student và Result là 1-n
--  ANSWER 2
SELECT S.`NAME`, GENDER, C.`NAME`
FROM STUDENT S JOIN CLASS C ON S.CLASS_ID = C.ID;

-- ANSWER 3
SELECT TEACHER, COUNT(ID) `QUANTITY OF FEMALE STUDENT`
FROM STUDENT S JOIN CLASS C ON S.CLASS_ID = C.ID
WHERE C.`NAME` LIKE '12B' AND GENDER LIKE 'FEMALE';

-- ANSWER 4
SELECT S.`NAME`,SCORE 
FROM CLASS C JOIN STUDENT S ON S.CLASS_ID = C.ID JOIN CLASS JOIN RESULT R ON S.ID = R.STUDENT_ID
WHERE C.`NAME` LIKE '12B' AND `SUBJECT` LIKE 'HISTORY'
ORDER BY SCORE DESC