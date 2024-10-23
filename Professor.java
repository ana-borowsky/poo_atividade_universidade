public class Professor extends Pessoa {
    private String codigoRH;
    private String titulo;
    private Disciplina disciplina;

  
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
