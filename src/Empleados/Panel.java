package Empleados;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel {
    Empleado es[] = new Empleado[2];
    private JFrame display;
    private JPanel panel;
    private JButton aceptar;
    private JLabel fechaNacT, fechaIngT;
    private JTextField datofn, datofi;
    
    
    Panel(){//Constructor para crear instancias de los atributos que tenemos declarados
        display = new JFrame();
        panel = new JPanel();
        aceptar = new JButton();   
        fechaNacT = new JLabel();
        fechaIngT = new JLabel();
        datofn = new JTextField();
        datofi = new JTextField();
    }
    
    public void desplegar(){
        display.setVisible(true);
        display.setBounds(0, 0, 600, 600);
        panel.setVisible(true);
        display.getContentPane().add(panel);        
        display.setLocationRelativeTo(null);
        display.setResizable(false);
    }
    
    public void armar(){
        display.setSize(600, 600);
        display.setTitle("Registro de empleado");
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        
        panel.add(fechaNacT);
        fechaNacT.setText("Fecha de nacimiento");
        fechaNacT.setForeground(Color.BLACK);
        fechaNacT.setFont(new Font("Arial", Font.BOLD, 16));
        fechaNacT.setBounds(50, 50, 200, 100);
        
        panel.add(datofn);
        datofn.setBounds(215, 90, 150,20);
        
        panel.add(fechaIngT);
        fechaIngT.setText("Fecha de ingreso");
        fechaIngT.setForeground(Color.BLACK);
        fechaIngT.setFont(new Font("Arial", Font.BOLD, 16));
        fechaIngT.setBounds(50, 100, 200, 100);
        
        panel.add(datofi);
        datofi.setBounds(215, 140, 150,20);
        
        
        
        
    }
    
    
    
}
