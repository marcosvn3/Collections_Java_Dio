package Set.Pesquisa.AgendaContatos;

public class Main {
    public static void main(String[] args) {
        Agenda nAgenda = new Agenda();

        nAgenda.adicionarContato("Marcos",88746522);
        nAgenda.adicionarContato("Marcos santos",88746522);
        nAgenda.adicionarContato("Jose frederico",88746522);
        nAgenda.adicionarContato("Marlon aase",88746522);
        nAgenda.adicionarContato("Marcos moreno",88746522);



        nAgenda.exibirContatos();

        System.out.println("-------------------------------------------");

        System.out.println(nAgenda.pesquisarPorNome("Marcos"));

        System.out.println("-------------------------------------------");

        nAgenda.atualizarNumeroContato("Laura",99882232);

        System.out.println("-------------------------------------------");

        nAgenda.exibirContatos();



    }
}
