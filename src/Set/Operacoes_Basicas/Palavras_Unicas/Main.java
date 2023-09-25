package Set.Operacoes_Basicas.Palavras_Unicas;

import Set.Operacoes_Basicas.Conjunto_Convidados.ConjuntoConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas listPalavras = new ConjuntoPalavrasUnicas();

        //TODO: mesmo usado varias vezes no mesmo elemento so adiciona uma vez.
        listPalavras.adicionarPalavra("Marcos");
        listPalavras.adicionarPalavra("Joao");
        listPalavras.adicionarPalavra("marcos");
        listPalavras.adicionarPalavra("Josue");

        System.out.println(listPalavras.verificarPalavra("jOSUE"));

        System.out.println("---------------------------------------------");

        listPalavras.exibirPalavrasUnicas();

        System.out.println("---------------------------------------------");

        listPalavras.removerPalavra("mArCos");

        System.out.println("---------------------------------------------");

        listPalavras.exibirPalavrasUnicas();




    }
}
