package poo;

//import javax.swing.*;

public class UsoVehiculo {

    public static void  main(String[] args){

        //instance una clase.... un ejemplar de clase
        /*Coche miCoche = new Coche();

        //establecer color mediante paso de parámetros
        miCoche.establece_color(JOptionPane.showInputDialog("Introduzca color"));

        //es importante encapsular esto para evitar modificar el dato desde donde no se debería
        //por lo que esta parte está incorrecta, se debe usar el método correspondiente para presentar datos
        //System.out.println("El coche tiene " + miCoche.ruedas + " ruedas.");
        System.out.println(miCoche.dime_largo());
        System.out.println(miCoche.dime_ancho());
        System.out.println(miCoche.dime_ruedas());
        System.out.println(miCoche.dime_peso_Plataforma());
        System.out.println(miCoche.dime_motor());
        System.out.println(miCoche.dime_color());
        System.out.println(miCoche.dimeDatosGenerales());

        miCoche.configuraAsientos(JOptionPane.showInputDialog("Asientos de cuero?"));
        System.out.println(miCoche.dimeAsientos());

        miCoche.configuraClimatizador(JOptionPane.showInputDialog("climatizador?"));
        System.out.println(miCoche.dimePesoCoche());
        System.out.println("El precio del coche es "+miCoche.precioCoche());*/

        Coche miCoche1 = new Coche();
        miCoche1.establece_color("rojo");

        Furgoneta miFurgoneta1 = new Furgoneta(7,580);
        miFurgoneta1.establece_color("azul");
        miFurgoneta1.configuraAsientos("si");
        miFurgoneta1.configuraClimatizador("si");
        System.out.println(miFurgoneta1.dimeDatosFurgoneta());
        System.out.println(miCoche1.dimeDatosGenerales());
        System.out.println(miFurgoneta1.dimeDatosGenerales());

        //LA REGLA PARA EL DISE;O DE LA HERENCIA  " ES UN...."
        //una furgoneta no es un coche
        //un mejor dise;o de herencia mejor hubiera sido una furgoneta es un vehiculo


    }




}
