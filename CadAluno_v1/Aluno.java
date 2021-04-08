
/**
 * Escreva a descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Aluno extends Pessoa {
    // Atributos
    private String ra;
    private int anoIngresso;
    private int periodo;
    private Disciplina disciplinas[];
    
    Aluno (String nome, int idade, String ra, int anoIng, int periodo){
        // chama construtor da classe pai
        super(nome, idade); // envia dados para a classe pa (Pessoa)
        this.ra = ra;
        this.anoIngresso = anoIng;
        this.periodo = periodo;
        
    }
    public String getRa(){
        return this.ra;
    }
    
    public String toString(){
        // formata os dados do aluno
        
        String dados = "Nome: " + super.toString() +" Ra: " + getRa();
        
        return dados;
    }
}
