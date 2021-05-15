package entrada;
import java.util.Scanner;

/**
 * Escreva a descrição da classe EntradaConsole aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class EntradaConsole implements IEntrada
{
    Scanner scan = new Scanner( System.in );

    public void lerDados(){ 
    }
    public String lerNome(){ 
        String nome;
        System.out.print("Forneca nome: ");
        nome = scan.next();
        return nome;
    }
}
