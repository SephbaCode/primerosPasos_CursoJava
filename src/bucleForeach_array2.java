//import javax.swing.*;

public class bucleForeach_array2 {

    public static void main(String[] args){
        //array de strings
       /* String[] paises =new String[8];

        for(int i=0; i<paises.length; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce pais " + (i+1) +'.');
        }

        //bucle for each.... version simplificada de for para recorrer arreglos
        for(String elemento:paises){
            System.out.println(elemento);
        }*/

        int[] matrizAl = new int[150];
        for(int i =0; i<matrizAl.length; i++){
            matrizAl[i] = (int)(Math.round(Math.random()*100));
        }
        //bucle for each
        for(int numeros:matrizAl){
            System.out.print(numeros + " ");
        }

    }
}
