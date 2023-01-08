import javax.swing.*;

public class compruebaMail {

    public static void main(String[] arg){

        int arroba = 0;
        boolean dot = false;
        //objeto tipo string que almacena el mail para usar sus metodos
        String mail = JOptionPane.showInputDialog("introduce mail");

        //recorrre toda la longitude del mail buscando si hay arroba
        //se puede declarar int i dentro del for ;
        for(int i = 0; i<mail.length(); i++){
            //se puede declarar asi un if para ahorrar espacio
            if(mail.charAt(i) == '@') arroba++;
            if(mail.charAt(i) == '.') dot = true;
        }

        System.out.println("Longitud = " + mail.length());

        //version simplificadad de arroba == true .... tambien se puede retirar los parentesis
        if((arroba == 1)&&(dot)){
            System.out.println("Correo valido");
        }else{
            System.out.println("Correo invalido");
        }
    }
}
