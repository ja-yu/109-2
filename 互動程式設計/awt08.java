import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class awt08 extends Frame implements ActionListener, WindowListener
{
    JLabel label1,label2;
    JButton btn1,btn2,btn3;
    public awt08(String mytitle,Color mycolor,int x,int y)
    {
        ImageIcon myicon;
        myicon=new ImageIcon("home.png");
        setTitle(mytitle);
        setResizable(true);
        setIconImage(myicon.getImage());
        setSize(720,480);
        setLocation(x,y);
        setForeground(mycolor);
        setBackground(Color.GRAY);
        addWindowListener(this); 

        JPanel panel1 = new JPanel(); 
        panel1.setLayout(new GridLayout(2,1)); 
        //////////////////////////////
        label1 = new JLabel();
        label1.setText("��r����");
        label1.setBounds(0, 0, 200, 50);
        label2 = new JLabel();
        label2.setText("<html><h1>�����y�k����</h1></html>");
        label2.setBounds(0, 20, 200, 50);
        //////////////////////////////
        panel1.add(label1);
        panel1.add(label2);       

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3,1));  
        //////////////////////////////////////
        btn1=new JButton("Button 1");
        btn2=new JButton("Button 2");
        btn3=new JButton("Button 3");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);   
        ////////////////////////////////////////
        setLayout(new GridLayout(1,2));
        add(panel2);
        add(panel1);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){  
        if((JButton)e.getSource()==btn1)
            label1.setText("Welcome btn1");  
        else
            label1.setText("Welcome!!");  
    }

    public static void main(String[] args)
    {
        awt08 mywin=new awt08("����",Color.GREEN,2000,100);
    }

    public void windowDeactivated(WindowEvent arg0) {          
        System.out.println("������");      
    } 
    public void windowActivated(WindowEvent arg0) {  
        System.out.println("����");       
    } 
    public void windowDeiconified(WindowEvent arg0) {  
        System.out.println("�̤j��");  
    }
    public void windowIconified(WindowEvent arg0) {  
        System.out.println("�̤p��");  
    }
    public void windowClosed(WindowEvent arg0) {  
        System.out.println("����");  
    }
    public void windowClosing(WindowEvent arg0) {  
        System.out.println("���b����");  
        dispose();  
    }
    public void windowOpened(WindowEvent arg0) {  
        System.out.println("�}��");  
    }

    
}
