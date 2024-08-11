public class ProdutoNormal extends Produto{

    ProdutoNormal(String nome, double preco){

        super(nome, preco);

    }

    public double calcularPrecoFinal(){

        return preco * qtd;

    }
    
}