package List.Operacoes_Basicas.Carrinho;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Calculadora",24.9,3);
        carrinho.adicionarItem("Apontador",4.9,2);
        carrinho.adicionarItem("Caderno",12.5,4);
        carrinho.adicionarItem("Apontador",4.9,5);

        carrinho.exibirItens();

        System.out.println("------------------------------");

        carrinho.removerItem("apontador");
        carrinho.exibirItens();

        System.out.println("------------------------------");

        System.out.printf("Valor total: %.2f R$",carrinho.calcularValorTotal());


    }
}
