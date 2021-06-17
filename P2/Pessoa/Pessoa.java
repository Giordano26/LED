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

    public int getNum(){ //função de retorno de numero de pessoas
        return nPessoas;
    }

    public boolean getStatus(){ //função de retorno de status do construtor pessoa
        return pViva;
    }

    public JLabel getLabel(){ //retorna a label, OwO ou XwX
        return label;
    }

    public void changeStatus(){ //função de mudança de status, matar a pessoa OwO --> XwX
        pViva = false; 
        label.setFont(new Font("Comic Sans", Font.BOLD, 15));
        label.setText(" XwX ");
    }
}
