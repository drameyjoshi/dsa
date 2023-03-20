select first_name, last_name, age, title 
from gold.user u inner join (select uuid, title from gold.department) d on 
d.uuid = u.uuid;
