select t1.company_code, t1.founder, count(distinct(t2.lead_manager_code)), count(distinct(t3.senior_manager_code)), count(distinct(t4.manager_code)), count(distinct(t5.employee_code))
from Company t1
join Lead_Manager t2
on t1.company_code = t2.company_code
join Senior_Manager t3
on t2.lead_manager_code = t3.lead_manager_code
join Manager t4
on t3.senior_manager_code = t4.senior_manager_code
join Employee t5
on t4.manager_code = t5.manager_code
group by t1.company_code, t1.founder
order by t1.company_code;