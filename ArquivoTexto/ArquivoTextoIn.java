import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
public class ArquivoTextoIn {
    public static void main(String[] args) {

        File file = null;
        String arquivo = null;
        boolean repetir = false;

        // Faz leitura do nome do arquivo
        do {
            repetir = false;
            arquivo = JOptionPane.showInputDialog("Arquivo: ");
            file = new File(arquivo);
            if (!file.exists()) { // Verifica se o qruivo existe
                String sn = JOptionPane.showInputDialog("Arquivo:" + arquivo + " inexistente, deseja tentar de novo?(s/n): ");
                if (sn.toUpperCase().charAt(0) == 'S') {
                    repetir = true;
                } else {
                    System.exit(0);
                }
            }
        } while(repetir);

        // Classes para leitura de dados
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
        } catch(FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: " + arquivo);
            return;
        } catch(Exception ex) {
            System.out.println("Erro inesperado ao tentar abrir o arquivo: " + arquivo);
            ex.printStackTrace();
            return;
        }

        // Leitura de dados
        try {
            String line = br.readLine();
            while(line != null) { // Enquanto existir linha no arquivo
                String separadores = "\n"+ "|"; //"\t\n\r\f"+ "|";
                StringTokenizer st = new StringTokenizer(line, separadores);

                // inteiro
                if (st.hasMoreTokens()) {
                    String tok = st.nextToken();
                    int a = Integer.parseInt(tok);
                    System.out.println("Leu o inteiro: " + a + " do disco");
                } else {
                    throw new DadosIncorretosException();
                }

                // String    
                if (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    System.out.println("Leu o String: " + s + " do disco");
                } else {
                    throw new DadosIncorretosException();
                }

                // double
                if (st.hasMoreTokens()) {
                    String tok = st.nextToken();
                    double b = Double.parseDouble(tok);
                    System.out.println("Leu o double: " + b + " do disco");
                } else {
                    throw new DadosIncorretosException();
                }

                line = br.readLine(); // Le a proxima linha
            }

        } catch(DadosIncorretosException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return;
        } catch(EOFException ex) {
            System.out.println("Atingiu prematuramente o final do arquivo: " + arquivo);
            return;
        } catch(IOException ex) {
            System.out.println("Nao conseguiu ler do arquivo: " + arquivo);
            return;
        } catch(Exception ex) {
            System.out.println("Erro inesperado ao tentar ler o arquivo: " + arquivo);
            ex.printStackTrace();
            return;
        } finally {
            try {
                br.close();
            } catch(Exception ex) {
                // Nao faz nada !
            }
            try {
                fr.close();
            } catch(Exception ex) {
                // Nao faz nada !
            }
        }
    }
}
