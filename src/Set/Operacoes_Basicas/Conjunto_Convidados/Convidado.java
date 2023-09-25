package Set.Operacoes_Basicas.Conjunto_Convidados;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigoConvite = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }


    @Override
    public String toString() {
        return "Convidado: " +
                nome + '\'' +
                ", codigoConvite: " + codigoConvite;
    }
}
