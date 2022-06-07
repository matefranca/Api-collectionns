package dio.digitalinnovationone.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 3
    values[3] = 2
    values[4] = 6

    println("-----------------------------")
    for(valor in values) {
        println(valor)
    }

    println("-----------------------------")
    values.forEach {
        println(it)
    }

    println("-----------------------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("-----------------------------")
    values.sort()
    for (index in values.indices) {
        println(values[index])
    }

}