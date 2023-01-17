package usoModificadorFinalStatic;

public class EmpleadoSimpleUso {

    public static void main(String[] args){

        EmpleadoSimple[] miArray = new EmpleadoSimple[4];
        miArray[0] = new EmpleadoSimple("Juan");
        miArray[1] = new EmpleadoSimple("Ana");
        miArray[2] = new EmpleadoSimple("Pedro");
        miArray[3] = new EmpleadoSimple("Luca");

        miArray[0].cambiaDepa("RRHH");

        for(EmpleadoSimple e:miArray){
            System.out.println(e.getInfo());
        }
        //imprimir el código siguiente como es un valor static no se usa ninguna instancia del objeto, en cambio,
        // se usa la clase
        System.out.println(EmpleadoSimple.dameIdSiguiente());


    }


}
