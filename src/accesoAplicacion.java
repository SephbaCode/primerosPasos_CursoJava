import javax.swing.*;
public class accesoAplicacion {

    public static void  main(String [] args){

        //objeto clave y objeto pass
        String clave = "mateo";
        String pass ="";    // cadena vacia

        //condicional para repetir codigo, inlcuye un metodo para conparar cadenas
        while(!clave.equals(pass)){
            pass = JOptionPane.showInputDialog("Introduce la contrase;a por favor:");

            if(!clave.equals(pass)){
                System.out.println("contrasenia incorrecta.");
            }

        }

        System.out.println("Contrase;a correcta. acceso permitido");
    }
}
