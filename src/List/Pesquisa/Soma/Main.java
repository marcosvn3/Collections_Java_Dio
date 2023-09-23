package List.Pesquisa.Soma;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somados = new SomaNumeros();

        somados.adicionarNumero(1150);
        somados.adicionarNumero(220);
        somados.adicionarNumero(330);
        somados.adicionarNumero(4900);
        somados.adicionarNumero(560);

        System.out.println("Soma dos numeros : " + somados.calcularSoma());
        System.out.println("--------------------------------");
        System.out.println("Maior numero: " + somados.encontrarMaiorNumero());

        System.out.println("--------------------------------");
        System.out.println("Menor numero: "+ somados.encontrarMenorNumero());

        System.out.println("--------------------------------");
        somados.exibirNumeros();





    }
}
