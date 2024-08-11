public abstract class Produto{

    protected String nomeProduto;
    protected double preco;
    protected int qtd;

    Produto(String nome, double preco){

        nomeProduto = nome;
        this.preco = preco;

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString(){

        return "Produto: " + this.nomeProduto + "\nPreço unitário: " + this.preco + "\nQuantidade pedida: " + this.qtd;

    }

    public abstract double calcularPrecoFinal();
    
}