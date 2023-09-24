package List.Ordenacao.Ordenacao_De_Pessoas;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas lista = new OrdenacaoPessoas();

        lista.adicionarPessoa("Jose",27,1.84);
        lista.adicionarPessoa("Luiz",30,1.70);
        lista.adicionarPessoa("Andrade",20,1.92);
        lista.adicionarPessoa("Lorena",30,1.65);

        System.out.println(lista.ordenarPorIdade());
        System.out.println("+=====================================+");

        System.out.println(lista.ordenarPorAltura());
    }
}
