import javax.swing.JFrame;

public class Aplicacao {
    /**
     * @param args
     */
    
    public static void main(String[] args) {
        ConversorCF cv = new ConversorCF("ZE DA SILVA");
        cv.setVisible(true);
        cv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
