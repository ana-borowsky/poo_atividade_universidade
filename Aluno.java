import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private String numeroMatricula;
    private boolean cursando;
    private ArrayList<Disciplina> disciplinas; 

   
    public Aluno() {
        this.disciplinas = new ArrayList<>();
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
}
