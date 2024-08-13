import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private int codigo;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Double> notas = new ArrayList<>();

    Disciplina(String nome, Professor professor, int codigo){

        this.nome = nome;
        this.professor = professor;
        this.codigo = codigo;

    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void matricularAluno(Aluno aluno){

        alunos.add(aluno);
        notas.add(null);

    }

    public boolean atribuirNotaAluno(Aluno aluno, double nota){

        int index = alunos.indexOf(aluno);

        if(index != -1){

            notas.set(index, nota);

            return true;

        }

        return false;

    }

    public String retornarResultado(){

        String resultado = "";
        int index = 0;

        resultado += "Nome: " + this.nome + "\nCódigo: " + this.codigo + "\nProfessor responsável: " 
        + this.professor.getNome() + "Alunos:\n";

        for(Aluno aluno: alunos){

            resultado += aluno.toString() + "\nNota: " + this.notas.get(index) + "\n\n";

            index++;

        }

        return resultado;

    }
    
}
