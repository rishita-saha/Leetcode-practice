# Write your MySQL query statement below
SELECT Employee.name,Bonus.bonus FROM Employee left join Bonus on Employee.empId = Bonus.empId where Bonus.bonus < 1000 or Bonus.bonus Is NULL;