package usoModificadorFinalStatic;

public class EmpleadoSimple {

    private final String name;  //MUY IMPORTANTE PUES ASEGURA QUE NADIE NI NADA MODIFICARA EL VALOR
    private String departamento;
    private final int Id; //final para no modificar el id de ninguna forma (diferente para cada objeto)
    private static int IdSiguiente = 1; //guarda el siguiente id a usarse y es único para todos los objetos

    public EmpleadoSimple(String name){
        this.name=name;
        departamento = "Administración";
        //para respetar la encapsulation
        //de esta forma la variable que se guarda única vez para todos los objetos es él
        //id siguiente por los que él, id que se almacena en cada objeto es distinto a los démas y está en orden
        Id = IdSiguiente;
        IdSiguiente++;
    }
    //setter
    public void cambiaDepa(String departamento){
        this.departamento = departamento;
    }

    public String getInfo() {
        return "El empleado "+name+" esta en "+departamento+" con id "+Id+".";
    }

    //este método es static porque no interact con ninguna instancia especial de objeto
    public static String dameIdSiguiente(){
        return "El id siguiente es "+IdSiguiente+".";
    }
}
