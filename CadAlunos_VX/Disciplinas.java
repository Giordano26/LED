import armazenagem.*;
import elementos.*;

/**
 * Write a description of class Disciplinas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Disciplinas
{

    public IArmazenador armazen;

    public Disciplinas(){
        this.armazen = new VetDin();
        //this.armazen = new Lista();
    }

    public void inserir(Disciplina disc){
        this.armazen.inserir(disc);
        //return true;
    }

    public boolean remover(String sigla){
        boolean ret = false;
        int indice = buscar(sigla);
        if (indice >= 0){
            this.armazen.remover(indice);
            ret = true;
        } 
        return ret;
    }

    private int buscar(String sigla) {
        int indice = -1;
        Object vet[] = ((VetDin)this.armazen).getVetor();
        //Object vet[] = ((Lista)this.armazen).getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Disciplina a = (Disciplina) vet[i];
                if (a.getSigla().equals(sigla)){
                    indice = i;
                    break;
                }
            } 
        }
        return indice;
    }

    public String toString(){
        return armazen.toString();
    }

}