
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Pessoa {
    // atributos
    private NomePessoa nome;
    private int idade;
    
    //Construtor
    Pessoa (String nome, int idade){
        this.nome = new NomePessoa(nome);
        this.idade = idade;
    }
    
    public String toString(){
        return this.nome.getNome().getTxt();
    } 

    public String SIdade(){
        return String.format("%d", this.idade);
    }

 
}
