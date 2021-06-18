
fun main() {

    val a = 1
    val b = 2
    var max = a

    if(a < b) max = b

    println(max)

    //Uso de else
    var max: Int

    if(a > b) {
        max = a
    }else{
        max = b
    }

    //Version simplificada
    val max = if (a > b) a else b
    println(max)
}