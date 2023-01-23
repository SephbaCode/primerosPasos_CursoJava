package persona;

public class Alumno extends Persona{

    private final String carrera;

    public Alumno(String nombre, String carrera){
        super(nombre);
        this.carrera = carrera;
    }

    //sobreescribir el método abstracto
    public String getDescription(){
        return "Este alumno esta estudiando la carrera de "+carrera;
    }

}
