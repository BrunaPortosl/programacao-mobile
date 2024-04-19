// Arquivo: Ex04_Baralho.kt
//Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
// Crie uma classe Baralhoque represente um baralho de cartas completo.
// Implemente métodos para embaralhar o baralho, distribuir cartas.
// Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras, como:


// Classe que representa um baralho de cartas completo
class Baralho {
    // Array de naipes disponíveis no baralho
    private val naipes = arrayOf("♠️", "♥️", "♦️", "♣️")
    // Array de valores disponíveis para as cartas
    private val valores = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A")
    // Lista de cartas no baralho
    private val cartas = mutableListOf<Carta>()

    // Inicialização do baralho: cria todas as cartas e as adiciona ao baralho
    init {
        for (naipe in naipes) {
            for (valor in valores) {
                cartas.add(Carta(valor, naipe))
            }
        }
    }

    // Método para embaralhar o baralho
    fun embaralhar() {
        cartas.shuffle() // Embaralha a lista de cartas
    }

    // Método para distribuir cartas para um jogador
    fun distribuir(qtdCartas: Int): List<Carta> {
        val mao = mutableListOf<Carta>() // Cria uma lista para representar a mão do jogador
        for (i in 0 until qtdCartas) { // Itera sobre a quantidade de cartas desejada
            mao.add(cartas.removeAt(0)) // Remove a carta do topo do baralho e adiciona à mão do jogador
        }
        return mao // Retorna a mão do jogador
    }
}

//Declaração de Arrays para Naipes e Valores:Utilizamos arrays para representar os naipes e os valores das cartas do baralho.
//Esses arrays são usados para criar as cartas do baralho, combinando cada naipe com cada valor.

//Inicialização do Baralho:No bloco init, percorremos todos os naipes e valores para criar todas as cartas possíveis do baralho.
//Isso é feito usando dois loops for, um para os naipes e outro para os valores, criando assim todas as combinações possíveis.

//Método para Embaralhar o Baralho:O método embaralhar() embaralha as cartas do baralho, garantindo que elas estejam em uma ordem aleatória antes de serem distribuídas.
//Isso é feito usando a função shuffle() que embaralha a lista de cartas.

//Método para Distribuir Cartas:O método distribuir(qtdCartas: Int) distribui um número especificado de cartas do baralho.
//Ele cria uma lista para representar a mão do jogador e, em seguida, remove as cartas do topo do baralho e as adiciona à mão do jogador.
//Esse método é usado para dar cartas aos jogadores durante o jogo.

// a classe Baralho encapsula o conceito de um baralho de cartas completo e fornece funcionalidades para inicializar,embaralhar e distribuir cartas.
// Essas funcionalidades são essenciais para a implementação de um jogo de cartas e permitem interações fáceis com o baralho durante o jogo.