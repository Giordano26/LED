
// Método sem retorono para mostrar a interface da calculadora
public class UI {
    
    public static void menu(){
        System.out.println(
            "===== Calculadora =====\n"+
            "+ Adição\n"+
            "- Subtração\n"+
            "* Multiplicação\n"+
            "/ Divisão\n"+
            "r Raiz\n"+
            "f Fatorial\n"+
            "i inversão\n"+
            "p Potênciação\n"+
            "c Cosseno\n"+
            "s Seno\n"+
            "Digite 'e' para sair\n"+
            "======================");
    }

    //metodo para printar o resultado obtido na função calculo
    public static void showResult(double resultado){ 

        System.out.printf("Resultado: %.2f\n", resultado);


    }
}
