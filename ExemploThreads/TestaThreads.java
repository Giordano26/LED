public class TestaThreads {
    public static void main(String[] args)   { 
        // Cria threads
        Textos textos1 = new Textos("ze", 50);
        Textos textos2 = new Textos("maria", 50);
        Textos textos3 = new Textos("joao", 50);
        Numeros numeros = new Numeros(50);

        // Inicia threads
        textos1.start();
        textos2.start();
        textos3.start();
        numeros.start();
    }
}

