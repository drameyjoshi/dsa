select id,
  concat_ws(',',sort_array(collect_set(distinct product_setting_team.region))) regions, event
from gold.product_setting_team
