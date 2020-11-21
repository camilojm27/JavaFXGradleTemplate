/**
 * Método Main de todo el proyecto.
 * 
 * Esta clase debe llamar a la ventana de Login, desde allí y solo desde allí
 * se debe pasar al dashboard.
 * 
 * Obviamente este debe ser el único método main que debe existir en el proyecto.
 * Para efectos de probar interfaces es aceptable que se creen otros métodos main
 * donde los necesiten, pero una vez manden sus cambios a upstream, deben eliminar 
 * los métodos main extras que crearon.
 */

package com.sige.user;

import javax.swing.UIManager;

import java.awt.EventQueue;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Main  	{

    public static void main(String[] args) {

        try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
    // handle exception
}
        // handle exception
        // handle exception
        // handle exception

        EventQueue.invokeLater(new Runnable() {
            public void run() {
            	
            	new LoginGUI();
            	

            }
        });
    }
}
