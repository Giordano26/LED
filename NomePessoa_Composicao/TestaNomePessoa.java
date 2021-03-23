import javax.swing.JOptionPane;

/**
 * Escreva a descrição da classe TestaNomePessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class TestaNomePessoa
{
    public static void main(String[] args) {
                
        // Entrada de um nome (atraves do teclado)
        String nomeP = JOptionPane.showInputDialog("Forneça um nome: ");

        // Criacao de uma instancia da classe nome (criacao do objeto)
        NomePessoa np = new NomePessoa(nomeP); // Chama o metodo construtor com o texto fornecido

        // Mostra os dados
        System.out.println("Nome              : " + np.getNome() + " (" + np.getNome().getQtdePalavras()+ " palavras)");
        System.out.println("Nome invertido    : " + np.getNome().inverterTexto());
        System.out.println("Nome bibliografico: " + np.getNomeBibliografico());
    }
}
