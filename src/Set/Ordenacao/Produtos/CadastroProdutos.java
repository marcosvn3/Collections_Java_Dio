package Set.Ordenacao.Produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listProduto;

    public CadastroProdutos() {
        this.listProduto = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
        listProduto.add(new Produto(codigo, nome, preco, quantidade));
    }


    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(listProduto);
        return produtosPorNome;
    }


    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparetorPorPreco());
        produtosPorPreco.addAll(listProduto);
        return produtosPorPreco;
    }


}
