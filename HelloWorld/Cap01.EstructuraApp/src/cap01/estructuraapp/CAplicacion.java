package cap01.estructuraapp;


public class CAplicacion extends javax.swing.JFrame{

    public CAplicacion(){
        /* Establecemos las configuraciones de la interfaz. */
        setSize(300, 200);
        setTitle("Hello World");
        initComponents();
    }
    
    private void initComponents(){
        // Agregamos un escuchador de eventos
        addWindowListener(
            new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent evt){
                    exitForm(evt);
                }
            }               
        );
    }
    
    private void exitForm(java.awt.event.WindowEvent evt){
        System.exit(0);
    }
    
    public static void main(String[] args){
        new CAplicacion().setVisible(true);
    }
    
}
