package galassini.tecnology.modulo_4.Ex

class Terceiro {
}
/*
Crie uma função calculadora que recebe doisinteirosdeparâmetro e um terceiro parâmetro do tipofunção.
Esta função de parâmetro deve receber dois inteiros de parâmetro e retornar um inteiro
Teste esta função passando dois inteiros e a função soma
Teste esta função passando os mesmos números inteiros do teste anterior mas passando a função multiplicação
desta vez
 */

/// Definindo a função soma
fun soma(numero1: Int, numero2: Int): Int {
    return numero1 + numero2
}

// Definindo a função multiplicação
fun multiplicacao(numero1: Int, numero2: Int): Int {
    return numero1 * numero2
}

// Definindo a função calculadora
fun calculadora(numero1: Int, numero2: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(numero1, numero2)
}

fun main() {
    // Testando a função calculadora com a função soma
    val resultadoSoma = calculadora(5, 3) { numero1, numero2 -> soma(numero1, numero2) }
    println("Resultado da soma: $resultadoSoma") // Deve imprimir "Resultado da soma: 8"

    // Testando a função calculadora com a função multiplicação
    val resultadoMultiplicacao = calculadora(5, 3) { numero1, numero2 -> multiplicacao(numero1, numero2) }
    println("Resultado da multiplicação: $resultadoMultiplicacao") // Deve imprimir "Resultado da multiplicação: 15"
}
