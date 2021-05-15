package elementos;

/**
 * Escreva a descrição da classe NomeDisc aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class NomeDisc extends Texto{
    private String nome;
    
    public NomeDisc(String nome){
        super(nome);
        setNome(getTxt());
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

}
