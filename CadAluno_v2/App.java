/*
GRUPO:
Antonio Mello Babo
Enzo Maneira Canatella Madalena
Lucas Benicio Lima
Stefano Martins Ferreira Giordano
*/

public class App{
    public static void main(String args[]){

        Menu menu = new Menu(); //cria o objeto de menu (interface)

        Cadastro cadAlunos = new Cadastro(); //cadastro começa com 0 pois aumenta conforme cada inserção

        while(true){
            int op = 0;
            do{
                try{
                    op = menu.grabOP();
                    break;

                }catch(Exception e){
                    System.out.println("Opção inválida!");
                    continue;
                }

            }while(true);
            switch(op){

                // Inserir na agenda 
                case 1: 
                int idade,ano,sem;
                String nome, RA;
    
                System.out.println("Digite o nome a ser cadastrado: ");
                nome = menu.grabString();

                do{
                    System.out.println("Digite a idade: ");
                    try {
                        idade = Integer.parseInt(menu.grabString());
                        break;
                    }catch (Exception e) {
                        ExceptionCad erro = new ExceptionCad("Idade inválida!");
                        erro.ShowException();
                        continue;
                    }
                }while(true);
                

                System.out.println("Digite o RA: ");
                RA = menu.grabString();

                do{
                    System.out.println("Digite o ano de ingresso: ");
                    try {
                        ano = Integer.parseInt(menu.grabString());
                        break;
                    }catch (Exception e) {
                        ExceptionCad erro = new ExceptionCad("Ano inválido!");
                        erro.ShowException();
                        continue;
                    }
                }while(true);


                do{
                    System.out.println("Digite o semestre atual: ");
                    try {
                        sem = Integer.parseInt(menu.grabString());
                        break;
                    }catch (Exception e) {
                        ExceptionCad erro = new ExceptionCad("Semestre inválido!");
                        erro.ShowException();
                        continue;
                    }
                }while(true);



                Aluno a = new Aluno(nome, idade, RA, ano, sem);
                cadAlunos.inserir(a);
                System.out.println("Aluno "+ nome + " cadastrado com sucesso");
                break;

                //Remover da agenda 
                case 2: 
                System.out.println("Digite o RA a ser removido");
                String ra = menu.grabString().toUpperCase();
                boolean test = cadAlunos.remover(ra);
                if(test)
                    System.out.println("RA: "+ra+" removido!");
                break;

             
                //Lista os contatos
                case 3:
                cadAlunos.listar();
                break;


                //Saída
                case 4:
                System.out.println("Saída Solicitada");
                System.out.println("Saindo...");
                System.exit(0);


                default:
                System.out.println("Opção Inválida!");
      
            }
        }
    }
        
        
}

