package Map.Operacoes_Basicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agenda;

    public AgendaContatos() {
        agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agenda.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!agenda.isEmpty()){
            agenda.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agenda);
    }

    //TODO:  quando pesquisado a chave nome o ".get()" returna um valor inteiro;
    public Integer pesquisarPorNome(String nome ){
        Integer numeroPorNome = null;
        if(!agenda.isEmpty()){
            numeroPorNome = agenda.get(nome);
        }

        return numeroPorNome;
    }

}
