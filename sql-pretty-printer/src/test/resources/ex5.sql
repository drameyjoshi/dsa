select *
-- this is a comment
from
(with events as(select business_id,count(distinct user_id) unique_wallet_click from gold.mp_full_event) select * from events)
