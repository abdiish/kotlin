fun main(){

    val persona: Persona = Persona()
    persona.nombre = "Alan"
    persona.apellido = "Cortes"
    persona.darBienvenida()

}

class Persona(val nombre: String="", val apellido: String=""){

    fun darBienvenida(){
        
        println("Bienvenido $nombre $apellido")

    }
}