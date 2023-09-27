package Map.Operacoes_Basicas.Dicionario;

public class Main {
    public static void main(String[] args) {
        Dicionario list = new Dicionario();

        list.adicionarPalavra("Comer", "ingerir");
        list.adicionarPalavra("Falar", "Emitir som");
        list.adicionarPalavra("Locomover","Andar" );


        list.exibirPalavras();

        System.out.println(("------------------------------------------------------------------------"));

        System.out.println(list.pesquisarPorPalavra("Falar"));

       list.removerPalavra("Comer");

        System.out.println(("------------------------------------------------------------------------"));

        list.exibirPalavras();


    }
}
