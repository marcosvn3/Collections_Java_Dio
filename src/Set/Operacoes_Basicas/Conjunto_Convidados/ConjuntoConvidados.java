package Set.Operacoes_Basicas.Conjunto_Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> listConvidados;

    public ConjuntoConvidados(){
        this.listConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        listConvidados.add(new Convidado(nome, codigo));
    }


    public void removerConvidadoPorConvite(int codigoConvite){
        for(Convidado c : listConvidados){
            if(c.getCodigoConvite() == codigoConvite){
                listConvidados.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return listConvidados.size();
    }

    public void exibirConvidado(){
        for(Convidado c : listConvidados){
            System.out.println(c);
        }
    }






}
