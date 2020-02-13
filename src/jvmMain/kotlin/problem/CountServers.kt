package problem

class CountServers {
    fun countServers(grid: Array<IntArray>): Int {

        val totalServers = grid.sumBy { it.sumBy { it } }
        var totalUnlinkedServers = 0

        var rowHasAnyServers = BooleanArray(grid.size)
        var colHasAnyServers = BooleanArray(grid[0].size)

        var yBound = 0
        var xBound = 0
        var connectedComputers = 0

        for (y in 0..yBound) {
            for (x in 0..xBound) {
                if (grid[y][x] == 1) {
                    if (rowHasAnyServers[y] || colHasAnyServers[x]) {
                        connectedComputers++
                    }

                    rowHasAnyServers[y] = true
                    colHasAnyServers[x] = true
                }
            }
        }
    }
}