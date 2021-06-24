package src.Conjunto;
import src.ListaLigada.ListaDuplamenteLigadaCircular;
import src.ListaLigada.No;
import src.UI.UI;

public class Conjunto {

  public void findInter(){
    ListaDuplamenteLigadaCircular conjA = new ListaDuplamenteLigadaCircular(); //lista referente a conjunto A
    ListaDuplamenteLigadaCircular conjB = new ListaDuplamenteLigadaCircular(); //lista referente a conjunto B
    ListaDuplamenteLigadaCircular conjR = new ListaDuplamenteLigadaCircular(); //lista referente a cojunto R (intersecção)
    UI ui = new UI();

    int n1 = ui.grabN("Digite o tamanho da lista A: ");

    for(int i = 1; i <= n1; i++ ){ //enquanto não é o tamanho da lista, continua adicionando

      int x = ui.grabN("Número a ser adicionado na lista A: ");
      conjA.inserirFim(x); 

    }

    int n2  = ui.grabN("Digite o tamanho da lista B: ");

    for(int i = 1; i <= n2; i++){ //enquanto não é o tamahnho da lista, continua adicionado 

      int x = ui.grabN("Número a ser adicionado na lista B");
      conjB.inserirFim(x);
    }


    No aux1 = conjA.getInicio(); //inicia o primeiro aux cm o primeiro nó (lista A)
    No aux2 = conjB.getInicio(); //inicia o primeiro aux cm o primeiro nó (lista B)
    
    do{
      aux1 = aux1.getProximo(); //pega o próximo nó (lista  A)
      int comp1 = (int)aux1.getConteudo(); //transforma o conteúdo do nó lista A para int
      do{
        aux2 = aux2.getProximo(); //pega o próximo nó (lista B)

        int comp2 = (int)aux2.getConteudo(); //transforma o conteúdo do nó Lista B para int

        if(comp1 == comp2){ //faz a comparação para verificar se é intersecção dos conjuntos
          conjR.inserirInicio(comp1); //insere na lista R que é referente a da intersecção
          break; //break evita duplicatas
        }
        
      }while(aux2 != conjB.getInicio()); //enquanto inicio não é igual o atual da lista B
    }while(aux1 != conjA.getInicio()); //enquanto inicio não é igual o atual da lista A

    String intersec = conjR.toString(); //passa a lista de intersecção para string para printar

    ui.showMsg(intersec); //printa lista de intersecção 
    



  }

  
}
