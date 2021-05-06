public class ExceptionCad {

    public String msg;  //Mensagem genérica       

    ExceptionCad(String mensagem){
        this.msg = mensagem; //Mensagem a ser passada na chamada da função
    }    
    
    public void ShowException(){
        System.out.println(this.msg);
    }
}
