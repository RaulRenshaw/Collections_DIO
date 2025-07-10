package List.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
            ListaTarefas listaTarefas = new ListaTarefas();

            listaTarefas.adicionarTarefa("acordar");
            System.out.println(listaTarefas.obterNumeroTotalTarefas());
            listaTarefas.obterDescricao();
            listaTarefas.removerTarefaIf("acordar");
            listaTarefas.obterDescricao();
            System.out.println(listaTarefas.obterNumeroTotalTarefas());
    }
}
