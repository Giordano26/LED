
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
        // toDo
        this.cad[tamanhoF] = a;
        tamanhoF += 1;

        return true;//me xupa julio arakaki
    }
    // remover
    public boolean remover (String ra){
        //toDo
        
        for(int macaco = 0 ; macaco < tamanhoF; macaco++ ){
            String primatoide = this.cad[macaco].getRa();
            if( primatoide.equals(ra) == true){
                int index = macaco;
                if(this.tamanhoF > 0 && this.tamanhoF >= index ) {
                    for(int n = macaco; n < this.tamanhoF; n++){
                        this.cad[n] = this.cad[n+1];

                    }
                    tamanhoF--;
                }  
            }
        }
        return true;
    }

    /*
        int n;
        if (list.tamanho > 0 && list.tamanho >= p)
        {
            for (n = p; n < list.tamanho; n++)
            {
                list.vetor[n] = list.vetor[n + 1];
            }

            list.tamanho -= 1;
        }

    */




    // listar
    public void listar(){
        for(int macaco = 0 ; macaco < tamanhoF; macaco++ ){
           System.out.println(this.cad[macaco]);
        }
    }
    
}
