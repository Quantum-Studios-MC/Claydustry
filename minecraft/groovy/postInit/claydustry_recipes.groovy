// Custom recipes for Claydustry

// Remove original recipes
crafting.remove('minecraft:crafting_table')
crafting.remove('minecraft:furnace')
crafting.remove('minecraft:chest')
crafting.remove('minecraft:trapped_chest')
crafting.remove('minecraft:dropper')
crafting.remove('minecraft:dispenser')

// Crafting table with 4 clay blocks
crafting.addShapeless(item('minecraft:crafting_table'), [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')])

// Furnace with clay and dense clay
crafting.addShaped(item('minecraft:furnace'), [
    [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')],
    [item('minecraft:clay'), null, item('minecraft:clay')],
    [ore('blockDenseClay'), ore('blockDenseClay'), ore('blockDenseClay')]
])

// Chest with clay blocks
crafting.addShaped(item('minecraft:chest'), [
    [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')],
    [item('minecraft:clay'), null, item('minecraft:clay')],
    [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')]
])

// Trapped chest with clay and dense clay
crafting.addShaped(item('minecraft:trapped_chest'), [
    [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')],
    [item('minecraft:clay'), ore('blockDenseClay'), item('minecraft:clay')],
    [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')]
])

// Dropper with clay in plus shape to avoid conflict with trapped chest
crafting.addShaped(item('minecraft:dropper'), [
    [null, item('minecraft:clay'), null],
    [item('minecraft:clay'), ore('blockDenseClay'), item('minecraft:clay')],
    [null, item('minecraft:clay'), null]
])

// Dispenser with clay and dense clay
crafting.addShaped(item('minecraft:dispenser'), [
    [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')],
    [item('minecraft:clay'), ore('blockDenseClay'), item('minecraft:clay')],
    [item('minecraft:clay'), ore('blockDenseClay'), item('minecraft:clay')]
])

// Water bucket with 8 clay and clay bucket
crafting.addShaped(item('claybucket:claybucket', 1), [
    [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')],
    [item('minecraft:clay'), item('claybucket:claybucket'), item('minecraft:clay')],
    [item('minecraft:clay'), item('minecraft:clay'), item('minecraft:clay')]
])

// Energised water bucket with 4 energised clay and clay bucket
crafting.addShaped(item('claybucket:claybucket', 2), [
    [item('clayium:clay_parts', 26), item('clayium:clay_parts', 26), null],
    [item('clayium:clay_parts', 26), item('claybucket:claybucket'), null],
    [item('clayium:clay_parts', 26), null, null]
])

crafting.addShaped(item('curvy_pipes:pipe', 0), [
    [item('clayium:meta_stick', 151)]
])

// Small Item Pipe
crafting.addShaped(item('curvy_pipes:pipe', 1), [
    [item('clayium:meta_stick', 151), item('clayium:meta_stick', 151)]
])

// Medium Item Pipe
crafting.addShaped(item('curvy_pipes:pipe', 2), [
    [item('clayium:meta_stick', 151), item('clayium:meta_stick', 151), item('clayium:meta_stick', 151)]
])

// Large Item Pipe
crafting.addShaped(item('curvy_pipes:pipe', 3), [
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)],
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)]
])

// Huge Item Pipe
crafting.addShaped(item('curvy_pipes:pipe', 4), [
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)],
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)]
])

// Tiny Fluid Pipe
crafting.addShaped(item('curvy_pipes:pipe', 5), [
    [item('clayium:meta_stick', 151)]
])

// Small Fluid Pipe
crafting.addShaped(item('curvy_pipes:pipe', 6), [
    [item('clayium:meta_stick', 151), item('clayium:meta_stick', 151)]
])

// Medium Fluid Pipe
crafting.addShaped(item('curvy_pipes:pipe', 7), [
    [item('clayium:meta_stick', 151), item('clayium:meta_stick', 151), item('clayium:meta_stick', 151)]
])

// Large Fluid Pipe
crafting.addShaped(item('curvy_pipes:pipe', 8), [
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)],
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)]
])

// Huge Fluid Pipe
crafting.addShaped(item('curvy_pipes:pipe', 9), [
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)],
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)]
])

// Tiny Energy Pipe
crafting.addShaped(item('curvy_pipes:pipe', 10), [
    [item('clayium:meta_stick', 151)]
])

// Small Energy Pipe
crafting.addShaped(item('curvy_pipes:pipe', 11), [
    [item('clayium:meta_stick', 151), item('clayium:meta_stick', 151)]
])

// Medium Energy Pipe
crafting.addShaped(item('curvy_pipes:pipe', 12), [
    [item('clayium:meta_stick', 151), item('clayium:meta_stick', 151), item('clayium:meta_stick', 151)]
])

// Large Energy Pipe
crafting.addShaped(item('curvy_pipes:pipe', 13), [
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)],
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)]
])

// Huge Energy Pipe
crafting.addShaped(item('curvy_pipes:pipe', 14), [
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)],
    [item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151), item('clayium:meta_short_stick', 151)]
])
