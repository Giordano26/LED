import java.io.*;

import javax.swing.JOptionPane;

public class ArquivoTextoOut {
    public static void main(String[] args) {
        File file = null;
        String arquivo = null;
        String sn = "S";

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
        int a = Integer.parseInt(JOptionPane.showInputDialog("Forneca um inteiro: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Forneca um double: "));
        String s = JOptionPane.showInputDialog("Forneca um texto: ");

        // Gravacao dos dado no arquivo
        try {
            for (int i = 0; i < 5; i++) { //para gravar algumas linhas
                pw.print(a);
                pw.print(separador);

                pw.print(s);
                pw.print(separador);

                pw.print(b);
                pw.println(separador); // muda de linha
            }
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
