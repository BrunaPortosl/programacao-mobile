// Arquivo: Ex03_Main.kt
// Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro.
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar.
// Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.

// Programa principal para criar uma lista de animais e exibir informações sobre cada um deles
fun main() {
    // Criando uma lista de animais
    val listaAnimais = listOf(
        Cachorro("Rex", 5),
        Gato("Mimi", 3),
        Passaro("Piu", 2)
    )

    // Iterando sobre a lista de animais e exibindo informações sobre cada um
    for (animal in listaAnimais) {
        animal.fazerSom() // Chama o método para fazer o animal emitir som

        // Verifica o tipo de animal e chama o método específico, se aplicável
        when (animal) {
            is Cachorro -> animal.latir()
            is Gato -> animal.miar()
            is Passaro -> animal.cantar()
        }
    }
}

//Esses arquivos definem uma hierarquia de classes onde a classe Animal é a classe base abstrata e as classes Cachorro, Gato e Passaro herdam dela.
// Cada classe de animal implementa seu próprio som específico e métodos adicionais, como latir, miar e cantar.
// O programa principal cria uma lista de animais e exibe informações sobre cada um deles, chamando os métodos correspondentes.