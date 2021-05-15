package armazenagem;

import java.util.ArrayList;
/**
 * Escreva a descrição da classe Lista aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Lista implements IArmazenador
{

    private ArrayList <Object> arrLista;
    private int qtd;

    public Lista(){
        setVetor(new <Object>ArrayList());
        setQtd(0);
    }

    /**
     * @return the vet
     */
    public Object[] getVetor() {
        return arrLista.toArray();
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param vet the vet to set
     */
    public void setVetor(ArrayList <Object>arrLista) {
        this.arrLista = arrLista;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void inserir(Object obj){
        arrLista.add(obj);
        setQtd(getQtd()+1);
    }

    public void remover (int i) {
        arrLista.remove(i);
        // decrementa contador de elementos    
        setQtd(getQtd() - 1);
    }

    Object buscar (int i){
        return arrLista.get(i);
    }

    public boolean vazia(){
        return (qtd==0);
    }

    private void copiar(Object origem[], Object destino[]){
        // copia todos
        int i, k = 0;
        for (i = 0; i < origem.length; i++){
            if (origem[i] != null) {
                destino[k] = origem[i];
                k++;
            }
        }       
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < arrLista.size(); i++){
            s += arrLista.get(i).toString();
        }
        return s;
    }

}

