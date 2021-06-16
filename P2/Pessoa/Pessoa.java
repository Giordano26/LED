package Pessoa;

import javax.swing.JLabel;



public class Pessoa {
    private int nPessoas;
    private boolean pViva;
    private JLabel label;


    public Pessoa(int nums, boolean isAlive, JLabel label){

        isAlive = true;
        pViva = isAlive;
        nPessoas = nums;
        this.label = label;

        label.setText("웃");

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
        label.setText("X");
    }
}
