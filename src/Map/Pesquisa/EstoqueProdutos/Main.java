package Map.Pesquisa.EstoqueProdutos;

public class Main {

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(101,"caneta", 10,2.5);
        estoque.adicionarProduto(302,"Polis", 2,5.70);
        estoque.adicionarProduto(403,"Mochila", 2,32.99);
        estoque.adicionarProduto(504,"Calculadora", 5,12.5);


        System.out.println(estoque.obterProdutoMaisBarato());

        System.out.println("---------------------------------------------------------");

        System.out.println(estoque.obterProdutoMaisCaro());

        System.out.println("---------------------------------------------------------");

        estoque.exibirProdutos();

        System.out.println("---------------------------------------------------------");

        System.out.println(estoque.calcularValorTotalEstoque());

    }
}

