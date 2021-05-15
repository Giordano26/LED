/*
GRUPO:
Antonio Mello Babo
Enzo Maneira Canatella Madalena
Lucas Benicio Lima
Stefano Martins Ferreira Giordano
*/

//ATENÇÃO --> NÃO DELETAR O ARQUIVO Cadastros.txt

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.StringTokenizer;


//ATENÇÃO --> NÃO DELETAR O ARQUIVO Cadastros.txt
public class App{
    public static void main(String args[]){

        Menu menu = new Menu(); //cria o objeto de menu (interface)

        Cadastro cadAlunos = new Cadastro(); //cadastro começa com 0 pois aumenta conforme cada inserção

        System.out.println("Iniciado carregamento de dados");
                BufferedReader br = null;
                FileReader fr = null;
                File file = new File("Cadastros.txt");

                try {
                    fr = new FileReader(file);
                    br = new BufferedReader(fr);
                } catch(FileNotFoundException ex) {
                    System.out.println("Arquivo de cadastro inexistente!");
                } catch(Exception ex) {
                    System.out.println("Erro inesperado ao tentar abrir o arquivo de cadastro");
                    ex.printStackTrace();
                }

                try{
                    String nomeS = "";
                    int idadeS = 0;
                    String raS = "";
                    int anoS = 0;
                    int semestre = 0;

                    String line = br.readLine();

                    while(line != null && !line.equals("")){ // evita erro de carregamento se a linha for vazia ou a ultima
                        String separadores = "\n" + "|";
                        StringTokenizer st = new StringTokenizer(line, separadores);
                        //nome
                        if(st.hasMoreTokens()){
                            nomeS = st.nextToken();
                            if(nomeS.equals("GEIST") || nomeS.equals("")){
                                //System.out.println(nomeS);
                                break;
                            }
                        }else{
                            System.out.println("Erro na leitura do nome");
                        }

                        //idade
                        if(st.hasMoreTokens()){
                            idadeS = Integer.parseInt(st.nextToken());
                        }else{
                            System.out.println("Erro na leitura de idade");
                        }

                        //ra
                        if(st.hasMoreTokens()){
                            raS = st.nextToken();
                        }else{
                            System.out.println("Erro na leitura do RA");
                        }

                        //Ano de ingresso
                        if(st.hasMoreTokens()){
                            anoS = Integer.parseInt(st.nextToken());
                        }else{
                            System.out.println("Erro na leitura do ano de ingresso");
                        }

                        //periodo
                        if(st.hasMoreTokens()){
                           semestre = Integer.parseInt(st.nextToken());
                        }

                        Aluno a2 = new Aluno(nomeS, idadeS, raS, anoS, semestre); //cria o objeto aluno

                        cadAlunos.inserir(a2); //insere a nova leitura de aluno
                       // System.out.println("Aluno " + nomeS+" Carregado");

                        line = br.readLine(); //vai pra próxima linha
                    }
                
                } catch(EOFException ex) {
                    System.out.println("Atingiu prematuramente o final do arquivo");
                    return;
                } catch(IOException ex) {
                    System.out.println("Nao conseguiu ler do arquivo");
                    return;
                } catch(Exception ex) {
                    System.out.println("Erro inesperado ao tentar ler o arquivo");
                    ex.printStackTrace();
                    return;
                } finally {
                    try {
                        br.close();
                    } catch(Exception ex) {
                        // Nao faz nada !
                    }
                    try {
                        fr.close();
                    } catch(Exception ex) {
                        // Nao faz nada !
                    }
                }
                System.out.println("Carregamento de dados terminado. ");

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

            Path path = Paths.get("Log.txt");
                try{
                    if(Files.exists(path)){
                        try{
                            FileWriter stream = new FileWriter("Log.txt",true);
                            BufferedWriter out = new BufferedWriter(stream);
    
                            String text = String.format("%d", op);
                            out.write("Operação Selecionada:" + text);
                            out.newLine();
                            out.close();
                        }catch(IOException e){
                            e.printStackTrace();
                        }
                    } else{
                        PrintWriter out = new PrintWriter("Log.txt");
                        String text = String.format("%d", op);
                        out.write("Operação Selecionada:" + text+"\n");
                        out.close();
                    } 

                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
               
            
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
                Path path2 = Paths.get("Log.txt");
                char separador = '|';
                try{
                    if(Files.exists(path2)){
                        try{
                            FileWriter stream = new FileWriter("Log.txt",true);
                            BufferedWriter out = new BufferedWriter(stream);
    
                            String text = nome + separador + idade + separador + RA + separador + ano + separador + sem;
                            out.write("Cadastro realizado: " + text);
                            out.newLine();
                            out.close();
                        }catch(IOException e){
                            e.printStackTrace();
                        }
                    } else{
                        PrintWriter out = new PrintWriter("Log.txt");
                        String text = nome + separador + idade + separador + RA + separador + ano + separador + sem;
                        out.println("Cadastro realizado: " +text);
                        out.close();
                    } 

                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
               

                cadAlunos.inserir(a);
                System.out.println("Aluno "+ nome + " cadastrado com sucesso");
                break;

                //Remover da agenda 
                case 2: 
                System.out.println("Digite o RA a ser removido");
                String ra = menu.grabString().toUpperCase();
                Path path3 = Paths.get("Log.txt");
                try{
                    if(Files.exists(path3)){
                        try{
                            FileWriter stream = new FileWriter("Log.txt",true);
                            BufferedWriter out = new BufferedWriter(stream);
    
                            String text = ra;
                            out.write("Tentativa de remoção de RA:" + text);
                            out.newLine();
                            out.close();
                        }catch(IOException e){
                            e.printStackTrace();
                        }
                    } else{
                        PrintWriter out = new PrintWriter("Log.txt");
                        String text = ra;
                        out.write("Tentativa de remoção de RA:" + text+"\n");
                        out.close();
                    } 

                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
                boolean test = cadAlunos.remover(ra);
                if(test)
                    System.out.println("RA: "+ra+" removido!");

                
                break;

             
                //Lista os contatos
                case 3:
                System.out.println("NOME | IDADE | RA |ANO DE INGRESSO | SEMESTRE");
                System.out.println("==============================================");
                cadAlunos.listar();
                System.out.println("==============================================");

                break;

                //Saída com salvamento de dados
                case 4:
                System.out.println("Saída Solicitada");
                System.out.println("Iniciando salvamento...");
                try{
                    PrintWriter out = new PrintWriter("Cadastros.txt");
                    String text = cadAlunos.SaveData();
                    out.write(text);
                    out.close();

                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }   
                System.out.println("Salvamento Terminado.");
                System.out.println("Saindo...");
                System.exit(0);


                default:
                System.out.println("Opção Inválida!");
      
            }
        }
    }
        
        
}

