// Arquivo: Ex01.kt
// Escreva um programa que leia um número entre 1 e 12 correspondendo a um mês do ano e imprima o nome desse mês.
// Utilize o comando when. Caso o valor seja fora deste intevalo, imprima uma mensagem de erro.

fun main() {
    // Solicita ao usuário que insira um número de 1 a 12
    println("Insira um número de 1 a 12 correspondente a um mês do ano:")
    val numeroMes = readln().toIntOrNull()// Lê a entrada do usuário e a converte para um Inteiro ou null se não for um número

    // Verifica se o número inserido está dentro do intervalo válido (1 a 12)
    if (numeroMes in 1..12) {
        // Usa o comando 'when' para imprimir o nome do mês correspondente
        val nomeMes = when (numeroMes) {
            1 -> "Janeiro"
            2 -> "Fevereiro"
            3 -> "Março"
            4 -> "Abril"
            5 -> "Maio"
            6 -> "Junho"
            7 -> "Julho"
            8 -> "Agosto"
            9 -> "Setembro"
            10 -> "Outubro"
            11 -> "Novembro"
            12 -> "Dezembro"
            else -> "Inválido" // Este caso nunca deve ocorrer, pois o número foi validado anteriormente
        }
        println("O mês correspondente ao número $numeroMes é $nomeMes.")// Imprime o nome do mês correspondente
    } else {
        // Se o número inserido estiver fora do intervalo válido, imprime uma mensagem de erro
        println("Número inválido. Por favor, insira um número entre 1 e 12.")
    }
}
// Ele solicita ao usuário que insira um número de 1 a 12 correspondente a um mês do ano.
// Em seguida, verifica se o número está dentro desse intervalo. Se estiver, usa o comando when para associar o número do
// mês ao nome do mês correspondente e imprime esse nome. Se estiver fora do intervalo, imprime uma mensagem de erro.
//
//Variável numeroMes:Esta variável armazenará o número do mês inserido pelo usuário. Ela é do tipo Int?,
// o que significa que pode conter um número inteiro ou null se a entrada do usuário não puder ser convertida para um número.

//Função readln().toIntOrNull():Esta função lê a entrada do usuário e tenta convertê-la para um número inteiro.
// Utilizamos .toIntOrNull() para lidar com casos em que a entrada do usuário não é um número válido, retornando null nesses casos.

//Estrutura condicional if (numeroMes in 1..12):Esta estrutura condicional verifica se o número inserido pelo
// usuário está dentro do intervalo válido de meses (de 1 a 12). Se estiver dentro desse intervalo, o código dentro do bloco if será executado.

//Expressão when:Utilizamos a expressão when para associar o número do mês inserido pelo usuário ao nome do mês correspondente.
// Isso é feito através de múltiplas ramificações, onde cada número é mapeado para o nome do mês correspondente.

//Variável nomeMes:Esta variável armazena o nome do mês correspondente ao número inserido pelo usuário. Ela é importante para exibir o nome do mês posteriormente.

//Instrução println("O mês correspondente ao número $numeroMes é $nomeMes."):Esta instrução imprime na tela o nome do mês correspondente ao número inserido pelo usuário.
// Isso fornece feedback ao usuário sobre qual mês foi selecionado.

//Instrução println("Número inválido. Por favor, insira um número entre 1 e 12."):Se o número inserido pelo usuário estiver fora do intervalo válido de meses,
// esta instrução imprime uma mensagem de erro, orientando o usuário a inserir um número entre 1 e 12.

//resumo cada parte do código foi utilizada para solicitar, validar e processar a entrada do usuário,
// e então fornecer uma saída correspondente de acordo com a entrada fornecida. Isso garante uma interação mais amigável e útil com o usuário.