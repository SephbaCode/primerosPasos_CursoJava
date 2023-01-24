import java.util.*;
public class clasesEnumeradas {

    enum Waifu {
        Rias("01"), Rem("02"), Hu_Tao("03");
        private String code;
        private Waifu(String code){
            this.code = code;
        }
        //getter
        public String getCode(){
            return code;
        }
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una waifu:(posiblididades)");
        String entrada_waifu = entrada.next();

        Waifu laWaifu = Enum.valueOf(Waifu.class, entrada_waifu);

        System.out.println("Waifu = "+laWaifu+". Codigo = "+laWaifu.getCode());

    }
}
