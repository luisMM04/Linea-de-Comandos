import javax.swing.*;

public class comandos {
    public static void main(String[] args) {
        System.out.println("Valores dados : ");
        for (int i = 0; i < args.length ; i++) {
            System.out.println("["+args[i]+"]");
        }
        System.out.println("\n");

        int valores[]= new int[args.length];
        int[] arregloTemp=new int[args.length];
        for (int i = 0; i < args.length; i++) {
            valores [i]= Integer.parseInt(args[i]);
            arregloTemp [i]=Integer.parseInt(args[i]);
        }
        int valorIncial=0;
        System.out.println("Suma prefija : ");
        int contador= 0;

        for (int i = 0; i < args.length; i++) {
            contador ++;
            valorIncial +=valores[i];

            System.out.println(valorIncial);
           /*if (valorX==valorIncial){
                respuesta="se llego al valor de X en la suma hasta la posicion del arreglo ["+contador+"]";
            }*/

        }
        System.out.println();
        System.out.println();
        int valorX= valores[0];
        String respuesta=" ";
        for (int i = 0; i < args.length ; i++) {
            for (int j = 0; j < args.length ; j++) {
                int num=(valores[i]+arregloTemp[j]);

                if (num==valorX){
                    respuesta = "los valores que suman: " + valorX + " son: " + valores[i] + " y " + arregloTemp[j];
                    break;
                }else{
                    respuesta="no hay 2 valores q sumen "+valorX;

                }

            }


        }

        System.out.println(respuesta);

       // System.out.println();



    }
}
