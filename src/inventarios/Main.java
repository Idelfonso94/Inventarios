/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

/**
 *
 * @author francisco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // al momento de ejecutar el programa este codigo te manda al InicioVentana para poder ingresar como un usuario.
        InicioSecionVentana v = new InicioSecionVentana();
        v.setVisible(true);
    }

}
