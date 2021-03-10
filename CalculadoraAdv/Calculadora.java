//Controller - Método com todas funções aritméticas usadas pela calculadora 

import java.lang.Math;
import java.util.Scanner;


public class Calculadora{

    public static char grabOP(){

        char op;

        Scanner sc = new Scanner(System.in);
        
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



    public static double[] grabN(){

        double[] numbers = {0,0};
        String n1,n2;

        
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o primeiro número:");
                n1 = sc.nextLine();
                numbers[0] = Double.parseDouble(n1);
                System.out.println("Digite o segundo número: ");
                sc = new Scanner(System.in);
                n2 = sc.nextLine();
                numbers[1] = Double.parseDouble(n2);
                break;
                
            }catch(Exception e){
                System.out.println("Entrada inválida");
                continue;
            }
        }while(true);

       

        return numbers;
    }


    public static double grabNR(){
        double nD = 0;
        String n1;
        Scanner sc = new Scanner(System.in);

        do{
            try{
                System.out.println("Digite um número:");
                n1 = sc.nextLine();
                nD = Double.parseDouble(n1);
                break;
            }catch(Exception e){
                System.out.println("Entrada inválida");
                continue;
            }
        }while(true);

       

        return nD;
        
    }


    public static double calculo(){
        
        char op;
        double[] numbers;
        double n1,n2;
        
        do{

            UI.menu();
            op = grabOP();
    
            switch(op){
                case '+': 
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                return n1+n2;
                
                          
                case '-': 
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                return n1-n2;
                
                          
                case '/':
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                
                if(n2 == 0){
                    System.out.println("Divisão por zero impossível!\nDigite outro valor...");
                    continue;
                }else{
                    return n1/n2;
                }
              

                case '*':
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                return n1*n2;
                

                case 'p': 
                numbers = grabN();
                n1 = numbers[0];
                n2 = numbers[1];
                return Math.pow(n1,n2);
                
                case 'r':
                return Math.sqrt(grabNR());

                case 'e':
                System.out.println("Saída requisitada... Desligando!");
                System.exit(0);

                default:
                System.out.println("Operação Inválida!");
                continue;
       
                }
                
        }while(true);
        
            
    }



}


