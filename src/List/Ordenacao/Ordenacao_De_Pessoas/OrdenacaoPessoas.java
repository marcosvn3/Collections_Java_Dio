package List.Ordenacao.Ordenacao_De_Pessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa>listPessoas = new ArrayList<>();

    public OrdenacaoPessoas() {
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoas.add(new Pessoa(nome,idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa>pessoasPorIdade = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> ordenada = new ArrayList<>(listPessoas);
        Collections.sort(ordenada,new ComparatorPorAltura());

        return ordenada;
    }


}
