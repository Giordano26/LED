public class App{
    public static void main(String[] args){
        IU menu = new IU();
        IMC imc = new IMC();
        Save s = new Save();

        double peso = menu.grabPeso();
        double altura = menu.grabAltura();

        double resultado = imc.imcCalc(peso, altura);
        String resultado1 = String.format("%.2f",resultado);

        String categoria = imc.categoria(resultado);

        menu.showResult(categoria, resultado1);

        if(!resultado1.equals("-666,00"))
            s.saveData(resultado1, categoria);

    }
}