select Submissions.hacker_id, Hackers.name
from Submissions
join Hackers
on Submissions.hacker_id = Hackers.hacker_id
join Challenges
on Submissions.challenge_id = Challenges.challenge_id
join Difficulty
on Difficulty.difficulty_level = Challenges.difficulty_level
where Difficulty.score = Submissions.score
group by Submissions.hacker_id, Hackers.name
having count(Submissions.challenge_id) > 1
order by count(Submissions.challenge_id) desc, Submissions.hacker_id;