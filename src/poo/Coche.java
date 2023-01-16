package poo;

//para una sintaxis más cómoda nombrar la clase con mayúsculas la primera letra
public class Coche {
//vamos a realizar la encapsulation
    final private int ruedas;
    final private int largo,ancho;
    final private int motor;
    final private int peso_Plataforma;

// estas pueden variar
    private String color;
    //private int peso_total;
    private boolean asientosCuero;
    //private boolean climatizador
    private boolean climatizador;

    private int pesoTotal;

    //método constructor
    public Coche(){
        ruedas = 4;
        largo = 300;
        ancho = 150;
        motor = 1600;
        peso_Plataforma = 500;
    }
    // public para acceder a este método desde otras clases
    // String por el tipo de dato que va a devolver, en este caso necesito una frase
    //nombre del método getter
    public String dime_largo(){
        //return obligatorio para una función getter
        //en esta clase, la variable largo se puede usar sin restricciones
        return "El largo del coche es " + largo;
    }
//métodos getters
    public String dime_ancho(){
        return "El ancho del coche es " + ancho;
    }
    public String dime_ruedas(){
        return "El coche tiene " + ruedas + " ruedas.";
    }
    public String dime_peso_Plataforma(){
        return "El coche pesa " + peso_Plataforma + " kg.";
    }
    public String dime_motor(){
        return "El motor del coche es de " + motor + " .";
    }
    public String dime_color(){
        return "El color del coche es " + color + " .";
    }
    public String dimeDatosGenerales(){
        return "El coche tiene un motor de capacidad " + motor + ", un largo de " +
                largo + " y ancho de "+ancho+". Con "+ruedas+" ruedas y pesa "+peso_Plataforma+
                ".";
    }
    public String dimeAsientos(){
        if (asientosCuero){
            return "Tiene asientos de cueros";
        }else{
            return "NO tiene asientos de cuero";
        }
    }

    //métodos setters
    //public para acceder desde otras clases, void por que no devuelve nada, no necesita return

    public void establece_color(String colorEntrante){
        color = colorEntrante;
    }

    public void configuraAsientos(String asientosCuero){
        //simplificación del if else pues el método equals devuelve un boolean
        this.asientosCuero = asientosCuero.equalsIgnoreCase("si");
    }

    public void configuraClimatizador(String climatizador){
        this.climatizador = climatizador.equalsIgnoreCase("si");
    }
    //a continuación detallo una función setter y getter a la vez.. NO SE RECOMIENDA SU USO
    public String dimePesoCoche(){
        int pesoCarroceria =500;

        pesoTotal += pesoCarroceria;
        //si hay asientos de cuero se suma 50
        if (asientosCuero){
            pesoTotal += 50;
        }
        if(climatizador){
            pesoTotal += 20;
        }

        return "El peso de coche es "+pesoTotal;
    }

    //este es GETTER
    public int precioCoche(){
        int precioFinal = 10000;
        if(asientosCuero){
            precioFinal += 2000;
        }
        if(climatizador)precioFinal += 1500;

        return precioFinal;
    }



}
