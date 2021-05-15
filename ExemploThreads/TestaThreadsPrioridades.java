public class TestaThreadsPrioridades {
    public static void main(String[] args) {
        // Cria threads
        Textos textos1 = new Textos("ze", 150);
        Textos textos2 = new Textos("maria", 150);
        Textos textos3 = new Textos("joao", 150);
        Numeros  numeros = new Numeros(150);

        // Seta prioridades para os threads
        textos1.setPriority(Thread.NORM_PRIORITY);
        textos2.setPriority(Thread.MAX_PRIORITY);
        textos3.setPriority(Thread.NORM_PRIORITY);
        numeros.setPriority(Thread.MIN_PRIORITY);

        // inicia todos os threads
        textos1.start();
        textos2.start();
        textos3.start();
        numeros.start();
    }
}
