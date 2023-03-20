SELECT name,
age, dob
from gold.user u INNER JOIN
gold.user_private up on up.id
= u.id;
