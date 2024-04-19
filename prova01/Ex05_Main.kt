//Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
// descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas.
// Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.



import java.time.LocalDate// Importando a classe LocalDate do pacote java.time


fun main() {
    val gerenciador = GerenciadorDeTarefas()// Criando uma instância do GerenciadorDeTarefas

    // Criando três instâncias de Tarefa com diferentes detalhes
    val tarefa1 = Tarefa("Estudar Kotlin", "Estudar Kotlin para melhorar minhas habilidades de programação", LocalDate.of(2024, 4, 30), Prioridade.ALTA)
    val tarefa2 = Tarefa("Fazer compras", "Ir ao supermercado e comprar os itens necessários", LocalDate.of(2024, 5, 5), Prioridade.MEDIA)
    val tarefa3 = Tarefa("Fazer exercícios", "Fazer exercícios físicos para manter a saúde", LocalDate.of(2024, 5, 1), Prioridade.BAIXA)

    // Adicionando as tarefas criadas ao gerenciador de tarefas
    gerenciador.adicionarTarefa(tarefa1)
    gerenciador.adicionarTarefa(tarefa2)
    gerenciador.adicionarTarefa(tarefa3)

    // Listando as tarefas ordenadas por data de vencimento e imprimindo os títulos e datas
    println("Lista de tarefas ordenadas por data de vencimento:")
    val tarefasOrdenadas = gerenciador.listarTarefasPorDataVencimento()
    tarefasOrdenadas.forEach { println("${it.titulo} - ${it.dataVencimento}") }
}


//Instanciando o Gerenciador de Tarefas: Uma instância do GerenciadorDeTarefas é criada. Presumivelmente, essa classe é responsável por gerenciar as tarefas do usuário.
//
//Criando Tarefas: Três objetos Tarefa são criados com diferentes detalhes: tarefa1, tarefa2 e tarefa3. Cada tarefa tem um título, uma descrição, uma data de vencimento e uma prioridade.
//
//Adicionando Tarefas ao Gerenciador: As tarefas recém-criadas são adicionadas ao GerenciadorDeTarefas usando o método adicionarTarefa().
//
//Listando Tarefas Ordenadas por Data de Vencimento: As tarefas são então listadas em ordem crescente de data de vencimento.
// Isso é feito invocando o método listarTarefasPorDataVencimento() no GerenciadorDeTarefas. As tarefas são iteradas e seus títulos e datas de vencimento são impressos na tela

//resumo de tudo: o código cria e gerencia tarefas, permitindo que sejam adicionadas,armazenadas e listadas com base em suas datas de vencimento.
// Ele usa objetos Kotlin para representar as tarefas e utiliza métodos para operar sobre elas, seguindo os princípios de orientação a objetos.