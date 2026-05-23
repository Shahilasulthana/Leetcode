# Write your MySQL query statement below
select
    s.student_id,
    s.student_name,
    SU.subject_name,
    count(E.student_id) attended_exams
from Students S
cross join Subjects SU
left join Examinations E 
    on s.student_id = E.student_id
    and SU.subject_name = E.subject_name
group by 
    s.student_id,
    s.student_name,
    SU.subject_name
order by
    s.student_id,
    s.student_name,
    SU.subject_name
;

