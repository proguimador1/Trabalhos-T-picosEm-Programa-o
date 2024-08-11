public class ProdutoPromocional extends Produto{

    ProdutoPromocional(String nome, double preco){

        super(nome, preco);

    }

    public double calcularPrecoFinal(){

        return preco * 0.8 * qtd;

    }
    
}