import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static final ArrayList<Pessoa> alunos = new ArrayList<>();
    public static final ArrayList<Pessoa> professores = new ArrayList<>();
    public static ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        boolean sairDoSistema = false;

        gerarListasAlunosProfessores();

        while(!sairDoSistema){

            System.out.println("1-Criar disciplina\n2-Atribuir notas\n3-Ver resultado\n4-Sair do sistema"); 
            System.out.print("Digite o número da opção desejada: "); //pede o input com número da opção
            opcao = leitor.nextInt();

            leitor.nextLine();

            switch (opcao) {
                case 1:

                    String nome;
                    int codigo, opcaoAluno, opcaoProf, condicao = 1;

                    System.out.print("Nome da disciplina: "); //pede input do nome da disciplina 
                    nome = leitor.nextLine();
                    System.out.println(""); //quebra linha
                    //leitor.nextLine();

                    System.out.print("Código: "); //pede input do código da disciplina 
                    codigo = leitor.nextInt();
                    System.out.println(""); //quebra linha

                    leitor.nextLine();

                    mostrarLista(professores);
                    System.out.print("Digite o número do professor responsável: "); //pede input do número do professor na lista 
                    opcaoProf = leitor.nextInt();
                    System.out.println(""); //quebra linha

                    leitor.nextLine();

                    Disciplina disciplina = new Disciplina(nome, (Professor)professores.get(opcaoProf-1), codigo);

                    do{

                        mostrarLista(alunos);
                        System.out.print("Digite o número do aluno a ser matriculado: "); //pede input do número do aluno na lista 
                        opcaoAluno = leitor.nextInt();
                        System.out.println(""); //quebra linha

                        leitor.nextLine();

                        Aluno aluno = (Aluno)alunos.get(opcaoAluno-1);

                        if(disciplina.getAlunos().indexOf(aluno) != -1){

                            System.out.println("Escolha um aluno ainda não matriculado."); //avisa que o aluno já está matriculado
                            System.out.println(""); //quebra linha

                            continue;

                        }

                        disciplina.matricularAluno(aluno);

                        System.out.println("Aluno matriculado com sucesso!"); //imprime mensagem de sucesso

                        System.out.print("Deseja adicionar mais um aluno?\n1-Sim\n0-Não\n: "); //pergunta se quer adicionar outro aluno
                        condicao = leitor.nextInt();

                        leitor.nextLine();
                        System.out.println(""); //quebra linha

                    }while(condicao != 0);

                    disciplinas.add(disciplina);
                    
                    break;
                case 2:

                    double nota;

                    System.out.print("Qual o código da disciplina? "); //pede input do código da disciplina 
                    codigo = leitor.nextInt();
                    System.out.println(""); //quebra linha

                    leitor.nextLine();

                    disciplina = buscarDisciplina(codigo);

                    if(disciplina == null){

                        System.out.println("Não há disciplina com esse código."); //mensagem de fracasso
                        System.out.println(""); //quebra linha

                        break;

                    }

                    ArrayList<Aluno> alunosDisciplina = disciplina.getAlunos();

                    for(Aluno aluno: alunosDisciplina){

                        System.out.println(aluno.toString());

                        System.out.println(""); //quebra linha

                        System.out.print("Qual a nota do aluno? "); //pergunta a nota do aluno
                        nota = leitor.nextDouble();

                        leitor.nextLine();
                        System.out.println(""); //quebra linha

                        disciplina.atribuirNotaAluno(aluno, nota);

                    }
                    
                    break;
                case 3:

                    System.out.print("Qual o código da disciplina? "); //pede input do código da disciplina 
                    codigo = leitor.nextInt();
                    System.out.println(""); //quebra linha

                    leitor.nextLine();

                    disciplina = buscarDisciplina(codigo);

                    if(disciplina == null){

                        System.out.println("Não há disciplina com esse código."); //mensagem de fracasso
                        System.out.println(""); //quebra linha

                        break;

                    }

                    System.out.print(disciplina.retornarResultado());

                    break;
                case 4:

                    sairDoSistema = true;
                    
                    break;
                default:

                    System.out.println("Opção inválida.\n");
                    break;
            }

        }

        leitor.close();
        
    }

    public static void gerarListasAlunosProfessores(){

        alunos.add(new Aluno("Aluno1", "01", 0));
        alunos.add(new Aluno("Aluno2", "02", 1));
        alunos.add(new Aluno("Aluno3", "03", 2));
        alunos.add(new Aluno("Aluno4", "04", 3));
        alunos.add(new Aluno("Aluno5", "05", 4));
        alunos.add(new Aluno("Aluno6", "06", 5));

        professores.add(new Professor("Professor1", "07", "Computação"));
        professores.add(new Professor("Professor2", "08", "Computação"));
        professores.add(new Professor("Professor3", "09", "Matemática"));
        professores.add(new Professor("Professor4", "10", "Letras"));

    }

    public static void mostrarLista(ArrayList<Pessoa> pessoas){

        int index = 0;

        for(Pessoa pessoa: pessoas){

            index++;

            System.out.println(index+"-"+pessoa.toString());

        }

    }

    public static Disciplina buscarDisciplina(int codigo){

        for(Disciplina disciplina: disciplinas){

            if(disciplina.getCodigo() == codigo)
                return disciplina;

        }

        return null;

    }
    
}