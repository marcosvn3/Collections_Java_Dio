package List.Pesquisa.Catalogo_livros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("AAAA","jorginho",2019);
        catalogo.adicionarLivro("TTTTT","leandro",2018);
        catalogo.adicionarLivro("KKKK","nogueira",1985);
        catalogo.adicionarLivro("ZZZZ","jorginho",1993);

        System.out.println(catalogo.pesquisarPorAutor("leandro"));
        System.out.println(catalogo.pesquisaPorIntervalosAno(1984,2020));
        System.out.println(catalogo.pesquisarPorAutor("jorginho"));

    }
}
