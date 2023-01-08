import javax.swing.*;
public class peso_Ideal {

    //ejemplo para desarrollar el bucle do while
    public static void main(String[] arg){

        String genero; //inicializar la variable

        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (H) o (M)");
        }while(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
        //metodo ignore case para oviar caracteres may o min
        //el metodo se repite mientras lo que introduzcan sea diferente a lo que se pide, se procede almenos una vez

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm:"));
        int peso_Ideal = 0;

        if (genero.equalsIgnoreCase("M")){
            peso_Ideal = altura - 120;
        }else if (genero.equalsIgnoreCase("H")){
            peso_Ideal = altura - 110;
        }

        System.out.println("Tu peso ideal es " + peso_Ideal + "Kg.");
    }
}
