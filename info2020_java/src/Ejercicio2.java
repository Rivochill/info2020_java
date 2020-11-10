import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;

        System.out.println("Ingrese tres numeros: ");
        
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        
        System.out.println("El primer numero es: "+ num1);
        System.out.println("El segundo numero es: "+ num2);
        System.out.println("Y el tercer numero es: "+ num3);
    }

}
