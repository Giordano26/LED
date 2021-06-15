import App.Josephus;
import GUI.UI;

public class Main {
    public static void main(String args[]){
        Josephus app = new Josephus();
        UI op = new UI();
        
        int n = op.grabN("Numero de individuos");
        int m = op.grabN("Valor do intervalo");


        app.JosephusMain(m, n);
    }
}
