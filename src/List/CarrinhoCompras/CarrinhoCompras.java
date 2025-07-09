package List.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itemList = new ArrayList<>();
    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        itemList.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }
    public double calcularValorTotal(){
        double total = 0;
        for (Item item : itemList) {
            total += item.getPreco();
        }
        return total;
    }
    public double calcularValorTotalStream(){
        return itemList.stream()
                .mapToDouble(Item::getPreco)
                .sum();
    }
    public void exibirItems(){
        System.out.println(itemList);
    }
}
