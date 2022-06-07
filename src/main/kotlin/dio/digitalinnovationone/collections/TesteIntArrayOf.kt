fun main(){
    val values = intArrayOf(2, 3, 4, 1, 10, 7) // Outra forma de criar array sem ter que se preocupar com o tamanho.

    values.forEach {
        println(it)
    }

    println("-------------------------")

    values.sort()
    values.forEach {
        println(it)
    }
}