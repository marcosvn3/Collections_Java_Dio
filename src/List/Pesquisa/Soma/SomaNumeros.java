package List.Pesquisa.Soma;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listNumero = new ArrayList<>();

    public SomaNumeros() {
        this.listNumero =new ArrayList<>();
    }

    public void adicionarNumero(int num){
        listNumero.add(num);
    }

    public int calcularSoma(){
        int soma = 0;
        for(int i : listNumero){
            soma +=i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for(int i : listNumero){
            if(maior < i){
                maior = i;
            };
        }
        return maior;

    }

    public int encontrarMenorNumero() {
        //TODO: Se lista estiver vazia return 0
            if(listNumero.isEmpty()){
                return 0;
            }else{
                //TODO: Senao define o primeiro numero da lista como menor e faz as devidas comparações!
                int menor = listNumero.get(0);
                for (int t : listNumero) {
                    if (t <= menor) {
                        menor = t;
                    }
                }
                return menor;
            }
    }

    public void exibirNumeros(){
        int num = 1;
        for(int t : listNumero){
            System.out.println("Num "+num+" :"+t);
            num+=1;
        }
    }
}
