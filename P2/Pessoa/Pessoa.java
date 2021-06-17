package Pessoa;

import javax.swing.JLabel;
import java.awt.Font;



public class Pessoa {
    private int nPessoas;
    private boolean pViva;
    private JLabel label;


    public Pessoa(int nums, boolean isAlive, JLabel label){

        isAlive = true;
        pViva = isAlive;
        nPessoas = nums;
        this.label = label;

        label.setFont(new Font("Comic Sans", Font.BOLD, 15));

        label.setText(" OwO ");

    }

    public int getNum(){
        return nPessoas;
    }

    public boolean getStatus(){
        return pViva;
    }

    public JLabel getLabel(){
        return label;
    }

    public void changeStatus(){
        pViva = false;
        label.setFont(new Font("Comic Sans", Font.BOLD, 15));
        label.setText(" XwX ");
    }
}
