package ListaLigada;

import javax.swing.JLabel;
import Pessoa.Pessoa;

public class JosephusTwo {
    public ListaDuplamenteLigadaCircular lst = new ListaDuplamenteLigadaCircular();

    int intervalo = 0;
    int count = 0;

    public JosephusTwo(int intervalo){
        this.intervalo = intervalo; //construtor do intervalo
    }

    public void preencher(int n){ //preenche a lista com as pessoas, N passado pelo usuario
        for(int i = 0; i < n; i++){

            Pessoa p = new Pessoa(i,true,new JLabel("O"));
            lst.inserirFim(p);
        }
    }

    public int getQtdVivos(){ // função para verificar quantos OwO ainda estão vivos
        int qtd = 0;

        No atual = lst.getInicio();

        do{
            atual = atual.getProximo();
            Pessoa p = (Pessoa)atual.getConteudo();
            
            if(p.getStatus())
                qtd++; //incremento para cada pessoa viva

        }while(atual != lst.getInicio());

        return qtd;
    }



    public boolean run(){ //logica do jogo

        if(getQtdVivos() > 1){
           
            Pessoa p;
            do{
                No atual = lst.peekNo();
                p = (Pessoa)atual.getConteudo();
            }while(p.getStatus() == false); //pega até chegar em alguma pessoa morta

            count++;

            if( count == intervalo){
                p.changeStatus(); //se o contador bater com o intervalo é necessária trocar o status da pessoa

                count = 0;
            }

            return true;
        }

        return false;
    }


}
