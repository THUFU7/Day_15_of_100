package Day_15
data class Fish(var name: String)
fun main(args: Array<String>){
    fishExample()
}

fun fishExample() {
    val fish = Fish("mungai")
    myWith(fish.name){
        println( capitalize())
    }
    println(fish.run { name })
    println(fish.apply {  })

    val fish2 = Fish(name = "mungai").apply { name = "Chalito" }
    println(fish2.name)

    println(fish.let { it.name.capitalize()}
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })
}
fun myWith(name: String, block: String.() -> Unit){
    name.block()
}

