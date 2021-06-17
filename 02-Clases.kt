fun main(){

    //Se crea una instancia en Kotlin
    val persona: Persona = Persona("Alan", "Cortes")
    persona.darBienvenida()
}

class Persona(val nombre: String, val apellido: String){
    
    //Se crea un metodo en Kotlin
    fun darBienvenida(){

        println("Bienvenido $nombre $aplellio ")

    }
}