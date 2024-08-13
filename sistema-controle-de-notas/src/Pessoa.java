public class Pessoa {

    protected String nome;
    protected String cpf;

    Pessoa(String nome, String cpf){

        this.nome = nome;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString(){

        return "Nome: " + this.nome + "\nCPF: " + this.cpf; 

    }
    
}
