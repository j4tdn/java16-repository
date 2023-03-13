-- Answer 1
-- Relationship between Student and Class is 1-n

-- Answer 2
SELECT s.name, s.gender, c.name class_name
FROM students s
JOIN classes c ON s.class_id = c.id;


-- Answer 3
SELECT t.name  teacher_name, COUNT(s.gender) AS male_student_count
FROM teachers
JOIN classes  c ON t.id = c.teacher_id
JOIN students  s ON c.id = s.class_id
WHERE s.gender = 'Male' AND c.name = '12A'
GROUP BY t.name;


-- Answer 4
SELECT s.name, sc.score
FROM students  s
JOIN scores  sc ON s.id = sc.student_id
JOIN classes  c ON s.class_id = c.id
WHERE c.name = '12B';