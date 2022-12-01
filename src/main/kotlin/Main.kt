fun main (){
    val list = listOf(213423,34534,456767,823475,234,6243,743,6,834,64)

    list.filterSmaller().forEach { it-> println("$it") }
}

fun  List<Int>.filterSmaller(): List<Int>{
    return this.filter{it ->it <500}
}

