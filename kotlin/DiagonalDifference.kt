import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*
import kotlin.math.absoluteValue

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */ 

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var a= 0
    var b =0 
    var x = 0
    var y = arr.size-1
    
    for (i in arr.indices){
        for(j in arr.indices){
            if(i == j){
                a += arr[i][j] 
            }
            if(x>=0 && x<arr.size){
                b+= arr[x][y]
            }
            x++
            y--
        }
    }
    val sum = a-b
    return sum.absoluteValue
    
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
