package Map.Pesquisa.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Integer, Produto> listProduto;

    public EstoqueProdutos() {
        this.listProduto = new HashMap<>();
    }

    public void adicionarProduto(Integer codigo,String nome,int quantidade, double preco){
        listProduto.put(codigo, new Produto(nome, quantidade,preco));
    }

    public void exibirProdutos(){
        System.out.println(listProduto);
    }


    public Double calcularValorTotalEstoque(){
        double valortotal = 0d;
        if(!listProduto.isEmpty()){
            for (Produto p : listProduto.values()){
                valortotal+= (p.getPreco() * p.getQuantidade());
            }
        }

        return valortotal;
    }


    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_VALUE;
        if(!listProduto.isEmpty()) {
            for (Produto p : listProduto.values()) {
             if(p.getPreco() > maiorPreco){
                 maiorPreco = p.getPreco();
                 produtoMaisCaro = p;
             }
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        Double menorPreco = Double.MAX_VALUE;
        if(!listProduto.isEmpty()) {
            for (Produto p : listProduto.values()) {
                if(p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }

        return produtoMaisBarato;
    }

}
