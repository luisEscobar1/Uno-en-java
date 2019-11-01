package main;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author User
 */
public class Metodos {

    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
    
    public static void mostrarImagen(JLabel lbl, String ruta){
        
        lbl.setIcon(new ImageIcon(ruta));
        
    }

}
