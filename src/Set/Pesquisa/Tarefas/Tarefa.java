package Set.Pesquisa.Tarefas;

public class Tarefa {
    private final String descricao;
    private Boolean tarefaConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    public Tarefa(String descricao, Boolean tarefaConcluida) {
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(Boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public String toString() {
        return  "descricao: " + descricao + '\'' +
                "-> tarefaConcluida? " + tarefaConcluida ;
    }
}
