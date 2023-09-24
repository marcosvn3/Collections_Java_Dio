package List.Operacoes_Basicas.Carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho = new ArrayList<>();

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco,int qtd){
        carrinho.add(new Item(nome,preco,qtd));
    }

    public void removerItem(String nome){
        //TODO: Lista usada para agrupar itens com mesmo nome e retirar todos do carrinho!
        List<Item> remocao = new ArrayList<>();

        if(!carrinho.isEmpty()){
            for(Item i : carrinho){
                if (i.getNome().equalsIgnoreCase(nome)){
                    remocao.add(i);
                }
            }
        }

        carrinho.removeAll(remocao);
    }


    public double calcularValorTotal(){
        double valorTotal = 0.;

        for (Item i: carrinho){
            valorTotal += (i.getPreco()*i.getQuantidade());
        }
        return valorTotal;
    }


    public void exibirItens(){
        for (Item i : carrinho){
            System.out.println(i);
        }
    }





}
