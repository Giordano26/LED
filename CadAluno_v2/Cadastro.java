/**
 * Escreva a descrição da classe Cadastro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cadastro{

    public VetDin cad;
    
    // construtor
    Cadastro(int qtde){
        this.cad = new VetDin(); 
    }
    
    // inserir
    public void inserir (Aluno a){
        this.cad.inserir(a);
    }

    // remover
    public boolean remover (String ra){
        boolean ret = false;
        int indice = buscar(ra);
        if(indice == -1){
            ExceptionCad erro = new ExceptionCad("RA inserido não consta no sistema!");
            erro.ShowException();
            return ret;
        } 
        this.cad.remover(indice);
        if (indice >= 0){
            this.cad.remover(indice);
            ret = true;
        } 
        return ret;
    }
    
    // listar
    public void listar() {
        if(cad.vazia()){ // se retorna true a lista está vazia 
            ExceptionCad erro = new ExceptionCad("A agenda não possui cadastros...");
            erro.ShowException();
        }
        System.out.println(cad.toString());
    }
    
    private int buscar(String ra) { //busca ra no vetor dinâmico
        int indice = -1;
        Object vet[] = this.cad.getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Aluno a = (Aluno) vet[i];
                if (a.getRa().equals(ra)){
                    indice = i;
                    break;
                }
            } 
        }
        return indice;
    }
}
