package Map.Pesquisa.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer>palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String txt, Integer contagem){
        palavras.put(txt,contagem);
    }

    public void removerPalavra(String txt){
        if(!palavras.isEmpty()){
            palavras.remove(txt);
        }
    }


    public int exibirContagem(){
        int contador = 0;
        for(int c : palavras.values()){
            contador+= c;
        }

        return contador;
    }


    public String encontrarPalavrasMaisFrequente() {
        String palavraMaisUsada = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisUsada = entry.getKey();
            }
        }
        return palavraMaisUsada;
    }















}
