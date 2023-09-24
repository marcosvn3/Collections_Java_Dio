package List.Ordenacao.Ordenacao_De_Numeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros lista = new OrdenacaoNumeros();

        lista.adicionarNum(9);
        lista.adicionarNum(2);
        lista.adicionarNum(4);
        lista.adicionarNum(6);
        lista.adicionarNum(1);

        System.out.println(lista.ordenarAscendente());

        System.out.println("------------------------------------------");

        System.out.println(lista.ordenarDescendente());


    }
}
