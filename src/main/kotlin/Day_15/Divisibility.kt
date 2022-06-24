package Day_15
//Create an extension on List using a higher order function that returns all the numbers in the list that are divisible by 3.
//Start by creating an extension function on List that takes an lambda on Int and applies it to each item in the list.
//When the lambda returns zero, include the item in the output.
fun main(){
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println(numbers.divisibleBy {it.rem(3)})
}
fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int>{
    val result = mutableListOf<Int>()
    for (item in this){
        if (block(item) == 0){
            result.add(item)
        }
    }
    return result
}