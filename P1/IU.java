import javax.swing.JOptionPane;

public class IU {
    public void showResult(String msg, String imc){
    
    if( !imc.equals("-666,00")){
        JOptionPane.showMessageDialog(null, "IMC: " + imc, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }

    JOptionPane.showMessageDialog(null, "Categoria: " + msg, "Resultado", JOptionPane.PLAIN_MESSAGE);

    }

    public double grabAltura(){
        double n;
        do{
            try{
                n = Double.parseDouble(JOptionPane.showInputDialog("Forneça a altura (Em metros)"));
                break;

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Dados inválidos", "ERRO", JOptionPane.WARNING_MESSAGE);
                continue;
            }
        }while(true);

        return n;

    }

    public double grabPeso(){
        double n;
        do{
            try{
                n = Double.parseDouble(JOptionPane.showInputDialog("Forneça o peso (Em kg)"));
                break;

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Dados inválidos", "ERRO", JOptionPane.WARNING_MESSAGE);
                continue;
            }
        }while(true);

        return n;

    }



}
