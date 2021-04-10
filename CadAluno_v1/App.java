

/**
 * Escreva a descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class App{
    public static void main(String args[]){

        // Instancia de Cadastro (criando objeto)
        //Cadastro cadAlunos = new Cadastro(c); 
        // criando alunos

        Menu menu = new Menu();

        int c = menu.nCadastro();

        Cadastro cadAlunos = new Cadastro(c);

        while(true){
            int op = menu.grabOP();
            switch(op){
                case 1: 
                int idade,ano,sem;
                String nome, RA;
    
                System.out.println("Digite o nome a ser cadastrado: ");
                nome = menu.grabString();
                System.out.println("Digite a idade: ");
                idade = menu.grabInt();
                System.out.println("Digite o RA: ");
                RA = menu.grabString();
                System.out.println("Digite o ano de ingresso: ");
                ano = menu.grabInt();
                System.out.println("Digite o semestre atual: ");
                sem = menu.grabInt();
                Aluno a = new Aluno(nome, idade, RA, ano, sem);
                cadAlunos.inserir(a);
                System.out.println("Aluno "+ nome + " cadastrado com sucesso");
                break;
    
                case 2: 
                System.out.println("Digite o RA a ser removido");
                String ra = menu.grabString();
                cadAlunos.remover(ra);
                System.out.println("RA: "+ra+" removido!");
                break;
    
                case 3:
                cadAlunos.listar();
                break;
    
                case 4:
                System.out.println("Saída Solicitada");
                System.out.println("Saindo...");
                System.exit(0);
      
            }
        }
    }
        
        
}

