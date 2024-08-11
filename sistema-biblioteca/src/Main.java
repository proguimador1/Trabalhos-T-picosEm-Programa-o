import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        while(opcao != 4){

            //leitor.nextLine();

            System.out.println("1-Adicionar livro\n2-Pesquisar livro\n3-Remover livro\n4-Sair do sistema");
            System.out.print("Digite o número da opção desejada: ");
            opcao = leitor.nextInt();

            leitor.nextLine();

            switch (opcao) {
                case 1:

                    String nomeAutor;
                    String tituloLivro;
                        
                    System.out.print("Titulo do livro: ");
                    tituloLivro = leitor.nextLine();
                    System.out.print("Nome do autor: ");
                    nomeAutor = leitor.nextLine();

                    Biblioteca.adicionarLivro(new Livro(tituloLivro, nomeAutor));

                    System.out.println(tituloLivro);
                    System.out.println("");
                    System.out.println("Livro adicionado com sucesso!\n");
                    System.out.println("");

                    break;
                case 2:

                    String dadosLivro;

                    System.out.print("Título do livro procurado: ");
                    tituloLivro = leitor.nextLine();

                    System.out.println("");

                    dadosLivro = Biblioteca.pesquisarLivro(tituloLivro);

                    if (dadosLivro.equals("")){

                        System.out.println("Não há livro com esse título.\n");
                        break;
                        
                    }

                    System.out.println(dadosLivro);
                    System.out.println("");
                    
                    break;
                case 3:

                    System.out.print("Digite o código do livro a ser removido: ");
                    int codigo = leitor.nextInt();

                    System.out.println("");

                    if(!Biblioteca.removerLivro(codigo)){

                        System.out.println("Não há um livro com esse código.");
                        System.out.println("");
                        break;

                    }

                    System.out.println("Livro removido com sucesso!");
                    System.out.println("");
                    
                    break;

                case 4:
                    break;
            
                default:
                    System.out.println("Opção inválida.");
                    System.out.println("");

                    break;
            }

        }

        leitor.close();

    }

}