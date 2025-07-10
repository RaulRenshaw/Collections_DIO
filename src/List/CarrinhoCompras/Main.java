package List.CarrinhoCompras;

import List.OperacoesBasicas.ListaTarefas;

public class Main {
    public static void main(String[] args) {

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarItem("doce",21.23,20);
        carrinhoCompras.adicionarItem("salgado",40.90,10);
        carrinhoCompras.adicionarItem("agridoce",90,5);
        System.out.println(carrinhoCompras.calcularValorTotalStream());
        carrinhoCompras.exibirItems();
        carrinhoCompras.removerItem("doce");
        carrinhoCompras.exibirItems();
        System.out.println(carrinhoCompras.calcularValorTotal());
    }
}
