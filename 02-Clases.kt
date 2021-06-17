fun main(){

    //Se crea una instancia en Kotlin
    val persona: Persona = Persona("Alan", "Cortes")
    persona.darBienvenida()
}

// Se coloca private, para que el nombre y apellido sean accedidos unicamente por la clase Persona

class Persona(private val nombre: String, private val apellido: String){
    
    //Se crea un metodo en Kotlin
    fun darBienvenida(){

        println("Bienvenido $nombre $aplellio ")

    }
}