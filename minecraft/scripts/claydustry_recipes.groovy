// Custom recipes for Claydustry

// Crafting table with 4 clay blocks
crafting.addShapeless(item('minecraft:crafting_table'), [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')])

// Furnace with clay and dense clay
crafting.addShaped(item('minecraft:furnace'), [
    [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')],
    [item('minecraft:clay'), null, item('minecraft:clay')],
    [ore('blockDenseClay'), ore('blockDenseClay'), ore('blockDenseClay')]
])
