package poo;

public class Furgoneta extends Coche {
    //convierte a la clase coche en superclase y furgoneta en sub clase
    //hemos aplicado herencia para furgoneta
    //Java NO ADMITE HERENCIA MULTIPLE

    private final int capacidadCarga;
    private final int plazasExtra;

    public Furgoneta(int plazasExtra, int capacidadCarga){
        super();    //llama al constructor de la superclase para darle un estado
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra=plazasExtra;
    }

    public String dimeDatosFurgoneta(){
        return "la capacidad de carga es "+capacidadCarga+" y las plazas extras son "+plazasExtra+".";
    }

}
