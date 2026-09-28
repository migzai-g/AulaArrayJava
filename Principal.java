public class Principal {

    public static void main(String[] args) {

        Livro[] livros = new Livro[5];

        livros[0] = new Livro("Java: Como Programar", "Deitel & Deitel", 2017);
        livros[1] = new Livro("Clean Code", "Robert C. Martin", 2008);
        livros[2] = new Livro("Introdução ao Java com POO", "João Silva", 2020);
        livros[3] = new Livro("Design Patterns", "Gang of Four", 1994);
        livros[4] = new Livro("Java Efetivo", "Joshua Bloch", 2018);

        System.out.println("=== Livros com 'Java' no título ===");
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].titulo.contains("Java")) {
                livros[i].exibirInformacoes();
            }
        }
    }
}