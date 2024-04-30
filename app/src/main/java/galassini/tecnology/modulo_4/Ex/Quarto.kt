package galassini.tecnology.modulo_4.Ex

class Quarto {
}

/*
Crie uma lista com os números inteiro de 1 a 99 •Utilizando esta lista crie um filtro que
retorna uma lista com os números pares contidos na lista original
 */

fun main() {
    // Criando uma lista vazia para armazenar os números inteiros
    val listaOriginal = mutableListOf<Int>()

    // Adicionando números inteiros de 1 a 99 à lista
    for (i in 1..99) {
        listaOriginal.add(i)
    }

    // Aplicando um filtro para obter os números pares
    val numerosPares = listaOriginal.filter { it % 2 == 0 }

    // Imprimindo a lista de números pares
    println("Números pares: $numerosPares")
}
