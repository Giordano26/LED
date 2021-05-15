/**
 * Implementa a estrutura de dados pilha (com array).
 *
 * @author Julio Arakaki
 * @version 06/05/2020
 */
public class Pilha implements IPilha {
    // Atributos
    // Armazenador de elementos (Object)
    public Object[] armazenador;
    // Indica a posicao na pilha
    public int posicaoPilha;

    /**
     * Pilha Constructor
     */
    public Pilha(int tam) {
        this.posicaoPilha = -1; // -1 indica que esta vazia, 
        this.armazenador = new Object[tam]; 
    }

    /**
     * (isEmpty)
     * Method estaVazia
     *
     * @return boolean true - vazia
     *                 false - nao vazia
     */
    public boolean estaVazia() {
        boolean ret = false;
        if (this.posicaoPilha == -1) {
            ret = true;
        }
        return ret;
    }

    /**
     * (size)
     * Method tamanho - retorna o tamanho da pilha
     *
     * @return int - tamanho da pilha
     */
    public int tamanho() {

        if (this.estaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    /**
     * (top)
     * Method topo
     *
     * @return Object - retorna o elemento do topo da pilha
     */
    public Object topo() {

        if (this.estaVazia()) {
            return null;
        }
        return this.armazenador[this.posicaoPilha];
    }

    /**
     * (pop)
     * Method remover
     *
     * @return Object - retorna o elemento removido
     */
    public Object remover() {
        if (estaVazia()) {
            return null;
        }
        return this.armazenador[this.posicaoPilha--];
    }

    /**
     * (push)
     * Method inserir elemento na pilha
     *
     * @param valor Object - elemento a ser inserido
     */
    public void inserir(Object valor) {
        if (this.posicaoPilha < this.armazenador.length - 1) {
            this.armazenador[++posicaoPilha] = valor;
        }
    }
    /**
     * (isFull)
     * Method estaCheia
     *
     * @return boolean true - vazia
     *                 false - nao vazia
     */
    public boolean estaCheia() {
        boolean ret = false;
        if (this.posicaoPilha == this.armazenador.length - 1) {
            ret = true;
        }
        return ret;
    }
    
    /**
     * Method toString - retorna a fila como string
     *
     * @return s String - a PILHA
     */
    public String toString(){
        String s = "[ ";
        for (int i = 0; i < tamanho(); i++){
            s = s + this.armazenador[i].toString() + " ";
        }
        s = s + "]";
        return s;
    }    
}
