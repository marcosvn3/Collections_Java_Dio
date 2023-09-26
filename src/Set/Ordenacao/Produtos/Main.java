package Set.Ordenacao.Produtos;

public class Main {
    public static void main(String[] args) {

        CadastroProdutos list = new CadastroProdutos();

        list.adicionarProduto(1061,"Caderno",12.8,8);
        list.adicionarProduto(1052,"Caneta",2.5,10);
        list.adicionarProduto(1043,"Estojo",7.6,7);
        list.adicionarProduto(1034,"Mochila",25.0,2);
        list.adicionarProduto(1025,"Calculadora",9.7,3);
        list.adicionarProduto(1016,"Farda",11.5,3);
        System.out.println("--------------------------------------------------------------------");
        System.out.println(list.exibirProdutosPorNome());
        System.out.println("--------------------------------------------------------------------");
        System.out.println(list.exibirPorPreco());


    }
}
