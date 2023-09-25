package Set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    Set<Contato> listContato;

    public Agenda() {
        this.listContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int num){
        listContato.add(new Contato(nome,num));
    }

    public void exibirContatos() {
        for(Contato c : listContato){
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato>nomesEncontrados = new HashSet<>();

        for (Contato c : listContato){
            if(c.getNome().startsWith(nome)){
                nomesEncontrados.add(c);
            }
        }
        return nomesEncontrados;
    }



    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        if(listContato.isEmpty()){
            System.out.println("LISTA DE CONTATO(S) VAZIA!");
        }else{

            for(Contato c : listContato){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }

        }

        return contatoAtualizado;
    }





}
