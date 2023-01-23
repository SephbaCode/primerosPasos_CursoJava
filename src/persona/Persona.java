package persona;

abstract public class Persona {
    //variables
    private final String nombre;
    public abstract String getDescription();

    //constructor
    public Persona(String nombre){
        this.nombre = nombre;
    }
    //getters
    public String getNombre() {
        return nombre;
    }
}
