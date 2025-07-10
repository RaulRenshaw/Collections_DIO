package List.Search;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivros(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo,autor,ano));
    }
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarAutorStream(String autor){
        return livroList.stream()
                .filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                .toList();
    }
    public List<Livro> pesquisarPorAno(int anoInical, int anoFinal){
      List<Livro> livrosPorAnos = new ArrayList<>();
      if (!livroList.isEmpty()){
          for (Livro livro : livroList) {
              if (livro.getAno() <= anoFinal && livro.getAno() >= anoInical){
                  livrosPorAnos.add(livro);
              }
          }
      }
      return livrosPorAnos;
    }
    public List<Livro> pesquisarPorAnoStream(int anoInical, int anoFinal){
        return livroList.stream()
                .filter(livro -> livro.getAno() >= anoInical && livro.getAno() <= anoFinal)
                .toList();
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public Livro pesquisarPorTituloStream(String titulo){
        return livroList.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }
}