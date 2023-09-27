package Map.Pesquisa.ContagemPalavras;

public class Main {
    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Melhor",2);
        contagem.adicionarPalavra("top",5);
        contagem.adicionarPalavra("ter",3);
        contagem.adicionarPalavra("quero",9);


        System.out.println(contagem.exibirContagem());

        System.out.println("-------------------------------------------------");

        System.out.println(contagem.encontrarPalavrasMaisFrequente());

        System.out.println("-------------------------------------------------");

        contagem.removerPalavra("quero");

        System.out.println(contagem.exibirContagem());

        System.out.println("-------------------------------------------------");


    }
}
