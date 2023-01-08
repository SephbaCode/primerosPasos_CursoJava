import javax.swing.*;
public class factorial {

    public static void main(String[] args){

        long resultado = 1L;        // esto porque en factoriales puede desbordarse facilmente
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:"));

        for(int i = num; i>0 ; i--){
            resultado = resultado*i;
        }

        System.out.println("El factorial de " + num + " es " + resultado + ".");
    }
}
