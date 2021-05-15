
public class TestaBuffer {
    public static void main(String[] args) {
        // Cria buffer
        Buffer bf = new Buffer (6);

        // Cria os threads que retira e insere no buffer
        Retira rt = new Retira (bf, 50); 
        Insere ins = new Insere (bf, 50);

        // Inicia os thread de inseraoo e retirada do buffer
        ins.start();
        //ins.setPriority(Thread.MAX_PRIORITY);
        rt.start();
    }
} 

/**
 * classe responsavel pela insercao no buffer
 */
class Insere extends Thread {
    Buffer _bf;
    int _qtd;

    Insere (Buffer bf, int qtd){
        _bf = bf;
        _qtd = qtd;
    }

    public void run (){
        for (int i = 0; i < _qtd; i++){
            _bf.put("" + i);
        }
    }
}

/**
 * classe responsavel pela retirada do buffer
 */
class Retira extends Thread {
    Buffer _bf;
    int _qtd;

    Retira (Buffer bf, int qtd){
        _bf = bf;
        _qtd = qtd;
    }

    public void run (){
        for (int i = 0; i < _qtd; i++){
            _bf.get();
        }
    }
}
