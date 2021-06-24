package src.UI;
import javax.swing.JOptionPane;

public class UI {

    public int grabN(String msg){ //Pegar com gui algum numero inteiro
        int n;
        String quit = null;

        do{
            try {
                quit = JOptionPane.showInputDialog(msg);
                if(quit == null)  //para fechar o prompt sem erros
                System.exit(0); 
               n = Integer.parseInt(quit);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Inserção inválida", "ERRO", JOptionPane.WARNING_MESSAGE);
                continue;
            }

        }while(true);

        return n;
    }
    
    public void showMsg(String msg){ //Mostrar msg genérica
       JOptionPane.showMessageDialog(null, msg, "Intersecção", JOptionPane.PLAIN_MESSAGE);
    }

    public void error(){ //mostra msg para tratamento de erro
        JOptionPane.showMessageDialog(null, "Algo deu errado", "ERRO", JOptionPane.WARNING_MESSAGE);
    }
}