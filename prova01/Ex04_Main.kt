// Arquivo: Ex04_Main.kt
//Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
// Crie uma classe Baralhoque represente um baralho de cartas completo.
// Implemente métodos para embaralhar o baralho, distribuir cartas.
// Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras, como:

// Main.kt
fun main() {
    // Criando um novo baralho
    val baralho = Baralho()
    // Embaralhando as cartas do baralho
    baralho.embaralhar()

    // Criando um novo jogador com o nome "Jogador 1"
    val jogador = Jogador("Jogador 1")
    // Distribuindo 5 cartas para o jogador
    jogador.mao.add(Carta(naipe = "♥️", valor = "2"))
    jogador.mao.add(Carta(naipe = "♥️", valor = "3"))
    jogador.mao.add(Carta(naipe = "♥️", valor = "4"))
    jogador.mao.add(Carta(naipe = "♥️", valor = "5"))
    jogador.mao.add(Carta(naipe = "♥️", valor = "6"))
    //val cartasDoJogador = baralho.distribuir(5)
    // Recebendo as cartas distribuídas pelo baralho
    //jogador.receberCartas(cartasDoJogador)

    // Exibindo a mão atual do jogador
    jogador.mostrarMao()

    // Verificando as combinações de cartas na mão do jogador
    println("Combinações:")
    // Verificando se há um par na mão do jogador
    if (jogador.temPar()) {
        println("Par encontrado!")
    } else {
        println("Nenhum Par encontrado.")
    }
    // Verificando se há uma trinca na mão do jogador
    if (jogador.temTrinca()) {
        println("Trinca encontrada!")
    } else {
        println("Nenhuma trinca encontrada.")
    }
    // Verificando se há um Full House na mão do jogador
    if (jogador.temFullHouse()) {
        println("Full House encontrado!")
    } else {
        println("Nenhum Full House encontrado.")
    }
    // Verificando se há um Flush na mão do jogador
    if (jogador.temFlush()) {
        println("Flush encontrado!")
    } else {
        println("Nenhum Flush encontrado.")
    }
}

//Essa função main() cria um baralho, embaralha as cartas, distribui 5 cartas para um jogador,
// verifica as combinações de cartas na mão do jogador (par, trinca, full house, flush) e imprime o resultado.