package List.Search;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivros("livro1","raul",1990);
        catalogoLivros.adicionarLivros("livro2","raul",2000);
        catalogoLivros.adicionarLivros("livro3","jonathan",2010);
        catalogoLivros.adicionarLivros("livro4","euzer",2020);
        catalogoLivros.adicionarLivros("livro5","ana",2030);

        System.out.println(catalogoLivros.pesquisarAutorStream("raul"));
        System.out.println(catalogoLivros.pesquisarPorAnoStream(2010,2020));
        System.out.println(catalogoLivros.pesquisarPorTituloStream("livro5"));
    }
}
