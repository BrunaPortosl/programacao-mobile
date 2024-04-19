//Arquivo: Ex03_Animal
//Crie uma classe abstrata Animal com atributos como nome, idade e som.
// Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro.
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar.
// Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.


// Define a classe abstrata Animal com atributos comuns a todos os animais

abstract class Animal(val nome: String, val idade: Int, val som: String) {
    // Método abstrato para emitir som do animal
    abstract fun fazerSom()
}


//Esses arquivos definem uma hierarquia de classes onde a classe Animal é a classe base abstrata e as classes Cachorro, Gato e Passaro herdam dela.
// Cada classe de animal implementa seu próprio som específico e métodos adicionais, como latir, miar e cantar.
// O programa principal cria uma lista de animais e exibe informações sobre cada um deles, chamando os métodos correspondentes.
