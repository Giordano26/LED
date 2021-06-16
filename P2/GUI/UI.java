package GUI;
import javax.swing.JOptionPane;

public class UI {

    public int grabN(String msg){ //Pegar com gui algum numero inteiro
        int n;

        do{
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog(msg));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Inserção inválida", "ERRO", JOptionPane.WARNING_MESSAGE);
                continue;
            }

        }while(true);

        return n;
    }
    
    public void showMsg(String msg){ //Mostrar msg genérica
       JOptionPane.showMessageDialog(null, msg, "Josephus 2.0", JOptionPane.PLAIN_MESSAGE);
    }

    public void error(){ //mostra msg para tratamento de erro
        JOptionPane.showMessageDialog(null, "Algo deu errado", "ERRO", JOptionPane.WARNING_MESSAGE);
    }
}
