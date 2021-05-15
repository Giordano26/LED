
/**
 * Teste para ED Pilha.
 *
 * @author Julio Arakaki
 * @version 06/05/2020
 */

public class TestaPilha {
    public static void main(String args[]) {
        // Instancia objeto Pilha
        Pilha p = new Pilha(5);
        
        // Insere elementos na pilha
        p.inserir("LivroA");
        p.inserir("LivroB");
        p.inserir(20);
        p.inserir("LivroC");
        p.inserir("LivroD");
        if (!p.estaCheia()){
            p.inserir(10);
        } else {
            System.out.println("Pilha Cheia!! Nao consegui inserir");
        }
        
        // Mostra pilha
        System.out.println("\nPilha: " + p);
        
        // Retira elementos da pilha
        while (!p.estaVazia()) {
            System.out.println("Remover -> " + p.remover());
            System.out.println("Pilha: " + p);
        }
    }
}

