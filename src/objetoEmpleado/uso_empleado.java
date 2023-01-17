package objetoEmpleado;


import java.util.*;

//Aquí se puede ver un ejemplo de la clase util. Date lin 20.

public class uso_empleado {
    /*a diferencia del paquete poo este objeto uas aun único fichero */

    //en esta forma de programar solo un método puede tener la clase pública
    public static void main(String[] arg) {
       /* Empleado empleado1 = new Empleado("juan", 85000, 1990, 12, 17);
        Empleado empleado2 = new Empleado("pedro", 95000, 1995, 6, 2);
        Empleado empleado3 = new Empleado("maria", 105000, 2002, 3, 15);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.print("Nombre: " + empleado1.dimeNombre() + "\nSueldo: " + empleado1.dimeSueldo() + "\nFecha de alta: " + empleado1.dimeFechaContrato()+"\n\n");
        System.out.print("Nombre: " + empleado2.dimeNombre() + "\nSueldo: " + empleado2.dimeSueldo() + "\nFecha de alta: " + empleado2.dimeFechaContrato()+"\n\n");
        System.out.print("Nombre: " + empleado3.dimeNombre() + "\nSueldo: " + empleado3.dimeSueldo() + "\nFecha de alta: " + empleado3.dimeFechaContrato()+"\n\n");*/

        //código simplificado usando array
        Empleado[] misEmpleados = new Empleado[4];

        misEmpleados[0] = new Empleado("Paco Jimenez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("pedro", 95000, 1995, 6, 2);
        misEmpleados[2] = new Empleado("maria", 105000, 2002, 3, 15);
        misEmpleados[3] = new Empleado("juan"); //perfectamente válido


        //ejemplos de bucles
        for (Empleado e:misEmpleados){
            e.subeSueldo(5);
        }

        for(Empleado e: misEmpleados){
            System.out.print("Nombre: " + e.dimeNombre() + "\nSueldo: " + e.dimeSueldo() + "\nFecha de alta: " + e.dimeFechaContrato()+"\n\n");
        }

    }
}
    //método constructor
    class Empleado{
    //si no se usan constructores se utiliza el constructor por defecto con todos los parameters vacíos
        public Empleado(String nom, double sue, int year, int mes, int day ){
            nombre = nom;
            sueldo = sue;
            //Clase que construye una fecha
            GregorianCalendar calendar = new GregorianCalendar(year, (mes-1), day);
            altaContrato = calendar.getTime();
        }
        //SOBRECARGA DE CONSTRUCTORES
        public Empleado(String nom){
            //Para no dejar los campos date y sue vacíos este método constructor dirige al otro el dato recibido
            //y pasa los parameters asi
            this(nom, 30000, 2000, 1, 1);
        }

        //GETTERS
        public String dimeNombre(){
            return nombre;
        }
        public double dimeSueldo(){
            return sueldo;
        }
        public Date dimeFechaContrato(){
            return altaContrato;
        }

        //SETTER
        public void subeSueldo(double porcentaje){
            double aumento = sueldo*porcentaje/100;
            sueldo += aumento;
        }

        //declaradas al final de la clase
        private final String nombre;
        private double sueldo;
        private final Date altaContrato;
    }


