//Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
// descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas.
// Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.


import java.time.LocalDate //Essa linha importa a classe LocalDate do pacote java.time,
                           // que é utilizada para representar datas sem a necessidade de utilizar bibliotecas externas.

// Definindo a classe Tarefa
class Tarefa(
// Definindo os atributos da classe Tarefa
    val titulo: String,// Título da tarefa
    val descricao: String,// Descrição da tarefa
    val dataVencimento: LocalDate, // Data de vencimento da tarefa
    val prioridade: Prioridade// Prioridade da tarefa
) {
    // Definindo um atributo para verificar se a tarefa foi concluída ou não
    var concluida: Boolean = false// Inicialmente, a tarefa não está concluída
}
//a classe Tarefa é um tipo de dados que representa uma tarefa com título, descrição, data de vencimento,
// prioridade e um status de conclusão. Os parâmetros (titulo, descricao, dataVencimento, prioridade)
// são obrigatórios ao criar uma nova instância dessa classe, enquanto o status de concluida é inicializado como false por padrão.