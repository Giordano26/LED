package ListaLigada;

import javax.swing.JLabel;
import Pessoa.Pessoa;

public class JosephusTwo {
    public ListaDuplamenteLigadaCircular lst = new ListaDuplamenteLigadaCircular();

    int intervalo = 0;
    int count = 0;

    public JosephusTwo(int intervalo){
        this.intervalo = intervalo;
    }

    public void preencher(int n){
        for(int i = 0; i < n; i++){

            Pessoa p = new Pessoa(i,true,new JLabel("O"));
            lst.inserirFim(p);
        }
    }

    public int getQtdVivos(){
        int qtd = 0;

        No atual = lst.getInicio();

        do{
            atual = atual.getProximo();
            Pessoa p = (Pessoa)atual.getConteudo();
            
            if(p.getStatus())
                qtd++;

        }while(atual != lst.getInicio());

        return qtd;
    }



    public boolean run(){

        if(getQtdVivos() > 1){
           
            Pessoa p;
            do{
                No atual = lst.peekNo();
                p = (Pessoa)atual.getConteudo();
            }while(p.getStatus() == false);

            count++;

            if( count == intervalo){
                p.changeStatus();

                count = 0;
            }

            return true;
        }

        return false;
    }


}
