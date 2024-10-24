import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa {

	private String numeroMatricula;
    private boolean cursando;
    private ArrayList<Disciplina> disciplinas; 
    
    public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    static {
        alunos.add(new Aluno("Ana Silva", "123.456.789-00", 1980, "999", true));
        alunos.add(new Aluno("Carlos Souza", "234.567.890-01", 1981, "888", false));
        alunos.add(new Aluno("Beatriz Oliveira", "345.678.901-02", 1982, "777", true));
        alunos.add(new Aluno("João Santos", "456.789.012-03", 1983, "666", true));
        alunos.add(new Aluno("Mariana Lima", "567.890.123-04", 1984, "555", true));
        alunos.add(new Aluno("Lucas Costa", "678.901.234-05", 1985, "444", true));
        alunos.add(new Aluno("Fernanda Rodrigues", "789.012.345-06", 1986, "333", true));
        alunos.add(new Aluno("Ricardo Ferreira", "890.123.456-07", 1987, "222", true));
        alunos.add(new Aluno("Julia Pereira", "901.234.567-08", 1988, "111", true));
        alunos.add(new Aluno("Gustavo Almeida", "012.345.678-09", 1989, "000", true));
    }

    
    public Aluno(String nome, String cpf, int dataNascimento, String numeroMatricula, boolean cursando) {
		super(nome, cpf, dataNascimento);
		this.numeroMatricula = numeroMatricula;
		this.cursando = cursando;
		//this.disciplinas
	}

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public boolean isCursando() {
    	return cursando;
    }

    public void setCursando(boolean cursando) {
        this.cursando = cursando;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
        disciplina.adicionarAluno(this);
    }
    
    public void alteraDadosCadastrais(Scanner sc) {
		System.out.print("Digite o novo número de matrícula: ");
	    String novaMatricula = sc.nextLine();
	    this.setNumeroMatricula(novaMatricula);
	    System.out.print("Digite o novo status (true ou false): ");
	    String novoStatus = sc.nextLine();
        this.setCursando(novoStatus.equalsIgnoreCase("true"));
        System.out.println("Dados alterados com sucesso!");
    }
    
    public static void listaAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula() + " - status: " + aluno.isCursando());
        }
    }
    
    public static void buscaAlunoPorMatricula(Scanner sc) {               
        System.out.print("Digite o número de matrícula: ");
        String matriculaBusca = sc.nextLine();
        boolean encontrado = false;
        for (Aluno aluno : alunos) {
            if (aluno.getNumeroMatricula().equalsIgnoreCase(matriculaBusca)) {
                System.out.println("Aluno encontrado: " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula() + "\n");
                encontrado = true;
                System.out.println("Deseja alterar os dados cadastrais? Digite (s) se sim e (n) para não: ");
                String alterar = sc.nextLine();
                   
                if (alterar.equalsIgnoreCase("s")) {  
        	    	aluno.alteraDadosCadastrais(sc);
        	    }
            }
        }       
        
        System.out.println("\n");
        
        if (!encontrado) {
            System.out.println("Aluno não encontrado.\n");
        }
    }

    public static void buscaAlunoPorNome(Scanner sc) {      
        System.out.print("Digite o nome do aluno: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;
        for (Aluno aluno : alunos) {
        	if (aluno.getNome().equalsIgnoreCase(nomeBusca)) {
        	    System.out.println("Aluno encontrado: " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula() + "\n");
        	    encontrado = true;

        	    System.out.println("Deseja alterar os dados cadastrais? Digite (s) se sim e (n) para não: ");
        	    String alterar = sc.nextLine(); 

        	    if (alterar.equalsIgnoreCase("s")) {  
        	    	aluno.alteraDadosCadastrais(sc);
        	    }
        	}
        }
        
        System.out.println("\n");
        
        if (!encontrado) {
            System.out.println("Aluno não encontrado.\n");
            }
        
   }
        
}
