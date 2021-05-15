/**
 * @author julio
 * Classe para representar uma pessos
 */
public class Pessoa implements java.io.Serializable{
    // Atributos de uma pessoa
    private NomePessoa nome;
    private int idade;
    private String rg;
    private double peso;
    private double altura;

    /**
     * Construtor da classe pessoa
     * @param String nome - nome da pessoa
     * @param int idade - idade da pessoa
     * @param String rg - rg da pessoa
     * @param double peso - peso da pessoa
     * @param double altura - altura da pessoa
     */
    public Pessoa(String nome, int idade, String rg, double peso, double altura) {
        this.nome = new NomePessoa(nome); 
        this.idade = idade;
        this.rg = rg;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome.getNome().getTxt();
    }

    /**
     * @param nome the nome to set
     */
    protected void setNome(String nome) {
        this.nome.setNome(nome);
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    protected void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    protected void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    protected void setPeso(double peso) {
        this.peso = peso;
    }
    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    protected void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Retorna os atributos como string
     */
    public String toString(){
        return("\nNome: " + getNome() + "\nIdade: " + getIdade()+ "\nRg: " + getRg()+ "\nPeso: " + getPeso()+ "\nAltura: " + getAltura());
    }

}
