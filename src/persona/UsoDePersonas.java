package persona;

public class UsoDePersonas {

    public static void main(String[] args){

        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado("Juan Marcet", 5000, 2001, 2, 25);
        lasPersonas[1] = new Alumno("Pau Sang", "contabilidad");

        //getDescription es remplazado por el método correspondiente en cada objeto
        for(Persona p:lasPersonas){
            System.out.println(p.getNombre()+"\n"+p.getDescription()+"\n\n");
        }

    }
}
