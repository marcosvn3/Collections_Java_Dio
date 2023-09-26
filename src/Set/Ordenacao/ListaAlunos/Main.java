package Set.Ordenacao.ListaAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos list = new GerenciadorAlunos();

        list.adicionarALuno("Marcos",1102,7.2);
        list.adicionarALuno("Vitor",1201,4.8);
        list.adicionarALuno("Zenis",1352,2.1);
        list.adicionarALuno("Laura",1428,8.8);
        list.adicionarALuno("Jonas",1142,9.4);

        System.out.println(list.exibirAlunosPorNome());
        System.out.println(list.exibirAlunosPorNota());
        list.exibirAluno();


    }
}
