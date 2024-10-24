import java.util.ArrayList;

public class Disciplina {
    public String nome;
    public String codigo;
    public boolean ativa;
    private Professor professor; 
    private ArrayList<Aluno> alunos; 

    
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
}
