
/**
 * Teste de arquivo binario.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aplicacao {
    public static void main(String args[]){

        // instanciando Pessoa
        Pessoa p1 = new Pessoa("Julio Arakaki", 22, "12345", 78, 1.68);
        System.out.println("\nOriginal:" + p1);

        // instanciando objeto Arquivo binario
        ArquivoBinario ab = new ArquivoBinario();
        ab.gravarObj(p1, "lixo.dat"); // chamada de metodo gravacao

        Pessoa p = (Pessoa)ab.lerObj("lixo.dat");
        System.out.println("\nLido do arquivo:" + p);

    }
}
