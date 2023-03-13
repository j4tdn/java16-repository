-- Answer 1
Relationship between Student and Class is n-1

-- Answer 2
SELECT std.NAME, std.GENDER, cl.NAME
FROM STUDENT std
JOIN CLASS cl
ON std.CLASS_ID = cl.ID;

-- Answer 3
SELECT cl.TEACHER, COUNT(std.ID)
FROM STUDENT std
JOIN CLASS cl
ON std.CLASS_ID = cl.ID
WHERE std.GENDER = "Male" AND cl.NAME = "12A";

-- Answer 4
SELECT std.NAME, sum(rs.SCORE)
FROM RESULT rs
JOIN STUDENT std
ON rs.STUDENT_ID = std.ID
GROUP BY rs.STUDENT_ID;
