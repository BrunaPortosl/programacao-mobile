// Ex03_Cachorro
//Crie uma classe abstrata Animal com atributos como nome, idade e som.
// Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro.
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar.
// Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.


// Arquivo: Ex03_Cachorro.kt
// Define a classe Cachorro que herda de Animal e implementa o som específico e método para latir

class Cachorro(nome: String, idade: Int) : Animal(nome, idade, "Au Au") {
    // Implementação do método para fazer o cachorro latir
    override fun fazerSom() {
        println("$nome faz $som")
    }

    // Método específico para cachorro
    fun latir() {
        println("$nome está latindo!")
    }
}

//Esses arquivos definem uma hierarquia de classes onde a classe Animal é a classe base abstrata e as classes Cachorro, Gato e Passaro herdam dela.
// Cada classe de animal implementa seu próprio som específico e métodos adicionais, como latir, miar e cantar.
// O programa principal cria uma lista de animais e exibe informações sobre cada um deles, chamando os métodos correspondentes.
