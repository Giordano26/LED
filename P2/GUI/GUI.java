package GUI;

import App.Josephus;
import ListaLigada.*;
import Pessoa.Pessoa;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import java.util.Timer;
import java.util.TimerTask;


public class GUI extends JFrame implements ActionListener{

   JTextField numP = new JTextField("Insira um numero");
   JTextField inter = new JTextField("Insira um intervalo");
   JButton start = new JButton("Iniciar");
   JPanel gamePanel = new JPanel(new GridLayout(20,10));
   
   



    static Timer timer = new Timer();

    public GUI(String title){
        super(title); //seta nome da janela, construtor da classe pai

        //Dimensões da janela
        setSize(520,550);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // operação de saída da janela
        

        //Settando o container
        Container pane = getContentPane();
        setContentPane(pane);

        //Settando o layout
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        //Settando TextBox para direita e o tamanho
        numP.setHorizontalAlignment(SwingConstants.CENTER);
        numP.setPreferredSize(new Dimension(200,50));

        pane.add(numP);

        //Setando a textbox para a frequencia
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        //Settando TextBox para direita e o tamanho
        inter.setHorizontalAlignment(SwingConstants.CENTER);
        inter.setPreferredSize(new Dimension(200,50));

        pane.add(inter);

        //botao
        start.setLayout(new FlowLayout(FlowLayout.CENTER));
        start.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(start);
        start.addActionListener(this);
        start.setToolTipText("Clique para iniciar o jogo");


        //Game Panel
        
        pane.add(gamePanel);
        
        


        
    }


    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getActionCommand()=="Iniciar"){
                try{
                    gamePanel.removeAll();
                    int n = Integer.parseInt(numP.getText());
                    int m = Integer.parseInt(inter.getText());
                    JosephusTwo j2 = new JosephusTwo(m);
                    j2.preencher(n);
                    int k = 0;
                    No nova;
                    Pessoa p;

                    nova = j2.lst.getInicio();

                    do{
                        p = (Pessoa)nova.getConteudo();
                        gamePanel.add(p.getLabel());
                        nova = nova.getProximo();
                        k++; 

                    }while(k < n);



                    TimerTask task = new TimerTask(){
                        @Override

                        public void run(){
                            if(j2.getQtdVivos() > 1){
                                j2.run();
                            } else{
                                No ult;
                                Pessoa ultP;

                                ult = j2.lst.getInicio();

                                do{ 
                                    ultP = (Pessoa)ult.getConteudo();
                                    ult = ult.getProximo();
                                }while(ultP.getStatus() == false);

                                Josephus j = new Josephus();
                                j.JosephusMain(m, n);

                                cancel();

                            }
                        }
                    };


                    timer.schedule(task, 0, 25);


                    
                }catch(Exception er){
                    UI ui = new UI();
                    ui.error();
                }
            }

        }catch(Exception err){
            UI ui = new UI();
            ui.error();
        }
        
    }
    
}