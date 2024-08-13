public class Aluno extends Pessoa{

    private int numMatricula;

    Aluno(String nome, String cpf, int numMatricula){

        super(nome, cpf);

        this.numMatricula = numMatricula;

    }

    public int getNumMatricula() {
        return numMatricula;
    }

    @Override
    public String toString(){

        return super.toString() + "\nMatrícula: " + this.numMatricula;

    }
    
}
