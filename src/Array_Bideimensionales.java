public class Array_Bideimensionales {

    public static void main(String[] args){
        //tipo de dato... [][]... nombre ,.....new tipo.... tama;o -----> declaracion
        //matriz i, j i filas, j columnas
        int [][] matrix = new int[4][5];
        int i, j;

        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                matrix[i][j] = (int)(Math.round(Math.random()*10));
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }System.out.print("\n\n");

        //bucle for each para recorrer un array bidemensiona, el premer elemento para recorres en tipo int array -> int[] por qu el
        //primer elemnto a rrecorrer es una array
        for(int[]fila:matrix){
            //aqui se recorre individualmente el array dentro del array matrix
            for(int z:fila){
                System.out.print(z + "  ");
            }
            System.out.print("\n");
        }



    }
}
