import java.util.Scanner;

public class Menu {
    

    private void UI(){
        System.out.println(
            "===== Agenda V3.3 =====\n"+
            "1 - Inserir\n"+
            "2 - Remover\n"+
            "3 - Listar\n"+
            "4 - Sair\n" +
            "======================");
    }

    public int grabInt(){
        int c;
        Scanner  sc = new Scanner(System.in);
        c = sc.nextInt();

        return c;
    }

    public String grabString(){
        String palavra;
        Scanner sc = new Scanner(System.in);
        
        palavra = sc.nextLine();

        return palavra;
    }

    public int grabOP(){
        UI();
        int op;
        System.out.println("Escolha uma opção:");
        op = grabInt();
        return op;

    }


}
    
   

