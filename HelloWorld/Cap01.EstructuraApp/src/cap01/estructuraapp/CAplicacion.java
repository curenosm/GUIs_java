package cap01.estructuraapp;

import javax.swing.*;
import java.awt.event.*;

// Todas las aplicaciones graficas que usen swing, heredan de JFrame
public class CAplicacion extends JFrame{

    public CAplicacion(){
        /* Establecemos las configuraciones de la interfaz. */
        setSize(300, 200);
        setTitle("Hello World");
        initComponents();
    }
    
    private void initComponents(){
        // Agregamos un escuchador de eventos
        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent evt){
                    exitForm(evt);
                }
            }               
        );
    }
    
    private void exitForm(WindowEvent evt){
        System.exit(0);
    }
    
    public static void main(String[] args){
        new CAplicacion().setVisible(true);
    }
    
}
