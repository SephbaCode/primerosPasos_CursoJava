package poo;

import javax.swing.*;

public class coche1 {

    public static void  main(String[] args){

        //instanciar una clase.... un ejemplar de clase
        Coche miCoche = new Coche();

        //establecer color mediante paso de parametros
        miCoche.establece_color(JOptionPane.showInputDialog("Introduzca color"));

        //es importante encapsular esto para evitar modificar el dato desde donde no se deberia
        //por lo que esta parte esta incorrecta, se debe usar el metodo correspondienta para presentar datos
        //System.out.println("El coche tiene " + miCoche.ruedas + " ruedas.");
        System.out.println(miCoche.dime_largo());
        System.out.println(miCoche.dime_ancho());
        System.out.println(miCoche.dime_ruedas());
        System.out.println(miCoche.dime_peso_Plataforma());
        System.out.println(miCoche.dime_motor());
        System.out.println(miCoche.dime_color());
        System.out.println(miCoche.dimeDatosGenerales());

        miCoche.configurAsientos(JOptionPane.showInputDialog("Asientos de cuero?"));
        System.out.println(miCoche.dimeAsientos());


    }




}
