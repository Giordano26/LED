package entrada;
import javax.swing.JOptionPane;

/**
 * Escreva a descrição da classe EntradaGui aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class EntradaGui implements IEntrada
{
    public void lerDados(){
        
        
    }
    
    public String lerNome(){
        String nome = JOptionPane.showInputDialog("Forneca o nome: ");
        return nome;
    }
}
