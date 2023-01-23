package persona;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona{
    //si no se usan constructores se utiliza el constructor por defecto con todos los parameters vacíos
    private double sueldo;
    private final Date altaContrato;

    public Empleado(String nombre, double sue, int year, int mes, int day ){
        super(nombre);
        mes--;
        sueldo = sue;
        //Clase que construye una fecha
        GregorianCalendar calendar = new GregorianCalendar(year, mes, day);
        altaContrato = calendar.getTime();
    }

    //sobre definir el método abstracto
    public String getDescription(){
        return "Este empleado tiene un salario "+sueldo+".";
    }

    //GETTERS
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
}
