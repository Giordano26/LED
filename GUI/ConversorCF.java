import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConversorCF extends JFrame implements ActionListener {
    // Atributos
    private JLabel res;
    private JButton conv;
    private JTextField tc;

    // Construtor
    ConversorCF(String titulo){
        super (titulo);  // Construtor da classe pai
        
        // Define dimensoes da janela
        setSize(650, 100);
        setLocation(0, 0);

        // Container de componentes graficos
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2,2));

        // Adiciona o label
        cp.add(new JLabel("Forneca temp (Celcius)", JLabel.CENTER));
        
        // Adiciona a caixa de texto
        tc = new JTextField();
        tc.addActionListener(this);
        tc.setToolTipText("Entrada da temperatura Celcius");
        tc.setBackground(Color.RED);
        tc.setForeground(Color.WHITE);
        cp.add(tc);

        // Adiciona botao
        cp.add(conv = new JButton("Converter"));
        conv.addActionListener(this);
        conv.setToolTipText("Ccnverte Celcius em Fahrenheit");

        // Adiciona o label de resultado
        cp.add(res = new JLabel("Fahrenheit", JLabel.CENTER));
        res.setToolTipText("Resultado da conversao");

    }

    public void actionPerformed(ActionEvent ae) {
        try{
            System.out.println(ae.getActionCommand());
            double t = (9./5.)*Double.parseDouble(tc.getText())+32.;
            res.setText(t+" F");
        }catch(Exception e){
            res.setText("Valor invalido!");
        }
    }
}
