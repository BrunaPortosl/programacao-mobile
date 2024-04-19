//Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
// descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas.
// Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.


import java.time.LocalDate// Importando a classe LocalDate do pacote java.time

enum class Prioridade {// Enumeração para representar as diferentes prioridades de uma tarefa
    BAIXA, MEDIA, ALTA
}
// Classe base para representar uma tarefa
class TarefaBase(
    val titulo: String,// Título da tarefa
    val descricao: String,// Descrição da tarefa
    val dataVencimento: LocalDate,// Data de vencimento da tarefa
    val prioridade: Prioridade,// Prioridade da tarefa
    var concluida: Boolean = false // Indica se a tarefa foi concluída ou não (padrão: false)
)
// Classe responsável por gerenciar as tarefas
class GerenciadorDeTarefas {
    private val listaTarefas: MutableList<Tarefa> = mutableListOf() // Lista de tarefas

    // Método para adicionar uma tarefa à lista
    fun adicionarTarefa(tarefa: Tarefa) {
        listaTarefas.add(tarefa)
    }

    // Método para remover uma tarefa da lista com base no título
    fun removerTarefa(titulo: String) {
        val tarefa = listaTarefas.find { it.titulo == titulo }// Encontra a tarefa com o título fornecido
        listaTarefas.remove(tarefa)// Remove a tarefa da lista
    }

    // Método para remover uma tarefa da lista com base no título
    fun buscarTarefa(titulo: String): Tarefa? {
        return listaTarefas.find { it.titulo == titulo }// Retorna a tarefa com o título fornecido, se encontrada
    }

    // Método para marcar uma tarefa como concluída com base no título
    fun marcarComoConcluida(titulo: String) {
        val tarefa = listaTarefas.find { it.titulo == titulo }// Encontra a tarefa com o título fornecido
        tarefa?.let {// Se a tarefa não for nula
            it.concluida = true // Marca a tarefa como concluída
        }
    }

    // Método para listar as tarefas ordenadas por data de vencimento
    fun listarTarefasPorDataVencimento(): List<Tarefa> {
        return listaTarefas.sortedBy { it.dataVencimento }// Ordena a lista de tarefas com base na data de vencimento
    }
}

//Importação de java.time.LocalDate: Explicação: Importamos a classe LocalDate do pacote java.time para lidar com datas de vencimento das tarefas.
//Justificativa: Usamos LocalDate porque é uma classe conveniente e eficiente para lidar com datas sem a necessidade de usar tipos primitivos ou bibliotecas adicionais.

//Enumeração Prioridade: Explicação: Definimos uma enumeração para representar as diferentes prioridades das tarefas, como "BAIXA", "MÉDIA" e "ALTA".
//Justificativa: Usamos uma enumeração para garantir que apenas valores específicos sejam utilizados para a prioridade das tarefas, o que torna o código mais legível e menos propenso a erros.

//Classe TarefaBase: Explicação: Criamos uma classe TarefaBase com atributos como título, descrição, data de vencimento, prioridade e um indicador de conclusão.
//Justificativa: Essa classe serve como um modelo básico para representar uma tarefa, encapsulando todas as informações relevantes de uma tarefa em um único objeto.

//Classe GerenciadorDeTarefas:Explicação: Criamos uma classe GerenciadorDeTarefas para gerenciar as tarefas, incluindo métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.
//Justificativa: Essa classe encapsula a lógica para manipular e organizar as tarefas, promovendo um design mais modular e coeso.

//Métodos da classe GerenciadorDeTarefas:Explicação: Cada método na classe GerenciadorDeTarefas executa uma operação específica, como adicionar uma tarefa, removê-la, marcá-la como concluída, etc.
//Justificativa: A divisão das funcionalidades em métodos individuais promove a reutilização de código, facilita a manutenção e torna o código mais legível e organizado.