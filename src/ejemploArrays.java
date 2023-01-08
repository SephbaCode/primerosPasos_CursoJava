public class ejemploArrays {

    public static void main(String[] args){

        //definicion de un array de tipo entero con longitud 5
        int[] array = new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;

        //definicion de un array definiendo el array en el acto
        int[] array2 = {1,2,3,4,5,6};

        int i;

        //array.lenght se puede usar para obtener la longitud del array
        //si usamos un bucle for para recorrerlo obtenemos

        //version simplificade de for(int i = 0; i<array.lenght; i++)
        //version del for simplificada para un comandp

        for(i=0; i<array.length; i++) System.out.print(array[i] + " ");
        System.out.print('\n');

        for(i=0; i<array2.length; i++) System.out.print(array2[i] + " ");


    }
}
