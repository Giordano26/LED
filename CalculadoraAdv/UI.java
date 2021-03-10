

public class UI {
    
    public static void menu(){
        System.out.println(
            "===== Calculadora =====\n"+
            "+ Adição\n"+
            "- Subtração\n"+
            "* Multiplicação\n"+
            "/ Divisão\n"+
            "r Raiz\n"+
            "p Potênciação\n"+
            "Digite 'e' para sair\n"+
            "======================");
    }

    public static void showResult(double resultado){

        System.out.printf("Resultado: %.2f\n", resultado);


    }
}
