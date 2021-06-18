
fun main() {

    //Acceder a las constantes 
    val dia = DIAS.LUNES.numero
    println(dia)

}


enum class DIAS(val numero: Int) {

    //Constantes
    LUNES(1),
    MARTES(2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7)

}