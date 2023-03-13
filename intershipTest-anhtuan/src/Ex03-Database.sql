-- Answer 1:
Relationship between Student and Class is 1 - n
-- Answer 2:
select Student.name as name, 
Student.gender as gender, 
Class.name as class name from Student JOIN Class ON Student.classid = Class.id;
-- Answer 3
SELECT Class.teacher,COUNT(Student.id) as "number of female student" 
FROM Student 
JOIN Class ON Student.classid = Class.id
WHERE Student.gender = "female" AND Student.classid = (SELECT ID FROM Class WHERE Class.name = "12B")
GROUP BY Class.ID;

-- Answer 4
SELECT Student.name, Result.score as History scores
FROM Result
WHERE Result.subject = "History"
JOIN Student ON Student.id = Result.studentid
HAVING Student.classid = (SELECT ID FROM Class WHERE Class.name = "12C")
ORDER BY Result.score DESC;