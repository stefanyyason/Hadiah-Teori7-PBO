/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class kalkulator extends JFrame{
JTextField text = new JTextField("");
JButton satu = new JButton("1");
JButton dua = new JButton("2");
JButton tiga = new JButton("3");
JButton empat = new JButton("4");
JButton lima = new JButton("5");
JButton enam = new JButton("6");
JButton tujuh = new JButton("7");
JButton delapan = new JButton("8");
JButton sembilan = new JButton("9");
JButton nol = new JButton("0");
JButton titik = new JButton(".");
JButton ce= new JButton("CE");
    
public kalkulator(){
    super("Border Layout Beraksi");
    setSize (400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    add(text, BorderLayout.NORTH);
        JPanel pane = new JPanel();
    GridLayout family = new GridLayout(4, 3, 0, 0);
    pane.setLayout(family);
    pane.add(tujuh); pane.add(delapan); pane.add(sembilan); 
    pane.add(empat); pane.add(lima); pane.add(enam);
    pane.add(satu); pane.add(dua); pane.add(tiga); 
    pane.add(nol); pane.add(titik); pane.add(ce);
    add(pane);
    setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kalkulator frame = new kalkulator();
    }
}
