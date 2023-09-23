package List.Operações_Basicas.Lista_de_Tarefas;

public class Main {
    public static void main(String []args ){
        Tarefa t1 = new Tarefa("Arrumar casa");
        Tarefa t2 = new Tarefa("Tomar banho");
        Tarefa t3 = new Tarefa("Dobrar Roupa");


        ListaTarefas listaPrincipal = new ListaTarefas();

        listaPrincipal.adicionarTarefa("arrumar casa");
        listaPrincipal.adicionarTarefa("tomar banho");
        listaPrincipal.adicionarTarefa("Dobrar roupar");


        System.out.println(listaPrincipal.obterNumeroTotalTarefas());

        listaPrincipal.obterDescricaoTarefa();

        listaPrincipal.removerTarefa("TOMAR BANHO");



    }

}
