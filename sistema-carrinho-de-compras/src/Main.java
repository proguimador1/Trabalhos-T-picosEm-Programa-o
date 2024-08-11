import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static final ArrayList<Produto> produtosDisponiveis = new ArrayList<Produto>();

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        boolean sairDoSistema = false;

        gerarListaProdutosDisponiveis();

        while(!sairDoSistema){

            System.out.println("1-Adicionar produto\n2-Remover produto\n3-Ver carrinho\n4-Comprar"); //mostra as 4 opções
            System.out.print("Digite o número da opção desejada: ");//solicita entrada do usuário
            opcao = leitor.nextInt();

            leitor.nextLine(); //limpa o buffer

            switch(opcao){
                case 1:

                    int opcaoProduto, qtdProdutos;

                    mostrarProdutosDisponíveis();
                    System.out.print("Digite o número do produto a ser adicionado: ");
                    opcaoProduto = leitor.nextInt();

                    leitor.nextLine();

                    System.out.print("Qual quantidade deseja? "); //solicita entra com a quantidade
                    qtdProdutos = leitor.nextInt();

                    leitor.nextLine();

                    System.out.println(""); //quebra linha

                    Carrinho.adicionarProduto(produtosDisponiveis.get(opcaoProduto-1), qtdProdutos);

                    System.out.println("Produto adicionado com sucesso!\n"); //imprime mensagem de sucesso
                    
                    break;
                case 2:

                    String nomeProduto;

                    System.out.print("Nome do produto a ser removido: "); //solicita entrada com nome do produto
                    nomeProduto = leitor.nextLine();

                    if(!Carrinho.removerProduto(nomeProduto)){

                        System.out.println("Esse produto não está no carrinho.\n"); //imprime mensagem de fracasso

                        break;

                    }

                    System.out.println("Produto removido com sucesso!\n"); //imprime mensagem de sucesso

                    break;
                case 3:

                    System.out.println(Carrinho.verDadosCarrinho());
                    System.out.println(""); //quebra linha
                    
                    break;
                case 4:
                    
                    sairDoSistema = true;

                    break;
            
                default:

                System.out.println("Opção inválida.\n");
                    break;
            }
            
        }

        System.out.println("Sua compra foi bem sucedida!");

        leitor.close();

    }

    static void gerarListaProdutosDisponiveis(){

        produtosDisponiveis.add(new ProdutoNormal("ProdutoNormal 1", 10.0));
        produtosDisponiveis.add(new ProdutoNormal("ProdutoNormal 2", 15.0));
        produtosDisponiveis.add(new ProdutoNormal("ProdutoNormal 3", 20.0));
        produtosDisponiveis.add(new ProdutoNormal("ProdutoNormal 4", 25.0));
        produtosDisponiveis.add(new ProdutoPromocional("ProdutoPromocional 1", 10.0));
        produtosDisponiveis.add(new ProdutoPromocional("ProdutoPromocional 2", 15.0));
        produtosDisponiveis.add(new ProdutoPromocional("ProdutoPromocional 3", 20.0));
        produtosDisponiveis.add(new ProdutoPromocional("ProdutoPromocional 4", 25.0));

    }

    static void mostrarProdutosDisponíveis(){

        int indice = 0;

        for(Produto produto: produtosDisponiveis){

            indice++;

            System.out.println(indice + "-" + produto.toString());

        }

    }
    
}