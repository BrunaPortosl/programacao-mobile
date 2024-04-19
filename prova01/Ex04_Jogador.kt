// Arquivo: Ex04_Jogador.kt
//Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
// Crie uma classe Baralhoque represente um baralho de cartas completo.
// Implemente métodos para embaralhar o baralho, distribuir cartas.
// Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras, como:
// Classe Jogador que representa um jogador do jogo
// Classe Jogador que representa um jogador do jogo
class Jogador(val nome: String) {
    // Lista de cartas na mão do jogador
     val mao = mutableListOf<Carta>()

    // Array de valores das cartas
    private val valores = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A")

    // Método para receber cartas e adicionar à mão do jogador
    fun receberCartas(cartas: List<Carta>) {
        mao.addAll(cartas)
    }

    // Verificar se há um par na mão do jogador
    fun temPar(): Boolean {
        // Usando um método auxiliar para verificar se há um par na mão do jogador
        return temCombinacao { carta -> mao.count { it.valor == carta.valor } == 2 }
    }

    // Verificar se há uma trinca na mão do jogador
    fun temTrinca(): Boolean {
        // Contando quantas vezes cada valor de carta aparece na mão do jogador e verificando se algum valor tem contagem igual a 3
        val contagemValores = mao.groupingBy { it.valor }.eachCount()
        return contagemValores.any { it.value == 3 }
    }

    // Verificar se há um full house na mão do jogador
    fun temFullHouse(): Boolean {
        // Usando um método auxiliar para verificar se há um full house na mão do jogador
        return temCombinacao { carta -> mao.count { it.valor == carta.valor } in setOf(2, 3) }
    }

    // Verificar se há um flush na mão do jogador
    fun temFlush(): Boolean {
        // Verificando se todas as cartas na mão do jogador têm o mesmo naipe
        val naipesDistintos = mao.map { it.naipe }.distinct()
        return naipesDistintos.size == 1
    }

    // Método auxiliar para verificar combinações na mão do jogador
    private fun temCombinacao(condition: (Carta) -> Boolean): Boolean {
        // Verificando se alguma carta na mão do jogador satisfaz uma condição específica
        return valores.any { valor -> condition(Carta(valor, "")) }
    }

    // Método para imprimir a mão do jogador
    fun mostrarMao() {
        // Imprimindo as cartas na mão do jogador
        println("$nome tem as seguintes cartas na mão:")
        mao.forEach { println("${it.valor}${it.naipe}") }
    }
}
//Classe Jogador:Essa classe representa um jogador do jogo.O jogador tem uma lista de cartas na mão, representada pela propriedade mao.
//O jogador também tem um nome, representado pela propriedade nome.

//Array de Valores: Um array chamado valores é criado para representar os valores possíveis das cartas (de 2 a A).
//Este array é utilizado para verificar a presença de determinadas combinações de cartas na mão do jogador.

//Método receberCartas(cartas: List<Carta>): Este método recebe uma lista de cartas e adiciona todas elas à mão do jogador.

//Métodos para Verificar Combinações:
//temPar:Verifica se há um par na mão do jogador. Isso é feito contando quantas vezes cada valor de carta aparece na mão do jogador.
//temTrinca:Verifica se há uma trinca na mão do jogador. Isso é feito contando quantas vezes cada valor de carta aparece na mão do jogador e verificando se algum valor tem contagem igual a 3.
//temFullHouse:Verifica se há um full house na mão do jogador. Isso é feito verificando se há um par e uma trinca na mão do jogador.
//temFlush:Verifica se há um flush na mão do jogador. Isso é feito verificando se todas as cartas na mão do jogador têm o mesmo naipe.

//Método Auxiliar temCombinacao(condition: (Carta) -> Boolean): Este método é um método auxiliar usado para verificar se há uma combinação específica na mão do jogador.
//Ele recebe uma função de condição como parâmetro e verifica se alguma carta na mão do jogador satisfaz essa condição.

//Método mostrarMao:Este método imprime as cartas na mão do jogador, juntamente com o seu nome.

//resumo de tudo: o código implementa a lógica para verificar várias combinações de cartas na mão de um jogador,
// como pares, trincas, full houses e flushes. Isso é feito usando métodos que contam as ocorrências de determinados valores de cartas e naipes na mão do jogador,
// e então verificam se essas ocorrências correspondem às combinações desejadas. O array de valores é usado como uma referência para os valores possíveis das cartas,
// e os métodos são projetados para serem reutilizáveis e modulares.