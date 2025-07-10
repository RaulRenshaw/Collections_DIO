package List.Search.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> somaList;
    public SomaNumeros() {
        this.somaList = new ArrayList<>();
    }
    public void adicionarNumero (int numero){
        somaList.add(numero);
    }
    public int calcularSoma(){
        int total = 0;
        for (Integer somaNumeros : somaList) {
            total += somaNumeros;
        }
        return total;
    }
    public int calcularSomaStream(){
        return somaList.stream()
                .mapToInt(i -> i)
                .sum();
    }
    public int encontrarMaior(){
        int maior = Integer.MIN_VALUE;
        for (int numero : somaList) {
            if (numero > maior){
                maior = numero;
            }
        }
        return maior;
    }
    public int encontrarMaiorStream(){
        return somaList.stream()
                .mapToInt(i -> i)
                .max()
                .orElse(Integer.MIN_VALUE);
    }
    public int encontrarMenor(){
        int menor = Integer.MAX_VALUE;
        for (int numero : somaList) {
            if (numero < menor){
                menor = numero;
            }
        }
        return menor;
    }
    public int encontrarMenorStream(){
        return somaList.stream()
                .mapToInt(i -> i)
                .min()
                .orElseThrow(() -> new IllegalStateException("Lista vazia. Não é possível encontrar o menor número."));
    }
    public List<Integer> exibirNumeros(){
        return somaList;
    }
}
