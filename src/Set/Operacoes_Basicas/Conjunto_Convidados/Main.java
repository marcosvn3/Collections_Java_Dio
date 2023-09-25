package Set.Operacoes_Basicas.Conjunto_Convidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();

        listaConvidados.adicionarConvidado("Marcos", 1);
        listaConvidados.adicionarConvidado("Juarez", 2);
        listaConvidados.adicionarConvidado("Laura", 3);
        listaConvidados.adicionarConvidado("Tony", 4);
        listaConvidados.adicionarConvidado("Marcos", 5);

        System.out.println(listaConvidados.contarConvidados());

        System.out.println("------------------------------------------------------");

        listaConvidados.exibirConvidado();

    }
}
