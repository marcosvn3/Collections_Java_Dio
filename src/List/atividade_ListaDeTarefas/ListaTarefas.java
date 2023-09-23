package List.atividade_ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa>tarefaList = new ArrayList<>();

    //TODO: Criado para criar uma arrayList vazio!!
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }



    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> listParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                listParaRemover.add(t);
            }
        }

        tarefaList.removeAll(listParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefa(){
        for(Tarefa t : tarefaList){
            System.out.println(t.getDescricao());
        }
    }

}
