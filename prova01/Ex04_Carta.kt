// Arquivo: Ex04_Carta.kt
//Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
// Crie uma classe Baralhoque represente um baralho de cartas completo.
// Implemente métodos para embaralhar o baralho, distribuir cartas.
// Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras, como:


// Classe Carta que representa uma carta de baralho
data class Carta(val valor: String, val naipe: String)

//data class Carta(val valor: String, val naipe: String): Aqui estamos declarando uma data class chamada Carta, que representa uma carta de baralho.
// Esta data class possui duas propriedades: valor (representando o valor da carta, como "A", "2", "3", etc.)
// e naipe (representando o naipe da carta, como "♠️", "♥️", "♦️", "♣️"). Usamos uma data class porque ela fornece automaticamente métodos como toString(), equals(),
// hashCode(), o que é útil para representar objetos de dados imutáveis.

//toString(): Retorna uma representação em forma de String do objeto. Na data class, é gerado automaticamente e retorna uma String no formato "Carta(valor=n, naipe=x)",
// onde valor e naipe são os nomes das propriedades e n e x são os valores dessas propriedades.
//equals(): Usado para comparar se dois objetos são iguais. Na data class Carta, compara os valores e naipes das cartas para determinar se são iguais.
//hashCode(): Retorna um código hash único para o objeto, usado em estruturas de dados que dependem de hash. Na data class,
// é gerado automaticamente com base nas suas propriedades. Garante que objetos iguais tenham o mesmo código hash.

//Esses métodos são úteis em coleções de objetos e ao trabalhar com mapas e conjuntos.
// Ao usar uma data class em Kotlin, podemos aproveitar esses métodos automaticamente gerados, economizando tempo e evitando erros comuns na implementação manual