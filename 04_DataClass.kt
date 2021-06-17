fun main(){

    val usuario = User("Alan", 32)
    val usuario2 = usuario.copy(edad = 20)
    println(usuario.toString())
    println("Son iguales: ${usuario == usuario2}") //Devuelve un false

}

data class User( val nombre: String, val edad: Int) {
    
}