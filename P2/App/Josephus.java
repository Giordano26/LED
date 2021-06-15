package App;
import GUI.UI;
import Node.Node;

public class Josephus {

    UI gui = new UI();

    //achar a ultima pessoa viva a cada m-esima pessoa morta numa lista circular
    public void JosephusMain(int m, int n){

        if(n >= m + 1 && n > 2 && m > 1 ){

        //criação da lista circular de tamanho n
        Node head = new Node(1); //criação do primeiro nó
        Node anterior = head;
        
        for(int i = 2; i <= n; i++){

            anterior.prox = new Node(i); //atribuindo ids ao atual 
            anterior = anterior.prox; //anterior agora é o atual
        }

        //conectar o ultimo nodulo ao primeiro
        anterior.prox = head;

        //while --> enquanto apenas um nodulo existe na lista

        Node aux1 = head; 
        Node aux2 = head;

        while(aux1.prox != aux1){

            //devemos encontrar o nó de ordem m

            int contador = 1;
            while(contador != m){
                aux2 = aux1;
                aux1 = aux1.prox;
                contador++;
            }

            //"Matar" o nódulo de ordem m
            aux2.prox = aux1.prox;
            aux1 = aux2.prox;
        }

        String last = String.format("%d", aux1.idP);
        gui.showMsg("Ultimo sobrevivente " + last + "ª pos");
        
        }else{
            gui.error();
        }

        
    }
}