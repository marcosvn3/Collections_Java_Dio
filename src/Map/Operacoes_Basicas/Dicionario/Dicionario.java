package Map.Operacoes_Basicas.Dicionario;


import java.util.HashMap;
import java.util.Map;


public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }


    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }


    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        String def = null;
        if(!dicionario.isEmpty()){
            def = dicionario.get(palavra);
        }
        return def;
    }















}
