fun main(){
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findById(joao.nome))

    println("-----------------------")

    println(repositorio.findAll().forEach{ println(it) })

    println("-----------------------")

    repositorio.remove(maria.nome)
    println(repositorio.findAll().forEach{ println(it) })
}