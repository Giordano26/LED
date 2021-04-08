
/**
 * Escreva a descrição da classe Cadastro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cadastro{
    // Atributos
    // armazenador
    private Aluno cad[]; // vetor para armazenar os alunos
    private int tamanhoF = 0;
    
    // construtor
    Cadastro(int qtde){
        cad = new Aluno[qtde];
    }
    
    // inserir
    public boolean inserir (Aluno a){
        this.cad[tamanhoF] = a;
        tamanhoF += 1;

        return true;
    }
    // remover
    public boolean remover (String ra){
        
        for(int s = 0 ; s < tamanhoF; s++ ){
            String primatoide = this.cad[s].getRa();
            if( primatoide.equals(ra) == true){
                int index = s;
                if(this.tamanhoF > 0 && this.tamanhoF >= index ) {
                    for(int n = s; n < this.tamanhoF; n++){
                        this.cad[n] = this.cad[n+1];

                    }
                    tamanhoF--;
                }  
            }
        }
        return true;
    }

    // listar
    public void listar(){
        for(int s = 0 ; s < tamanhoF; s++ ){
           System.out.println(this.cad[s]);
        }
    }
    
}
