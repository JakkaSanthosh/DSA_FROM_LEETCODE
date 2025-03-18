# Write your MySQL query statement below
select w1.id as Id from weather w1,weather w2 where timestampdiff(day,w2.recordDate,w1.recordDate)=1 and w1.temperature>w2.temperature;