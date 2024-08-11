import java.util.ArrayList;

public class Carrinho {

    private static ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public static void adicionarProduto(Produto produto, int qtd){

        produtos.add(produto);

        produtos.get(produtos.size()-1).setQtd(qtd);

    }

    public static boolean removerProduto(String nomeProduto){

        for(Produto produto: produtos){

            if(produto.getNomeProduto().equals(nomeProduto)){

                produtos.remove(produto);

                return true;

            }

        }

        return false;

    }

    public static String verDadosCarrinho(){

        double totalCompra = 0.0;
        String dadosProdutos = "";
        String dadosCarrinho = "";

        for(Produto produto: produtos){

            totalCompra += produto.calcularPrecoFinal();

            dadosProdutos += produto.toString() + "\n\n";

        }

        dadosCarrinho += dadosProdutos + "Total: " + totalCompra;

        return dadosCarrinho;

    }
    
}