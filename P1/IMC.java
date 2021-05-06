public class IMC {
    public double imcCalc(double p,double a){

        if((40 <= p) && (p <= 130) &&
            (1.4 <= a) && (a <= 2.0)){
                return p/ (a*a);
            }
        else
            return -666;
    }

    public String categoria(double imc){
        String msg = "";
        if(imc ==  -666){
            msg = "Dados Inválidos";
        }else{
            if( imc < 18.5){
                msg = "Magro";
            } 
            if(18.5 <= imc && imc < 24.9){
                msg = "Normal";
            }
            if(25 <= imc && imc <= 29.9){
                msg = "Gordo";
            } 
            if(30 < imc){
                msg = "Obeso";
            }
        } 
       
        return msg;
        
    }
}
