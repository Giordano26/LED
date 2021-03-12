//Controller - Método com todas funções aritméticas usadas pela calculadora 

import java.lang.Math;
import java.util.Scanner;


public class Calculadora{

    public static char grabOP(){

        char op; //char para opção

        Scanner sc = new Scanner(System.in); //inicialização do scanner
        
        //teste para obter apenas o input de um char, caso não retorna erro e pede a entrada novamente 
        do{
            try {
                System.out.println("Digite a operação: ");
                op = sc.next().charAt(0);
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida!");
                continue;
            }

        }while(true);


       

        return op;

    
    }


    //método q retorna um array do tipo double com os dois numeros que serão utilizados para o cálculo
    public static double[] grabN(){

        double[] numbers = {0,0};
        String n1,n2;

        
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o primeiro número:");
                n1 = sc.nextLine(); //funcinou apenas pegando o numero em string e depois o convertendo para double
                numbers[0] = Double.parseDouble(n1);
                System.out.println("Digite o segundo número: ");
                sc = new Scanner(System.in);
                n2 = sc.nextLine();
                numbers[1] = Double.parseDouble(n2);
                break;
                
            }catch(Exception e){
                System.out.println("Entrada inválida"); //aqui retorna erro se a conversão para double não for possível
                continue;
            }
        }while(true);

       

        return numbers;
    }

    //Função com retorno de um unico numero para as contas, para operações q requerem apenas 1 número ex: sqrt()
    public static double grabNR(){
        double nD = 0;
        String n1;
        Scanner sc = new Scanner(System.in);

        do{
            try{
                System.out.println("Digite um número:");
                n1 = sc.nextLine();// o mesmo vale aqui, so funcinou quando se deu parse para double de string 
                nD = Double.parseDouble(n1);
                break;
            }catch(Exception e){
                System.out.println("Entrada inválida"); //aqui tambem retorna erro caso a conversão não seja possível
                continue;
            }
        }while(true);

       

        return nD;
        
    }


    public static double calculo(){
        
        char op; //char que vem da operação selecionada para dar a instrução no switch
        double[] numbers; //variavel para o retorno do array cm os dois numeros para algumas operações
        double n1,n2; //variavel singular para cada número retirado do array n1 = numbers [0], ou para apenas um numero ex: sqrt()
        int nIn; //variavel de numero inteiro para funções q requerem inteiro ex: fatorial
        double dg,rad; //variavel para as funções trigonométricas, é necessario a passagem do angulo em radianos
        
        do{

            UI.menu(); //abre o painel com as opções
            op = grabOP(); //verifica se a opção selecionada é um char e a armazena 
    
            switch(op){

                //operação de soma
                case '+': 
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                return n1+n2;
                
                //operação de subtração      
                case '-': 
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                return n1-n2;
                
                //operação de divisão        
                case '/':
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                
                //tratamento de erro para divisão impossivel, em tipo double n/0 = Infinito
                if(n2 == 0){
                    System.out.println("Divisão por zero impossível!\nDigite outro valor..."); 
                    continue;
                }else{
                    return n1/n2;
                }
              
                //operação de multiplicação
                case '*':
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                return n1*n2;
                
                //caso de potenciação por um n2 escolhido 
                case 'p': 
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                return Math.pow(n1,n2);
                
                //operação de fatorial
                case 'f':
                int fact = 1;
                n1 = grabNR(); 
                nIn = (int) n1;
                for(int i = 1; i <= nIn; i++){ // 5*4*3*2*1
                    fact = fact * i;
                }
                return fact;

                //operação de inversão
                case 'i':
                n1 = grabNR();
                nIn = (int) n1;
                return 1/n1;

                //operação para calculo do cosseno
                case 'c': 
                dg = grabNR();
                rad = Math.toRadians(dg); //passagem para radianos da entrada em graus 
                return Math.cos(rad); //calculo utilizando radianos

                //operação para calculo de seno
                case 's': 
                dg = grabNR();
                rad = Math.toRadians(dg);//passagem para radianos da entrada em graus 
                return Math.sin(rad);//calculo utilizando radianos
                
                //operação de raiz quadrada
                case 'r':
                return Math.sqrt(grabNR());

                //caso para requisitar a saída do programa
                case 'e':
                System.out.println("Saída requisitada... Desligando!");
                System.exit(0);

                //retorna um erro caso seja digitado algum char que não corresponde ao das opções mostradas
                default:
                System.out.println("Operação Inválida!");
                continue;
       
                }
                
        }while(true);
        
            
    }



}


