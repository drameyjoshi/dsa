select ID,
  concat_ws(',',sort_array(collect_set(distinct product_setting_team.region))) regions, EVENT
from gold.product_setting_team
