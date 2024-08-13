public class Professor extends Pessoa{

    private String nomeDepartamento;

    Professor(String nome, String cpf, String nomeDepartamento){

        super(nome,cpf);

        this.nomeDepartamento = nomeDepartamento;

    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    @Override
    public String toString(){

        return super.toString() + "\nDepartamento: " + this.nomeDepartamento;

    }
    
}
