package Set.Pesquisa.Tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa>listTarefa;

    public ListaTarefas() {
        this.listTarefa = new HashSet<>();
    }



    public void adicionarTarefa(String desc,  Boolean concluida){
        listTarefa.add(new Tarefa(desc,concluida));
    }


    public void removerTarefa(String desc){

        if(listTarefa.isEmpty()){
            System.out.println("Lista vazia!");
        }else{
            listTarefa.removeIf(t -> t.getDescricao() == desc);
        }

    }

    public void exibirTarefas(){
        for(Tarefa t : listTarefa){
            System.out.println(t);
        }
    }

    public int contarTarefas(){
        return listTarefa.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluidas = new HashSet<>();

        for(Tarefa t : listTarefa){
            if(t.getTarefaConcluida()){
                concluidas.add(t);
            }
        }

        return concluidas;
    }


    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> pendentes = new HashSet<>();

        for(Tarefa t : listTarefa){
            if(!t.getTarefaConcluida()){
                pendentes.add(t);
            }
        }

        return pendentes;
    }


    public void  marcarTarefaConcluida(String desc){

        for(Tarefa t : listTarefa){
            if(t.getDescricao().equalsIgnoreCase(desc)){
                t.setTarefaConcluida(true);
            }
        }

    }


    public void  marcarTarefaPendente(String desc){

        for(Tarefa t : listTarefa){
            if(t.getDescricao().equalsIgnoreCase(desc)){
                t.setTarefaConcluida(false);
            }
        }

    }

    public void limparListaTarefas(){
        listTarefa.removeAll(listTarefa);
    }


}
