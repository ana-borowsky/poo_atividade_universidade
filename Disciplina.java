import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
    public String nome;
    public String codigo;
    public boolean ativa;
    private Professor professor; 
    private ArrayList<Aluno> alunos; 

    public Disciplina(String nome, String codigo, boolean ativa, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.ativa = ativa;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }
    
    static ArrayList<Disciplina> disciplinas = new ArrayList<>();
    
    static {    
	    disciplinas.add(new Disciplina("Performance em Sistemas Ciberfísicos", "CB010", true, null));
	    disciplinas.add(new Disciplina("Experiência Criativa", "EC789", true, null));
	    disciplinas.add(new Disciplina("Segurança da Informação", "SI576", true, null));
	    disciplinas.add(new Disciplina("Clínica TIC", "CT108", true, null));
	    disciplinas.add(new Disciplina("Programação Orientada a Objetos", "PO102", true, null));
    }
    
    public Disciplina() {
        this.alunos = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            this.alunos.add(aluno); 
        }
    }
    
    public boolean isAtiva() {
    	return ativa;
    }
    
    public static void listaDisciplinas() {
    System.out.println("\nLista de Disciplinas:");
    for (Disciplina disciplina : disciplinas) {
        String nomeProfessor = (disciplina.getProfessor() != null) ? disciplina.getProfessor().getNome() : "Sem Professor";
        System.out.println("\t - " + disciplina.nome + " - Código: " + disciplina.codigo + " - Professor: " + nomeProfessor +" - Status: " + disciplina.isAtiva());
    	}
    }
    
    public static void buscaDisciplinaPorNome(Scanner sc) {
        System.out.print("Digite o nome da disciplina: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;

        for (Disciplina disciplina : disciplinas) {
            if (disciplina.nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println("Disciplina encontrada: " + disciplina.nome + " - Código: " + disciplina.codigo + " - Status: " + (disciplina.ativa ? "ativa" : "inativa"));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Disciplina não encontrada.\n");
        }
    }

    public static void buscaDisciplinaPorCodigo(Scanner sc) {
        System.out.print("Digite o código da disciplina: ");
        String codigoBusca = sc.nextLine();
        boolean encontrado = false;

        for (Disciplina disciplina : disciplinas) {
            if (disciplina.codigo.equalsIgnoreCase(codigoBusca)) {
                System.out.println("Disciplina encontrada: " + disciplina.nome + " - Código: " + disciplina.codigo + " - Status: " + (disciplina.ativa ? "ativa" : "inativa"));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Disciplina não encontrada.\n");
        }
    }

    public static void buscaAlunoPorCodigoDisciplina(Scanner sc) {
        System.out.print("Digite o código da disciplina: ");
        String codigoBusca = sc.nextLine();
        boolean encontrado = false;

        for (Disciplina disciplina : disciplinas) {
            if (disciplina.codigo.equalsIgnoreCase(codigoBusca)) {
                System.out.println("Alunos matriculados em " + disciplina.nome + ":");
                for (Aluno aluno : disciplina.getAlunos()) {
                    System.out.println("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula());
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum aluno encontrado na disciplina com código " + codigoBusca + ".\n");
        }
    }

    public static void buscaAlunoPorNomeDisciplina(Scanner sc) {
        System.out.print("Digite o nome da disciplina: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;

        for (Disciplina disciplina : disciplinas) {
            if (disciplina.nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println("Alunos matriculados em " + disciplina.nome + ":");
                for (Aluno aluno : disciplina.getAlunos()) {
                    System.out.println("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula());
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum aluno encontrado na disciplina com nome " + nomeBusca + ".\n");
        }
    }

}
