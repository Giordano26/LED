/**
 * Imprimir textos atraves de uma thread
 * @author LED
 * @version 1.0
 */
class Textos extends Thread {
    /**
     * Quantidade de textos a serem impressos
     */
    private int _qtde;
    /**
     * Texto a ser impresso _qtde vezes
     */
    private String _texto;

    /**
     * Construtor
     * @param texto texto a ser impresso
     * @param nVezes numero de vezes
     */
    public Textos(String texto, int nVezes) {
        _qtde = nVezes;
        _texto = texto;
    }

    /**
     * Imprimir os textos
     */
    private void imprimirTextos(){
        for (int i = 1; i <= _qtde; i++){
            System.out.println(" " + _texto);
        }
    }

    /**
     * Metodo executado quando a thread eh "iniciada"
     */
    public void run() {
        imprimirTextos();
    }
}
