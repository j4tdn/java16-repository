-- Answer 1
Relationship between Student and Class is 1-n

-- Answer 2
SELECT `NAME,
       GENDER,
       CLASS_NAME
   FROM STUDENT std
   JOIN CLASS cls
   ON std.CLASS_ID = cls.ID;

-- Answer 3
SELECT TEACHER,
       CASE GENDER 
       WHEN 'Female' THEN COUNT(GENDER) AS NUMBER OF FEMAIL STUDENTS
   FROM STUDENT std
   JOIN CLASS cls
   ON std.CLASS_ID = cls.ID
   WHERE `NAME` = '12B';

-- Answer 4
SELECT std.`NAME`,
       CASE rs.SUBJECT
       WHEN 'History' AS SUBJECT
   FROM STUDENT std
   JOIN CLASS cls
   ON std.CLASS_ID = cls.ID
   JOIN RESULT rs
   ON std.ID = rs.STUDENT.ID
   WHERE cls.NAME = "12C"
   ORDER BY rs.SCORE DESC;
       