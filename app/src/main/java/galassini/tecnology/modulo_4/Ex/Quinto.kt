package galassini.tecnology.modulo_4.Ex

class Quinto {
}
/*
Crie uma lista de stringcom 4 nomes •Utilizando o operador mapconcatene a string"Olá " antes de cada nome
Percorra a lista modificada usando um forEache imprima todos os seus valores.
 */

fun main() {
    // Criando uma lista de strings com 4 nomes
    val nomes = listOf("Ana", "João", "Maria", "Pedro")

    // Usando o operador map para adicionar "Olá " antes de cada nome
    val saudacoes = nomes.map { "Olá $it" }

    // Percorrendo a lista modificada e imprimindo seus valores
    saudacoes.forEach { println(it) }
}
