package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> listaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                listaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(listaRemover);
    }

    public void removerTarefaIf(String descricao){
        tarefaList.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricao(){
        System.out.println(tarefaList);
    }

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
