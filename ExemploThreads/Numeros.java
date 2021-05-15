/**
 * Imprimir numeros atraves de uma thread
 * @author LED
 * @version 1.0
 */
class Numeros extends Thread {
    /**
     * Quantidade de numeros a serem impressos
     */
    private int _qtde;

    /**
     * Construtor
     * @param n quantidade de numeros
     */
    public Numeros(int n) {
        _qtde = n;
    }

    /**
     * Imprimir os numeros
     */
    private void imprimirNumero() {
        for (int i = 1; i <= _qtde; i++){
            System.out.println(" " + i);
        }
    }

    /**
     * Metodo executado quando a thread eh "iniciada"
     */
    public void run() {
        imprimirNumero();
    }
}
