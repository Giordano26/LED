
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
        this.cad[this.tamanhoF] = a;
        this.tamanhoF += 1;

        return true;
    }
    // remover
    public boolean remover (String ra){
        
        for(int s = 0 ; s < this.tamanhoF; s++ ){
            String comp = this.cad[s].getRa();
            if( comp.equals(ra) == true){
                int index = s;
                if(this.tamanhoF > 0 && this.tamanhoF >= index ) {
                    for(int n = s; n < this.tamanhoF; n++){
                        this.cad[n] = this.cad[n+1];

                    }
                    this.tamanhoF--;
                }  
            }
        }
        return true;
    }

    // listar
    public void listar(){
        if(this.tamanhoF == 0){
            System.out.println("LISTA VAZIA!!!");
        }
        else{
            System.out.println("=============================");
        for(int s = 0 ; s < this.tamanhoF; s++ ){
           System.out.println((s+1)+" - "+this.cad[s]);
        }
            System.out.println("=============================");
        }
    }
    
}
