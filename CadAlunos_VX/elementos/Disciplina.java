package elementos;

/**
 * Escreva a descrição da classe Disciplina aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Disciplina {
    NomeDisc nome;
    String sigla;
    float nota;

    public Disciplina(String nome, String sigla, float nota) {
        this.nome = new NomeDisc(nome);
        this.sigla = sigla;
        this.nota = nota;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome.getNome();
    }

    /**
     * @param nome the nome to nome
     */
    protected void setNome(String nome) {
        this.nome.setNome(nome);
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }
    /**
     * @param sigla the nome to sigla
     */
    protected void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the nota
     */
    public float getNota() {
        return nota;
    }

    /**
     * @param idade the nota to set
     */
    protected void setNota(float nota) {
        this.nota = nota;
    }


    /**
     * Retorna os dados como string
     */
    public String toString(){
        return("\n" + getNome() + " (" + getSigla()+ "), Nota: " + getNota());
    }

}
