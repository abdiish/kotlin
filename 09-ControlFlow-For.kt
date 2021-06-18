fun main() {

    //Se pueden agregar nuevos elemntos o eliminar
    var listaMutable = mutableListOf<String>("Gaston", "Agustin", "Pedro", "Federico")

    //Solo se pueden realizar operaciones con los datos de la lista
    var listaInmutable = listOf<String>("Auto","Moto", "Bicicleta")

    for(nombre in listaMutable ) {

        println(nombre)
    }

    //Para saber el indice
    for((index, value) in listaMutable.withIndex()) {

        println("Nombre: $value con indice: $index")
    }

    listaInmutable.forEach{ elementos->

        println(elementos)

    }

    listaMutable.forEachIndexed { index, elemento->

        println("Elemento: $elemento con indice $index")
    }
}