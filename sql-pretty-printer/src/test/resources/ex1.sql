SELECT name,
age, dob
FROM gold.user u inner join
gold.user_private up on up.id
= u.id;
