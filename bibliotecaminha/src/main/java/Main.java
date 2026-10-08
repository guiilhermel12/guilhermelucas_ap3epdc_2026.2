public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Cortiço", "Aluísio Azevedo");

        // CREATE
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // READ
        System.out.println("LISTA DE LIVROS:");
        biblioteca.listarLivros();

        // BUSCAR
        System.out.println("BUSCANDO LIVRO:");

        Livro encontrado = biblioteca.buscarLivro("Dom Casmurro");

        if (encontrado != null) {
            System.out.println("Livro encontrado: " + encontrado.getTitulo());
        }

        // UPDATE
        biblioteca.atualizarLivro(
                "Dom Casmurro",
                "Machado de Assis Filho"
        );

        // DELETE
        biblioteca.removerLivro("O Cortiço");

        System.out.println("\nLISTA APÓS ALTERAÇÕES:");
        biblioteca.listarLivros();
    }
}