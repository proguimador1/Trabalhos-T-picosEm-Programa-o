import java.util.ArrayList;

public class Biblioteca{

    private static ArrayList<Livro> livros = new ArrayList<>();

    public static String pesquisarLivro(String titulo){

        for(Livro livro: livros)
            if(livro.getTitulo().equals(titulo))
                return livro.toString();

        return "";

    }

    public static boolean removerLivro(int codigo){

        for(Livro livro: livros)
            if(livro.getCodigo() == codigo){

                livros.remove(livro);

                return true;

            }

        return false;

    }

    public static void adicionarLivro(Livro livro){

        livro.setCodigo(gerarCodigoLivro());

        livros.add(livro);

    }

    private static int gerarCodigoLivro(){

        return livros.get(livros.size()-1).getCodigo() + 1;

    }
    
}
