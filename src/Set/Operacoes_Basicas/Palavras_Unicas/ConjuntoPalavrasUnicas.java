package Set.Operacoes_Basicas.Palavras_Unicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String>palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }


    public void adicionarPalavra(String txt){
        palavras.add(txt);
    }

    public void removerPalavra(String txt){
        palavras.removeIf(c -> c.equalsIgnoreCase(txt));
    }

    public Boolean verificarPalavra(String txt){
        for(String c : palavras){
            if(c.equalsIgnoreCase(txt)){
                return true;
            }
        }
        return false;
    }


    public void exibirPalavrasUnicas(){
        for(String c : palavras){
            System.out.println(c);
        }
    }

}
