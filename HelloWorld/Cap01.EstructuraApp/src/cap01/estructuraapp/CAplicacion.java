package cap01.estructuraapp;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// Todas las aplicaciones graficas que usen swing, heredan de JFrame
public class CAplicacion extends JFrame{
    
    // Los componentes usualmente se declaran acá
    private JButton button;
    private JLabel label;

    public CAplicacion(){
        /* Establecemos las configuraciones de la interfaz. */
        setSize(300, 200);
        setTitle("Hello World");
        initComponents();
    }
    
    private void initComponents(){
        // Administrador de diseño nulo
        getContentPane().setLayout(null);
        
        // Agregamos un escuchador de eventos
        addWindowListener(
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent evt){
                    exitForm(evt);
                }
            }               
        );
        
        /* Creamos los componentes de la interfaz */
        button = new JButton();
        button.setText("Click Here");
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setToolTipText("Click Button");
        button.setMnemonic('c');
        // button.setFont(new Font("dialog", 1, 18));
        // X, Y, Width, Height
        button.setBounds(42, 90, 204, 30);
        
        label = new JLabel();
        label.setText("Hello World!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("dialog", 1, 18));
        label.setBounds(42, 50, 204, 30);
        
        // panel.setLayout(new GridLayout(0, 1));
        
        // Los agregamos al panel raiz
        getContentPane().add(button);
        getContentPane().add(label);
        
    }
    
    private void exitForm(WindowEvent evt){
        System.exit(0);
    }
    
    public static void main(String[] args){
        new CAplicacion().setVisible(true);
    }
    
}
