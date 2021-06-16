package GUI;

import App.Josephus;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.util.Timer;
import java.util.TimerTask;


public class GUI extends JFrame implements ActionListener{

   JTextField numP = new JTextField("Insira um numero");
   JTextField inter = new JTextField("Insira um intervalo");
   JButton start = new JButton("Iniciar");
   JPanel end = new JPanel(new GridLayout(1,1));


    static Timer timer = new Timer();

    public GUI(String title){
        super(title); //seta nome da janela, construtor da classe pai

        //Dimensões da janela
        setSize(550,700);
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

        //Painel do fim
        JLabel winLabel = new JLabel("Vencedor: ");
        end.add(winLabel);
        pane.add(end);


        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getActionCommand()=="Iniciar"){
                try{
                    int n = Integer.parseInt(numP.getText());
                    int m = Integer.parseInt(inter.getText());
                    Josephus js = new Josephus();
                    js.JosephusMain(m, n);
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