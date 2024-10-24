import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa {
	private String codigoRH;
    private String titulo;
	
    public Professor(String nome, String cpf, int dataNascimento, String codigoRH, String titulo) {
		super(nome, cpf, dataNascimento);
	}

    private static ArrayList<Professor> professores = new ArrayList<>();

    static {
    	
        professores.add(new Professor("Marina", "123.456.789-01", 1980, "Mestre", "RH001"));
        professores.add(new Professor("Alison", "234.567.890-12", 1975, "Mestre", "RH002"));
        professores.add(new Professor("Andrey", "345.678.901-23", 1982, "Mestre", "RH003"));
        professores.add(new Professor("Jonathan", "456.789.012-34", 1985, "Mestre", "RH004"));
        professores.add(new Professor("Pedro", "567.890.123-45", 1979, "Mestre", "RH005"));
    }
  
    public String getCodigoRH() {
        return codigoRH;
    }

    public void setCodigoRH(String codigoRH) {
        this.codigoRH = codigoRH;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public static void listaProfessores(Scanner sc) {
	    System.out.println("Lista de Professores:");
	    for (Professor professor : professores) {
	        System.out.println("\t - " + professor.getNome() + " - Código: " + professor.getCodigoRH() + " - Titularidade: " + professor.getTitulo());
	    }
    }

}
