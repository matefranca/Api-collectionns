fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    nomes.forEach { println(it) }

    println("----------------------")

    nomes.sort()
    nomes.forEach { println(it) }

    println("----------------------")

    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}