package List.Ordenacao.Ordenacao_De_Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
    List<Integer>listNum = new ArrayList<>();

    public OrdenacaoNumeros() {
        this.listNum = new ArrayList<>();
    }


    public void adicionarNum(int num){
        listNum.add(num);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer>ordenada = new ArrayList<>(listNum);
        Collections.sort(ordenada);

        return ordenada;
    }


    public List<Integer> ordenarDescendente(){
        List<Integer>ordenada = new ArrayList<>(listNum);

        Collections.sort(ordenada);
        Collections.reverse(ordenada);

        return ordenada;
    }


    @Override
    public int compareTo(Integer o) {
        return Integer.compare(listNum.get(0), o.intValue() );
    }
}
