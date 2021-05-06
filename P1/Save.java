import java.io.*;

import javax.swing.JOptionPane;

public class Save {
    public void saveData(String imc, String categoria) {
        File file = null;
        String arquivo = null;
        String sn = "S";

        JOptionPane.showMessageDialog(null, "O salvamento de dados começará", "Salvamento", JOptionPane.PLAIN_MESSAGE);

        do {
            arquivo = JOptionPane.showInputDialog("Arquivo: ");
            file = new File(arquivo);
            if (file.exists()) {
                sn = JOptionPane.showInputDialog("Arquivo: " + arquivo + " ja existe, pode sobrescreve-lo?(s/n): ");
            }

        } while(sn.toUpperCase().charAt(0) == 'N');

        char separador = '|'; // caractere que sera utilizado para separar os dados

        // Classes de gravacao de dados
        PrintWriter pw = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
        } catch(IOException ex) {
            System.out.println("Nao conseguiu abrir o arquivo: " + arquivo);
            return;
        } catch(Exception ex) {
            System.out.println("Erro inesperado ao tentar abrir o arquivo: " + arquivo);
            return;
        }

        // Dados a serem gravados
        
        String s = JOptionPane.showInputDialog("Forneça o nome do paciente: ");

        // Gravacao dos dado no arquivo
        try {
         //para gravar algumas linhas
                pw.print(s);
                pw.print(separador);

                pw.print(imc);
                pw.print(separador);

                pw.print(categoria);
                pw.println(separador); // muda de linha
            
        } catch(Exception ex) {
            System.out.println("Erro inesperado ao tentar escrever no arquivo: " + arquivo);
            return;
        } finally {
            try {
                pw.close();
            } catch(Exception ex) {
                // Nao faz nada!
            }
            try {
                fos.close();
            } catch(Exception ex) {
                // Nao faz nada!
            }
        }
    }
}
