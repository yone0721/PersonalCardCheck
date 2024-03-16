-- 正位置のタロット
SELECT ar.arcana_no,ar.arcana_name,ar.nomal_mean,pos.position_name
FROM fotune_table
JOIN arcana AS ar
ON ar.arcana_no = fotune_table.arcana_no
JOIN positions AS pos
ON pos.position_no = fotune_table.position_no
WHERE pos.position_no = 0 
ORDER BY ar.arcana_no ASC;

-- 逆位置のタロット
SELECT ar.arcana_no,ar.arcana_name,ar.reverse_mean,pos.position_name
FROM fotune_table
JOIN arcana AS ar
ON ar.arcana_no = fotune_table.arcana_no
JOIN positions AS pos
ON pos.position_no = fotune_table.position_no
WHERE pos.position_no = 1 
ORDER BY ar.arcana_no ASC;