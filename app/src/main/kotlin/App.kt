package com.carpree.app


 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val array1: Array<Array<Int>> = arrayOf(
        arrayOf(0, 1),
        arrayOf(0, 0),
        arrayOf(1, 1)
    )
    val array2: Array<Array<Int>> = arrayOf(
        arrayOf(1, 1),
        arrayOf(1, 1)
    )
     println(getHitProbability(2,3, array1))
     println(getHitProbability(2,2, array2))
}
fun getHitProbability(R: Int, C: Int, G: Array<Array<Int>>): Double {
    // Validate the input dimensions and grid
    if (R < 0 || C < 0 || G.isEmpty() || R > 100 || C > 100) {
        return 0.0
    }

    // Calculate the total number of grid cells
    val totalCombos = R * C
    var sum = 0

    // Iterate over the grid and count the number of 1s
    for (i in G.indices) {
        for (j in G[i].indices) {
            if (G[i][j] == 1) {
                sum += 1
            }
        }
    }

    // Calculate the hit probability
    val combosSum = (sum.toDouble() / totalCombos.toDouble())

    return combosSum
}
