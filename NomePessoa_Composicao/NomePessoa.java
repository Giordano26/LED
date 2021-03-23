
/**
 * Escreva a descrição da classe NomePessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class NomePessoa{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Texto nome;

    /**
     * COnstrutor para objetos da classe NomePessoa
     */
    public NomePessoa(String nome){
        this.nome = new Texto(nome);
    }

    // getters e setters
    public Texto getNome(){
        return (this.nome);
    }  
    
    public String getNomeBibliografico(){
        String vts[] = getNome().getTxt().split(" ");
        int qtdPal = vts.length;

        String sBib = vts[qtdPal - 1] + ", " ;
        
        for(int i = 0; i < (qtdPal - 1); i++){
            String Pal = vts[i].toLowerCase();
            if(!eProposicao(Pal)){
                sBib = sBib + vts[i].toUpperCase().charAt(0)+". ";
            }
        }
        
        return sBib;
    }

    private boolean eProposicao(String s){
        final String prep[] = {"da","di","de","do","das","dos",};

        for(int i = 0; i < prep.length; i++){
            if(prep[i].equals(s)){
                return true;
            }
        }

        return false;
    }

}
