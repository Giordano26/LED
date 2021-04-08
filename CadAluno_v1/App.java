
/**
 * Escreva a descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class App{
    public static void main(String args[]){
        // Instancia de Cadastro (criando objeto)
        Cadastro cadAlunos = new Cadastro(10); 
        
        // criando alunos
        Aluno a1 = new Aluno("Ze", 22, "ra1234", 2018, 7);
        Aluno a2 = new Aluno("Maria", 21, "ra4321", 2019, 6);
        Aluno a3 = new Aluno("Julio", 18, "ra1111", 2006, 3);
        
        //inserir alunos no cadastro
        cadAlunos.inserir(a1);
        cadAlunos.inserir(a2);
        cadAlunos.inserir(a3);
      
        // remover
        cadAlunos.remover("ra4321");

        
        // listar
        cadAlunos.listar();
        
        
        
    }
}
