select Wands.id, Wands_Property.age, Wands.coins_needed, Wands.power
from Wands
join Wands_Property
on Wands.code = Wands_Property.code
join (select Wands_Property.age, Wands_Property.code, min(Wands.coins_needed) mini, Wands.power
from Wands
join Wands_Property
on Wands.code = Wands_Property.code
where Wands_Property.is_evil = 0
group by Wands_Property.age, Wands_Property.code, Wands.power) t
on Wands_Property.age = t.age
and Wands_Property.code = t.code
and Wands.coins_needed = t.mini
and Wands.power = t.power
order by Wands.power desc, Wands_Property.age desc;
