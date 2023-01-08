public class ejemploArray2D {

    public static void main(String[] args){

        double acumulado,interes=0.10;

        double[][] saldo = new double[6][5];

        for(int i= 0; i<6; i++){
            //la primera fila se llena con 10000
            saldo[i][0] = 10000;
            acumulado = 10000;

            for(int j = 1; j<5; j++){
                acumulado=acumulado+(acumulado*interes);
                saldo[i][j] = acumulado;
            }
            interes+=0.01;
        }

        for(int z=0;z<5;z++){
            System.out.println();
            for(int h=0;h<6;h++){
                System.out.printf("%1.2f ", saldo[h][z]);
            }
        }

    }
}
