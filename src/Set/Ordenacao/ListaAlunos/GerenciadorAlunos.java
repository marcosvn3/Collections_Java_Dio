package Set.Ordenacao.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listAluno;

    public GerenciadorAlunos() {
        this.listAluno = new HashSet<>();
    }

    public void adicionarALuno(String nome, int matricula, double nota){
        listAluno.add(new Aluno(nome, matricula, nota));

    }

    public void removerAluno(int matricula) {
        listAluno.removeIf(a -> a.getMatricula() == matricula);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno>alunosPorNome = new TreeSet<>(listAluno);

        return  alunosPorNome;
    }


    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<Aluno>(new ComparePorNota());

        alunoPorNota.addAll(listAluno);

        return alunoPorNota;
    }

    public void exibirAluno(){
        for(Aluno a : listAluno){
            System.out.println(a);
        }
    }

}
