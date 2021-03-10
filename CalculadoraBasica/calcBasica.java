import java.util.Scanner;

public class calcBasica {

   
    public static void main(String args[]) {

        funcs c = new funcs();

        int opcao;
        double num1;
        double num2;

        Scanner input = new Scanner(System.in);
        System.out.println("-Escolha uma opção-");
        System.out.println("1. Fazer Soma");
        System.out.println("2. Fazer Subtracao");
        System.out.println("3. Fazer Multiplicacao");
        System.out.println("4. Fazer Divisão");
        System.out.println("0. Sair");

        System.out.println("Operação: ");
        opcao = input.nextInt();
        
        while (opcao != 0) {
            Scanner input1 = new Scanner(System.in);
            
            System.out.println("Digite o primeiro numero: ");
            num1 = input1.nextDouble();
            System.out.println("Digite o segundo numero: ");
            num2 = input1.nextDouble();
            input1.close();
                
            if (opcao == 1) {
                double resultado = c.somar(num1, num2);
                System.out.printf("%.2f\n", resultado);
                break;
            } else if (opcao == 2) {
                double resultado = c.subtrair(num1, num2);
                System.out.printf("%.2f\n", resultado);
                break;
            } else if (opcao == 3) {
                double resultado = c.multiplicar(num1, num2);
                System.out.printf("%.2f\n", resultado);
                break;
            } else if (opcao == 4) {
                double resultado = c.divisao(num1, num2);
                System.out.printf("%.2f\n", resultado);
                break;
            } else {
                System.out.println("Erro");
                break;
            }
            
        }
        input.close();
    }
}
