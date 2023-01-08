import javax.swing.*;
//import java.util.*;
public class adivinaNumero {

    public static void main(String[] args){


        int aleatorio = (int)(Math.random()*100); //numero entre 0 y 1;\
        //Scanner entrada = new Scanner(System.in);
        String entra;
        int num = 0;
        int intentos = 0;

        while(num != aleatorio){

            intentos++; //contador de intentos
            entra = JOptionPane.showInputDialog("Introduce un numero porfavor:");
            num = Integer.parseInt(entra);

            if(aleatorio<num){
                System.out.println("Mas bajo.");
            } else if (aleatorio>num){
                    System.out.println("Mas alto.");
            }
        }

        System.out.println("Correcto.");
        System.out.println("Intentos: " + intentos + ".");
    }
}
