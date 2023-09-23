package List.Pesquisa.Catalogo_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivro = new ArrayList<>();

    public CatalogoLivros() {
        this.listaLivro = new ArrayList<>();
    }

    public void adicionarLivro(String tit, String autor, int anoPublicacao) {
        listaLivro.add(new Livro(tit, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if (!listaLivro.isEmpty()) {
            for (Livro livro : listaLivro) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisaPorIntervalosAno(int anoInicial, int anoFinal){
        List<Livro>livrosPorIntervalo = new ArrayList<>();
        if(!listaLivro.isEmpty()){
            for(Livro l : listaLivro){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }


    public void pesquisaPorTtitulo(String titulo){
        for(Livro l : listaLivro){
            if(l.getTitulo() == titulo){
                System.out.println(l);
            }
        }
    }

}
