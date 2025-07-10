package List.Search.SomaNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(32);
        somaNumeros.adicionarNumero(64);
        System.out.println( somaNumeros.exibirNumeros());
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMenorStream());
        System.out.println(somaNumeros.encontrarMaiorStream());
        System.out.println( somaNumeros.exibirNumeros());
    }
}
