import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public Livro buscarLivro(String titulo) {

        for (Livro livro : livros) {

            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }

        }

        return null;
}

public void listarLivros() {

        for (Livro livro : livros) {
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println();
        }
}

public void atualizarLivro(String titulo, String novoAutor) {

        Livro livro = buscarLivro(titulo);

        if (livro != null) {
            livro.setAutor(novoAutor);
        }

{
public void removerLivro(String titulo) {
    Livro livro = buscarLivro(titulo);

    if (livro != null) {
        livros.remove(livro);
    }

  {

{