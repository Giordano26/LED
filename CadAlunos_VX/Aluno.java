import elementos.*;

/**
 * @author julio
 *
 */

public class Aluno extends Pessoa {
    private String ra;
    private int semestre;
    private Disciplinas disciplinas;
    
    public Aluno(String nome, int idade, String rg, String ra, 
                              int semestre, Disciplinas disciplinas) {
        super(nome, idade, rg);
        setRa(ra);
        setSemestre(semestre);
        setDisciplinas(disciplinas);
    }

    public Aluno(String nome, int idade, String rg, String ra, int semestre) {
        super(nome, idade, rg);
        setRa(ra);
        setSemestre(semestre);
        this.disciplinas = new Disciplinas();
    }
    
    /**
     * @return the ra
     */
    public String getRa() {
        return this.ra;
    }

    /**
     * @param _prontuario the ra to set
     */
    public void setRa(String ra) {
        this.ra = ra;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @return disciplinas
     */
    public Disciplinas getDisciplinas() {
        return this.disciplinas;
    }

    /**
     * @param _serie the _semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return disciplinas
     */
    public void setDisciplinas(Disciplinas disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public String toString(){
        return(super.toString() + "\nRA: " + getRa() + "\nSerie: " + 
                getSemestre() + getDisciplinas().toString());
    }
    

}
