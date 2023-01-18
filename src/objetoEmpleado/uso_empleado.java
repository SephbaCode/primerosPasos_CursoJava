package objetoEmpleado;
import java.util.*;

public class uso_empleado {
    /*a diferencia del paquete poo este objeto uas aun único fichero */

    //en esta forma de programar solo un método puede tener la clase pública
    public static void main(String[] arg) {

        Jefe jefe_RHH = new Jefe("Mateo", 10000, 2001, 3,15);
        jefe_RHH.estableceIncentivo(2500);

        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0] = new Empleado("Paco Jimenez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("pedro", 95000, 1995, 6, 2);
        misEmpleados[2] = new Empleado("maria", 105000, 2002, 3, 15);
        misEmpleados[3] = new Empleado("juan"); //perfectamente válido
        misEmpleados[4] = jefe_RHH;         //POLIMORFISMO USAR UN OBJETO DE UNA SUBCLASE DONDE SE ESPERA UN OBJETO DE SUPERCLASE
        misEmpleados[5] = new Jefe("Maria", 100000, 1990, 1, 12);

        //EJEMPLO DE CASTING
        //Dado que no me permite usar un método dela clase Jefe en misEmpleados[5] se debe hacer un casting.
        //Creando un objeto Jefe y haciendo un casting pasamos
        Jefe jefaEco = (Jefe) misEmpleados[5];
        jefaEco.estableceIncentivo(50000);  //aplicamos un método de clase jefe



        //ejemplos de bucles
        for (Empleado e:misEmpleados){
            e.subeSueldo(5);
        }
        //en el bucle la máquina virtual sabe en qué circunstancias usar un método u otro
        for(Empleado e: misEmpleados){
            System.out.print("Nombre: " + e.dimeNombre() + "\nSueldo: " + e.dimeSueldo() + "\nFecha de alta: " + e.dimeFechaContrato()+"\n\n");
        }

    }
}
    //método constructor
    class Empleado{
    //si no se usan constructores se utiliza el constructor por defecto con todos los parameters vacíos
        public Empleado(String nom, double sue, int year, int mes, int day ){
            mes--;
            nombre = nom;
            sueldo = sue;
            //Clase que construye una fecha
            GregorianCalendar calendar = new GregorianCalendar(year, mes, day);
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
            //si escribiera final antes de declarar este método, en la clase hija no se pudiese crear un método con el mismo nombre
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

    final class Jefe extends Empleado{
    //escribir final antes de class impide que otra clase herede de esta

        public Jefe(String nom, double sue, int year, int mes, int day) {
            super(nom, sue, year, mes, day);
        }

        //SETTER
        public void estableceIncentivo(double b){
            incentivo = b;
        }

        //GETTER
        //llamar un método en una clase hijo de la misma forma que se llama en la clase padre, remplaza el de la superclase con este
        //ahora empleado.dimeSueldo es un método personalizado para objetos jefe, independent del método para Empleado.dimeSueldo aunque se llamen igual
        public double dimeSueldo(){
            double sueldoJefe = super.dimeSueldo();       //Con súper. Clase aclara que está pidiendo el resultado del método que pertenece a la clase padre
            return sueldoJefe+incentivo;
        }

        private double incentivo;

    }





