select ID,
  concat_ws(',',sort_array(collect_set(distinct product_setting_team.region))) regions, EVENT
from gold.product_setting_team
        where
            team.team_state in (
                {{team_state}}
        )
        and case
            when '{{Enabled only}}' = 'False' then (
                product_setting_team.team_id is not null
        )
        else (
            u.is_enabled = '{{Enabled only}}'
    )
    
end and case
    when {{region}} = 'All' then (
        product_setting_team.region is not null
)
else (
    product_setting_team.region in (
        {{region}}
)

)

end 
