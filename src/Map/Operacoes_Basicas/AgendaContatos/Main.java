package Map.Operacoes_Basicas.AgendaContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Marcos",2222221);
        agenda.adicionarContato("Joao",1111112);
        agenda.adicionarContato("Leoncio",3333221);
        agenda.adicionarContato("Picapau",88888123);

        agenda.exibirContato();

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println(agenda.pesquisarPorNome("Leoncio"));

        System.out.println("------------------------------------------------------------------------------------------");


        agenda.removerContato("Joao");

        agenda.exibirContato();

        System.out.println("------------------------------------------------------------------------------------------");
    }

}
