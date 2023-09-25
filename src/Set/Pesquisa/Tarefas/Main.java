package Set.Pesquisa.Tarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Cozinhar",false);
        lista.adicionarTarefa("Lavar",true);
        lista.adicionarTarefa("Trabalhar",true);
        lista.adicionarTarefa("Estudar",false);
        lista.adicionarTarefa("Cantar",true);
        lista.adicionarTarefa("Tomar Banho",false);
        lista.adicionarTarefa("Dormir",true);


        lista.exibirTarefas();

        System.out.println("-----------------------------------------------");

        System.out.println(lista.contarTarefas());

        System.out.println("-----------------------------------------------");

        lista.removerTarefa("Cantar");

        System.out.println("-----------------------------------------------");

        lista.exibirTarefas();

        System.out.println("-----------------------------------------------");


        lista.marcarTarefaConcluida("Estudar");

        System.out.println("-----------------------------------------------");

        lista.exibirTarefas();

        lista.marcarTarefaPendente("trabalhar");

        System.out.println("-----------------------------------------------");

        lista.exibirTarefas();

        System.out.println("-----------------------------------------------");

        System.out.println(lista.obterTarefasConcluidas());

        System.out.println("-----------------------------------------------");

        System.out.println(lista.obterTarefasPendentes());

        System.out.println("-----------------------------------------------");

        lista.limparListaTarefas();

        System.out.println("-----------------------------------------------");

        lista.exibirTarefas();

    }
}
